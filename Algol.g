grammar FINAL;
options{ k=1;
language= Java;
output=AST;
ASTLabelType=CommonTree; 
backtrack= false;
} 

// Tu as réglé le problème des ifs et des for. On peut mettre deux type de noueud pour une règle(pense bête pour les identifiants qui te font chier) next step arranger les declaration(car mélanger avce les compoudnet finier les declaration de fonction)


tokens{
SPECIFICATION ;
LISTFOR;
LABEL;
PARENTHESE;
CALL;
BORNE=':';
ASSIGENMENT;
FORLISTELEMENT;
BLOCK;
TYPE;
LOCAL;
SWITCH='SWITCH';
DEC;
BEGIN='BEGIN';
IF='IF';
THEN='THEN';
LISTARG;
//COMMENT='COMMENT';
EQV='EQUIV';
LESS='LESS';
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
GOTO='GOTO';
ELSE='ELSE';
THEN='THEN';
PROG='PROG';
AND='AND';
OR='OR';
ARRAYACCESS;
ACCESS;
}

@members{
 CommonTree Idmemoire;
}

///// pour combler le souci des forelement j'ai mis un identifer pour que lui s'occupe des liste d'identifier et q'un autre s'occupe de


/// cheching de expression et mise en place des opérations
prog	:	prog1 ->^(PROG prog1)
	;
	
	
expression
	:	simpleAR ->simpleAR
	 | 'IF' expression 'THEN' simpleDesign 'ELSE' expression->^('IF' expression ^('THEN' simpleDesign ^('ELSE' expression)))
	;
	
ei	:	simpleDesign 'ELSE'

	;
	
	
simpleAR:	simpleLOG(':='^ simpleLOgi2)*
	;
	
simpleLOG
	:	simpleLOgi22('EQUIV'^ simpleLOgi22)*
	;
	
simpleLOgi22
	:	simpleLOgi2('IMPL'^ simpleLOgi2)*
	;
	
simpleLOgi2
	:	simpleLOgi(('AND'^|'OR'^|'NOT'^)simpleLOgi)*
	;
	
simpleLOgi
	:	simpleARi(('GREATER'¨^|'LESS'^|'EQUAL'^|'NOTLESS'^|'NOTGREATER'^|'NOTEQUAL'^)simpleARi)*
	;
	
simpleARi:	multExp(('+'^|'-'^) multExp)*
	;

multExp:	multExp22(('*'^|'/'^)multExp22)*
	;
	

	
multExp22 :	powExp('POW'^ powExp)*
	;
	
powExp	:	//ID (->ID) {Idmemoire=$powExp.tree;} beginwithID->beginwithID//actualparametrepart
         |'(' expression ')'->expression
         |INT
         |STRING
         |'FALSE'
         |'TRUE'
          |FLOAT
         |ID (->ID) {Idmemoire=$powExp.tree;} beginwithID->beginwithID
	;
	
	
beginwithID
	:	(->{Idmemoire}) actualparametrepart->actualparametrepart
	|(->{Idmemoire})
	|(->{Idmemoire})'['expression (',' expression ')'?)*']'->^(ARRAYACCESS  $beginwithID expression+)   
        //|(->{Idmemoire})
	;
	

	
expression2
	:	simpleAR2 | 'IF' expression 'THEN' ei
	;
	
//ei2	:	simpleDesign 'ELSE'
	//;
	
simpleAR2:	infixLog(':='^ infixLog)*
	;

infixLog
	:	simpleARi2(('OR'^|'AND'^)simpleARi2)*
	;
	
simpleARi2:	multExp33(('+' ^| '-'^) multExp33)*
	;
	
multExp33
	:	multExp2(('*' ^| '/'^) multExp2 )*
	;
	
multExp2	:	powExp2('POWER'^ powExp2)*
	;
	
powExp2	:
         | ID (->ID) {Idmemoire=$powExp2.tree;} beginwithID -> beginwithID
         |INT->INT
         |STRING
         | '(' expression2 ')'-> expression2
	;
	
identifier
	:	ID (->ID) {Idmemoire=$identifier.tree;} o->o
	|INT
	;
	
o	:	(->{Idmemoire})INT->^(INT)
                |(->{Idmemoire})'['expression (',' expression)*']'->^(ARRAYACCESS  $o expression+)   
                |(->{Idmemoire})
	;
	
            
          
               // |'[' INT le arrayseg on peut remplacer cela par un id
	
d	:	declaration ';' (declaration ';')* compoundT->^(DEC declaration)+ ^(BLOCK compoundT)
	|	compoundT->^(BLOCK compoundT)
	;

prog1	:	  begin EOF->begin
                 |(label ':')+ begin->^(LABEL label+ begin)
                 ;
                 
                 


localorown
	:	type|'OWN' type
	;

type	:	'REAL'
                |'INTEGER'
                |'BOOLEAN'
	;
	
typeliste
	:	identifier (',' identifier)*->(identifier)+
	;
	
//t	:	','typeliste
	//|	
	//;

arraylist
	:	arrayseg(','arrayseg)* ->(arrayseg)*//a
	;

//a	:	',' arrayseg a
	//|	
	//;

arrayseg:	ID (->ID) {Idmemoire=$arrayseg.tree;} r-> r
                     ;//plus besoin de ça

r	:	(->{Idmemoire})'[' boundplist']'-> $r boundplist
	|	(->{Idmemoire})',' arrayseg->arrayseg
	;
	
//arrayseg2
	//:	ID(','ID)* ('[' boundp (',' boundp)*']')*
	//;
	
boundplist
	:	boundp (',' boundp)*->(boundp)+
	;
	
//z	:	',' boundp z
	//|	
	//;
boundp	:	simpleARi ':' simpleARi->^(BORNE simpleARi simpleARi)
	;
	

typedeclaration: typeliste
|'ARRAY' arraylist->^('ARRAY' arraylist)
|procedure->procedure
;


typedeclaration2:'ARRAY' arraylist->^('ARRAY' arraylist)
|procedure->procedure
;

switchdec
	:	'SWITCH' identifier ':=' switchlist->^('SWITCH' ^(ASSIGENMENT identifier switchlist)) 
	;
	
switchlist
	:	 designExp (','designExp)*->designExp+;

//s	:	 ',' designExp s
	//|	
	//;
 procedure: 'PROCEDURE' procedurehead statement->^('PROCEDURE' procedurehead statement)
 	;
 	
 procedurehead
 	: identifier formalparameterpart ';' valuepart specificationpart->identifier formalparameterpart valuepart specificationpart
 	;
 
formalparameterpart : 
        | '(' formalparameterlist ')' (ID ':''(' formalparameterlist ')')*->^(LISTPARA formalparameterlist ^(ID formalparameterlist)*)
	;
	

//specificationpart
//	:	specificationpart1| specifier identifier ',' specificationpart1
	//; 
	
specificationpart
	:specifier identifierlist ';' (specifier identifierlist ';')*->^(SPECIFICATION (specifier identifierlist)+)
	//|
	;
	
identifierlist
	:	identifier (','identifier)*->identifier+
	;
	
specifier
	:'STRING' 
	| type  h->type
	| 'ARRAY' 
	| 'LABEL' 
	
	| 'SWITCH' | 'PROCEDURE'
	;
	
h	:	| 'ARRAY'| 'PROCEDURE'|'INTEGER'
	;
	
formalparameterlist
	:	formalpara (',' formalpara)*->formalpara+
	;
	
/*g	:	paralim formalpara g
	|	
	;*/

formalpara
	:	expression2->expression2
	;

//paralim	:	','
          //| '('  ':' '('
	//;
	
valuepart :'VALUE' identifier2->^('VALUE' identifier2)
          |
;

identifier2
	:	ID(','ID)*->ID*
	;
	
 	
designExp
	:	simpleDesign
	|'IF' expression 'THEN' simpleDesign 'ELSE' designExp
	;
	
simpleDesign
	:	
	|identifier 
	|'(' designExp ')'
	;

	
//ifclause:	 'IF' expression 'THEN'->^(IF expression THEN)
//        ;
                 
declaration
	:	localorown typedeclaration
	            | typedeclaration2->typedeclaration2
	            |switchdec->switchdec
	;
begin	:	'BEGIN' d->^(BEGIN d)
        ;

	
compoundT
	: statement c->statement c
	;
c	:	 'END'->'END'|';' compoundT->compoundT
	;
	
statement
	:	//identifier (':=' simpleAR)?(':'m)?-> (^(':='identifier simpleAR)?)?(^(':'m))?(actualparametrepart)?
	 //ID(->ID) {Idmmoire=$statement.tree;} rs-> rs
	 memoire->memoire
	|gotostatement->gotostatement
	|comment
	|'IF' expression 'THEN' j->^(IF expression ^(THEN j))
	|'FOR' simpleARi ':=' forlist 'DO' statement->^(FOR ^(ASSIGENMENT simpleARi ^(LISTFOR forlist)) ^('DO' statement))
	|begin->begin
	|actualparametrepart
	;
	
memoire	:ID(->ID) {Idmemoire=$memoire.tree;} rs-> rs
	;
	
comment	:COMMENT2
	;
	
rs	:	(->{Idmemoire})':=' simpleAR->^(ASSIGENMENT $rs simpleAR)
	|	actualparametrepart2
	|(->{Idmemoire})'['expression (',' expression)*']' ':=' simpleAR->^(ASSIGENMENT ^(ARRAYACCESS  $rs expression+) simpleAR)   
        //|(->{Idmemoire})
	|	(->{Idmemoire})':' m -> m//avant ici j'ai mi ':' (label ':')* st
	;
	
m	:	(->{Idmemoire}) label2/*{Idmemoire=$m.tree;} *//*v*/->^(LABEL $m label2)//':' m
	|(->{Idmemoire})gotostatement->^(LABEL $m gotostatement)
	|comment
	| (->{Idmemoire})'IF' expression 'THEN' j->^(LABEL $m ^(IF expression ^(THEN j)))
	|(->{Idmemoire})'FOR' simpleARi ':=' forlist 'DO' statement->^(LABEL $m ^(FOR ^(ASSIGENMENT simpleARi forlist) ^('DO' statement)))
	|(->{Idmemoire})begin->^(LABEL $m begin)
	//|(->{Idmemoire})':='  simpleAR->^(LABEL $m begin)
	|(->{Idmemoire})actualparametrepart2
	|':'m->m
	
	;
	

label:	         ID  
                 |INT
                ;
                
label2	:	ID(->ID) {Idmemoire=$label2.tree;} v->v
               |INT
	;
	
	
	
v	:	(->{Idmemoire})':='  simpleAR->^(':=' $v simpleAR)
	    | actualparametrepart2
	    |':'m->m
          //|cc;
          ;

//st	:identifier// cc
//          | gotostatement
 //         |'IF' expression 'THEN' j
 //         | 'FOR' simpleARi ':=' forlist 'DO' statement
	//;

	
//forclause
	//:	'FOR' simpleARi ':=' forlist 'DO'
	//;
	
forlist	:
               forlistelement (','forlistelement)*->^(FORLISTELEMENT forlistelement)+
	;
	
	
forlistelement
	:expression q//->  simpleARi q
	;
          
q	:|'STEP'simpleARi 'UNTIL'expression->^('STEP' simpleARi ^('UNTIL' expression))
         |'WHILE'expression ->^('WHILE' expression)
           ;
          
k	:	'ELSE' statement->^('ELSE' statement)
                |
	;

	
y	:	identifier //cc
	|	gotostatement
	|begin
	|
	;

	
j	:	  'FOR' simpleARi ':=' forlist 'DO' statement-> ^('FOR'  ^(':=' simpleARi forlist) ^('DO' statement))
                  | ID (->ID) {Idmemoire=$j.tree;} r2 -> r2
                  | 
                  |  gotostatement->gotostatement
                  |begin->begin///j'ai enleve vide
	;
	
r2	:	u1 k->u1 k
                |':' w
	;

u1	//cc k
        :	(->{Idmemoire})':='  simpleAR ->^(ASSIGENMENT $u1 simpleAR )
	|	(->{Idmemoire}) actualparametrepart
	;
	
u	//cc k
        :	(->{Idmemoire})':='  simpleAR ->^(ASSIGENMENT $u simpleAR )
	|	(->{Idmemoire}) actualparametrepart 
	|	':' w
	;

w	:	forstatement (label ':')* forstatement
	|	 y k
	;

	//
//;




	
//cc	:	':='  simpleAR->^(':=' simpleAR)
	//|	actualparametrepart
	//; 


actualparametrepart
	:	(->{Idmemoire})'(' actualparalist')' (ID ':''(' actualparalist ')')* ->^(CALL $actualparametrepart actualparalist ^(LISTPARA ID actualparalist)*)
	//|
	;
	
actualparametrepart2
	:	(->{Idmemoire})'(' actualparalist')' (ID ':''(' actualparalist ')')* ->^(CALL $actualparametrepart2 actualparalist ^(LISTPARA ID actualparalist)*)
	|
	;
	
actualparalist
	: actualpara (',' actualpara)*->^(LISTARG actualpara*)
	;
	
/*p
	:	paralim actualpara p
	|
	;*/

actualpara
	:	expression2->expression2
	;
//l	:	leftpart l
 //       |
	//;
	
//leftpart:	identifier ':='
//	;
 
 
gotostatement
	:	'GOTO' designExp-> ^('GOTO' designExp)
	;
	

	
forstatement
	:	'a'
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

//COMMENT
 //   :   'COMMENT ' '\r'? ';' {$channel=HIDDEN;}
 //   ;
    
 
 COMMENT2
    :  .// 'COMMENT ' .*';' {$channel=HIDDEN;}
    /*|*/   'COMMENT' ( options {greedy=false;} : . )* ';' {$channel=HIDDEN;}
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
