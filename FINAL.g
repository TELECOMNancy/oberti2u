grammar FINAL;
options{ k=1;
language= Java;
output=AST;
ASTLabelType=CommonTree; 
backtrack= false;
} 


tokens{
SPECIFICATION ;
LISTFOR;
LABEL;
CALL;
OWN='OWN';
BORNE=':';
ASSIGNEMENT=':=';
FORLISTELEMENT;
BLOCK;
UNTIL='UNTIL';
PAS='STEP';
WHILE='WHILE';
POWER='POWER';
TYPEINT='INTEGER';
TYPEREAL='REAL';
TYPEBOOL='BOOLEAN';
PROCEDURE='PROCEDURE';
IMPL='IMPL';
ACCCESS;
SWITCH='SWITCH';
DEC;
BEGIN='BEGIN';
END='END';
IF='IF';
THEN='THEN';
LISTARG;
EQUIV='EQUIV';
LESS='LESS';
MINUS='-';
PLUS='+';
MULT='*';
DIV='/';
NOT='NOT';
EQUAL='EQUAL';
GREATER='GREATER';
TRUE;
FALSE;
LISTPARA;
FOR='FOR';
DO='DO';
GOTO='GOTO';
ELSE='ELSE';
THEN='THEN';
PROG='PROG';
AND='AND';
OR='OR';
ARRAYACCESS;
ARRAY='ARRAY';
ACCESS;
VALUE;
NOTLESS;
NOTGREATER;
NOTEQUAL;
}

@members{
 CommonTree Idmemoire;
}

prog	:	prog1 ->^(PROG prog1)
	;
	
prog1	:	  begin EOF->begin
                 |(label ':')+ begin->^(LABEL label+ begin)
                 ;
                 
begin	:	'BEGIN' block->^(BEGIN block)
        ;
                 
 block	:	declaration ';' (declaration ';')* compoundT->^(DEC declaration)+ ^(BLOCK compoundT)
	|	compoundT->^(BLOCK compoundT)
	;
	
declaration
	:	localorown typedeclaration
	            | typedeclaration2->typedeclaration2
	            |switchdec->switchdec
	;
	
localorown  :	type|OWN type
	;

type	:	TYPEREAL
                |TYPEINT
                |TYPEBOOL
	;
	
typeliste      :	identifier (',' identifier)*->(identifier)+
	;

arraylist      :	arrayseg(','arrayseg)* ->(arrayseg)*
	;

arrayseg:	ID (->ID) {Idmemoire=$arrayseg.tree;} arrayConstructor-> arrayConstructor
                     ;

arrayConstructor	:	(->{Idmemoire})'[' boundplist']'-> $arrayConstructor boundplist
	|	(->{Idmemoire})',' arrayseg->arrayseg
	;
	
boundplist
	:	boundp (',' boundp)*->(boundp)+
	;
	
boundp	:	simpleAr ':' simpleAr->^(BORNE simpleAr simpleAr)
	;
	

typedeclaration: typeliste
|'ARRAY' arraylist->^(ARRAY arraylist)
|procedure->procedure
;

//typeliste donne des Ids, compoundT donne également des Ids ce qui pourrait créer un conflit dans la règle declaration. Pour résoudre ce problème, on créé une règle typedeclaration2 qui empêche de déclarer quelque chose sans avoir mis un type auparavant
typedeclaration2:'ARRAY' arraylist->^(ARRAY arraylist)
|procedure->procedure
;

switchdec
	:	'SWITCH' identifier ':=' switchlist->^(SWITCH ^(ASSIGNEMENT identifier switchlist)) 
	;
	
switchlist
	:	 designExp (','designExp)*->designExp+
	;

 procedure: 'PROCEDURE' procedurehead statement->^(PROCEDURE procedurehead statement)
 	;
 	
 procedurehead
 	: identifier formalparameterpart ';'! valuepart specificationpart//->identifier formalparameterpart valuepart specificationpart
 	;
 
formalparameterpart : 
        | '(' formalparameterlist ')' (ID ':''(' formalparameterlist ')')*->^(LISTPARA formalparameterlist (formalparameterlist)*)
	;
	
specificationpart
	:specifier identifierlist ';' (specifier identifierlist ';')*->^(SPECIFICATION (specifier identifierlist)+)
	;
	
identifierlist
	:	identifier (','identifier)*->identifier+
	;
	
specifier
	:STRING 
	| type  specifierType->type
	| ARRAY
	| LABEL
	| SWITCH 
	| PROCEDURE
	;
	
specifierType	:	
	| ARRAY
	| PROCEDURE
	;
	
formalparameterlist
	:	formalpara (',' formalpara)*->formalpara+
	;

formalpara
	:	expression2->expression2
	;
	
valuepart :'VALUE' identifier2 ';'->^(VALUE identifier2)
          |
	;

identifier2   :	ID(','ID)*->ID*
	;
	
expression
	:	simpleOp ->simpleOp
	 | 'IF' expression 'THEN' simpleDesign 'ELSE' expression->^(IF expression ^(THEN simpleDesign ^(ELSE expression)))
	;
	
//Gestion des expressions logiques avec priorité des opérateurs

simpleOp:	simpleLogEquiv(ASSIGNEMENT^ simpleLogAndOr)*
	;
	
simpleLogEquiv
	:	simpleLogImplication(EQUIV^ simpleLogImplication)*
	;
	
simpleLogImplication
	:	simpleLogAndOr(IMPL^ simpleLogAndOr)*
	;
	
simpleLogAndOr
	:	simpleLog((AND^|OR^)simpleLog)*
	;
	
simpleLog
	:	simpleAr((GREATER^|LESS^|EQUAL^|NOTLESS^|NOTGREATER^|NOTEQUAL^)simpleAr)*
	;
	
//Gestion des expressions arithmétiques et logiques avec priorité des opérateurs
	
simpleAr:	multExp((PLUS^|MINUS^) multExp)*
	;

multExp:	multExpPower((MULT^|DIV^)multExpPower)*
	;
	
multExpPower : atom(POWER^ atom)*
	;
	
atom	:
         |'(' expression ')'->expression
         |INT
         |STRING
         |FALSE
         |TRUE
         |NOT^ atom
          |FLOAT
         |ID (->ID) {Idmemoire=$atom.tree;} beginwithID->beginwithID
	;
	
beginwithID:(->{Idmemoire}) actualparametrepart->actualparametrepart
	|(->{Idmemoire})
	|(->{Idmemoire})'['expression (',' expression ')'?)*']'->^(ARRAYACCESS  $beginwithID ^(ACCCESS expression+))   
	;
	
//Gestion des expressions arithmétiques (sans opérations logiques)
	
expression2
	:	simpleARi2 
	| 'IF' expression 'THEN' simpleDesign 'ELSE' expression2 ->^(IF expression ^(THEN simpleDesign) ^(ELSE expression2))
	;
	
simpleARi2   :	multExp2((PLUS ^| MINUS^) multExp2)*
	;
	
multExp2    :	multExpPower2((MULT ^| DIV^) multExpPower2 )*
	;
	
multExpPower2:	atom2(POWER^ atom2)*
	;
	
atom2	:
         | ID (->ID) {Idmemoire=$atom2.tree;} beginwithID -> beginwithID
         |INT->INT
         |STRING
         | '(' expression2 ')'-> expression2
	;
	
identifier
	:	ID (->ID) {Idmemoire=$identifier.tree;} beginwithID2->beginwithID2
	|INT
	;
	
beginwithID2	:	(->{Idmemoire})INT->^(INT)
                |(->{Idmemoire})'['expression (',' expression)*']'->^(ARRAYACCESS  $beginwithID2 ^(ACCCESS expression+))   
                |(->{Idmemoire})
	;
 	
designExp   :	simpleDesign
	|'IF' expression 'THEN' simpleDesign 'ELSE' designExp ->^(IF expression ^(THEN simpleDesign) ^(ELSE designExp))
	;
	
simpleDesign:	
	|identifier 
	|'(' designExp ')'
	;
	
compoundT
	: statement compoundTFacto->statement compoundTFacto
	;
	
compoundTFacto	:	 'END'->END| ';' compoundT->compoundT
	;
	
statement
	:memoire->memoire
	|gotostatement->gotostatement
	|comment
	|'IF' expression 'THEN' instructionsIf (options {greedy=true;} :'ELSE' statement)?->^(IF expression ^(THEN instructionsIf) ^(ELSE statement)?)
	|'FOR' simpleAr ':=' forlist 'DO' statement->^(FOR ^(ASSIGNEMENT simpleAr ^(LISTFOR forlist)) ^(DO statement))
	|begin->begin
	|actualparametrepart
	;

memoire	:ID(->ID) {Idmemoire=$memoire.tree;} statementWithID-> statementWithID
	;
	
comment	:COMMENT2
	;
	
statementWithID	:	(->{Idmemoire})':=' simpleOp->^(ASSIGNEMENT $statementWithID simpleOp)
	|	actualparametrepart2
	|(->{Idmemoire})'['expression (',' expression)*']' ':=' simpleOp->^(ASSIGNEMENT ^(ARRAYACCESS  $statementWithID ^(ACCCESS expression+)) simpleOp)   
	|	(->{Idmemoire})':' statementWithLabel -> statementWithLabel
	;
	
statementWithLabel	:	(->{Idmemoire}) label2->^(LABEL $statementWithLabel label2)
	|(->{Idmemoire})gotostatement->^(LABEL $statementWithLabel gotostatement)
	|comment
	| (->{Idmemoire})'IF' expression 'THEN' instructionsIf->^(LABEL $statementWithLabel ^(IF expression ^(THEN instructionsIf)))
	|(->{Idmemoire})'FOR' simpleAr ':=' forlist 'DO' statement->^(LABEL $statementWithLabel ^(FOR ^(ASSIGNEMENT simpleAr forlist) ^(DO statement)))
	|(->{Idmemoire})begin->^(LABEL $statementWithLabel begin)
	|(->{Idmemoire})actualparametrepart2
	|':'statementWithLabel->statementWithLabel
	
	;
	

label:	         ID  
                 |INT
                ;

label2	:	ID(->ID) {Idmemoire=$label2.tree;} statementLabelLoop->statementLabelLoop
               |INT
	;
	
statementLabelLoop	:	(->{Idmemoire})':='  simpleOp->^(ASSIGNEMENT $statementLabelLoop simpleOp)
	    | actualparametrepart2
	    |':'statementWithLabel->statementWithLabel
          ;
	
forlist	: forlistelement (','forlistelement)*->^(FORLISTELEMENT forlistelement)+
	;
	
forlistelement:expression typeFor
	;
          
typeFor	:|'STEP'simpleAr 'UNTIL'expression->^(PAS simpleAr ^(UNTIL expression))
         |'WHILE'expression ->^(WHILE expression)
           ;
	
instructionsIfWithLabel	:	 ID (->ID) {Idmemoire=$instructionsIfWithLabel.tree;} expressionWithId->expressionWithId//cc
	|	(->{Idmemoire}) gotostatement->^(LABEL $instructionsIfWithLabel gotostatement)
	|(->{Idmemoire})begin->begin
	| 'FOR' simpleAr ':=' forlist 'DO' statement -> ^(FOR  ^(ASSIGNEMENT simpleAr forlist) ^(DO statement))
	|
	;
	
instructionsIf	:	  'FOR' simpleAr ':=' forlist 'DO' statement -> ^(FOR  ^(ASSIGNEMENT simpleAr forlist) ^(DO statement))
                  | ID (->ID) {Idmemoire=$instructionsIf.tree;} instructionsIfWithID -> instructionsIfWithID 
                  |  gotostatement ->gotostatement 
                  |begin ->begin
                  |
	;
	
instructionsIfWithID	:	(->{Idmemoire})expressionWithId ->expressionWithId 
                |':' instructionsIfLabelLoop->instructionsIfLabelLoop
	;

expressionWithId	 :	(->{Idmemoire})':='  simpleOp ->^(ASSIGNEMENT $expressionWithId simpleOp )
	|	(->{Idmemoire}) actualparametrepart2
	;

instructionsIfLabelLoop	:(->{Idmemoire}) instructionsIfWithLabel ->instructionsIfWithLabel 
	|':' instructionsIfLabelLoop->instructionsIfLabelLoop
	;

actualparametrepart
	:	(->{Idmemoire})'(' actualparalist')' (ID ':''(' actualparalist ')')* ->^(CALL $actualparametrepart actualparalist ^(LISTPARA ID actualparalist)*)
	;
	
//Cette règle donne le mot vide pour éviter des conflits
actualparametrepart2
	:	(->{Idmemoire})'(' actualparalist')' (ID ':''(' actualparalist ')')* ->^(CALL $actualparametrepart2 actualparalist ^(LISTPARA ID actualparalist)*)
	|
	;
	
actualparalist
	: actualpara (',' actualpara)*->^(LISTARG actualpara*)
	;
	
actualpara
	:	expression2->expression2
	;
 
gotostatement
	:	'GOTO' designExp-> ^(GOTO designExp)
	;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;
    
 COMMENT2
    : 'COMMENT' ( options {greedy=false;} : . )* ';' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
