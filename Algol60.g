grammar AL;
options{ k=1;
language= Java;
output=AST;
ASTLabelType=CommonTree; 
backtrack= false;
} 


tokens{
TYPE;
LOCAL;
SWITCH;
DEC;
BEGIN;
IF;
THEN;
COMMENT;
EQV;
LESS;
PLUS;
PLUS;
MULT;
DIV;
NOT;
EQ;
GREATER;
TRUE;
FALSE;
FOR;
IF;
GOTO;
ELSE;
THEN;
PROG;
}

///// pour combler le souci des forelement j'ai mis un identifer pour que lui s'occupe des liste d'identifier et q'un autre s'occupe de


/// cheching de expression et mise en place des opérations
prog	:	prog1 ->^(PROG prog1)
	;
	
expression
	:	simpleAR | ifclause ei
	;
	
ei	:	simpleDesign 'ELSE'
	;
	
simpleAR:	simpleARi(':='^ simpleARi)*
	;
	
simpleARi:	multExp(('+' ^| '-'^) multExp)*
	;
	

	
multExp	:	powExp('POW'^ powExp)*
	;
	
powExp	:	identifier actualparametrepart//->^(identifier actualparametrepart)
         |'(' expression ')'
         |INT
         |
	;
	

	
expression2
	:	simpleAR2 | ifclause ei
	;
	
ei2	:	simpleDesign 'ELSE'
	;
	
simpleAR2:	simpleARi2(':=' simpleARi2)*
	;
	
simpleARi2:	multExp2(('+' ^| '-'^) multExp2)*
	;
	

	
multExp2	:	powExp2('POW'^ powExp2)*
	;
	
powExp2	:
         | identifier
         |INT
	;
	
identifier
	:	ID o
	;
	
o	:	INT
                |'[' expression (',' expression)*']'
                |
	;

                
               // |'[' INT le arrayseg on peut remplacer cela par un id
	
d	:	declaration ';' (declaration ';')* compoundT->^(DEC declaration compoundT)+
	|	compoundT->^(compoundT)
	;

prog1	:	  begin EOF->^(BEGIN begin)
                 |(label ':')+ begin->^(BEGIN begin)
                 ;
label	:	 identifier
                ;

localorown
	:	type|'OWN' type
	;

type	:	'REAL'|'INTEGER'|'BOOLEAN'
	;
	
typeliste
	:	identifier t;
	
t	:	','typeliste
	|	
	;

arraylist
	:	arrayseg2 a
	;

a	:	',' identifier a
	|	
	;

//arrayseg:	identifier r;//plus besoin de ça

//r	:	'[' boundplist']'
	//|	',' arrayseg
	//;
	
arrayseg2
	:	(identifier ',') ID '[' boundplist ']'
	;
	
boundplist
	:	boundp z
	;
	
z	:	',' boundp z
	|	
	;
boundp	:	simpleARi ':' simpleARi
	;
	

typedeclaration: typeliste
|'ARRAY' arraylist
|procedure
;


typedeclaration2:'ARRAY' arraylist
|procedure
;

switchdec
	:	'SWITCH' identifier ':=' switchlist
	;
	
switchlist
	:	 designExp s;

s	:	 ',' designExp s
	|	
	;
 procedure: 'PROCEDURE' procedurehead statement
 	;
 	
 procedurehead
 	: identifier formalparameterpart ';' valuepart specificationpart
 	;
 
formalparameterpart : | '(' formalparameterlist ')' (STRING':''('formalparameterlist')')*
	;
	

//specificationpart
//	:	specificationpart1| specifier identifier ',' specificationpart1
	//; 
	
specificationpart
	:specifier identifierlist ';' specificationpart
	|
	;
	
identifierlist
	:	identifier (','identifier)*
	;
	
specifier
	:'STRING' | type  h| 'ARRAY' | 'LABEL' | 'SWITCH' | 'PROCEDURE'
	;
	
h	:	| 'ARRAY'| 'PROCEDURE'
	;
	
formalparameterlist
	:(formalpara paralim)*
	;
	
	
	
g	:	paralim formalpara g
              | 
	;

formalpara
	:	ID
	;

paralim	:	','//
                
	;
	
valuepart :'VALUE' identifier 
;
	
 	
designExp
	:	simpleDesign
	|ifclause simpleDesign 'ELSE' designExp
	;
	
simpleDesign
	:	 identifier
	|'(' designExp ')'
	;
	
//g2	:	|'['
	//;
	
	
ifclause:	 'IF' expression 'THEN'->^(IF expression THEN)
        ;
                 
declaration
	:	localorown typedeclaration->^(LOCAL)
	            | typedeclaration2->^(TYPE)
	            |switchdec->^(SWITCH) 
	;
begin	:	'BEGIN' d->^('BEGIN' d)
        ;

//d	:	declaration ';' (declaration ';')* compoundT->^(DEC declaration)+
	//|	compoundT->^(compoundT)
	//;
	
//d	:declaration ';' f
	//|	compoundT
//	;
	
//d	:	localorown typedeclaration ';' f
         //| identifier di
        // |'ARRAY' arraylist ';'f
         //|procedure ';' f
        // |switchdec ';' f
        // | identifier rs 'END' 
        // |identifier rs ';' compoundT 
	//;

/*di	:	',' (identifier ',')* ';' f
	|  ':' m c
	|':='  simpleAR c
	|	'(' actualparametrepart ')' c
	|';' f
	| 'END'
	;
	
*/
	
//dii	:	compoundT 
//             | declaration ';' compoundT
	//;
	
	
//e	:	';' f
	//;
/*	
f	:	localorown typedeclaration ';' f //(prendre l'initiative de boucler ici sur d
         | identifier fi
         |'ARRAY' arraylist ';'compoundT
         |procedure ';' compoundT
         |switchdec ';' compoundT
         |
        // | identifier rs 'END' 
        // |identifier rs ';' compoundT 
	;
	
	
*/

/*fi	:	',' (identifier ',')* ';' compoundT
	|  ':' m c
	|':='  simpleAR c
	|	'(' actualparametrepart ')' c
	|';' compoundT
	| 'END'
	
	;
	
	*/
	
//f	:	declaration ';' compoundT
	//|	compoundT
	//;
	
	
	///ps ce que tu as fais c'est de la merde devant typeliste c'est pas expression mais identifier
	
compoundT
	: statement c
	;
c	:	 'END'|';' compoundT
	;
//statement
	//:(label':')+ st
	//| st
	//| begin
	//;
	
statement
	:	identifier rs
	|gotostatement
	|ifclause j
	|forclause statement
	|begin
	|actualparametrepart
	;
	
rs	:	cc
	|	':' m //avant ici j'ai mi ':' (label ':')* st
	;
	
m	:	label ':' m
	|	gotostatement
	|ifclause j
	|forclause statement
	|begin 
	|cc
	;

st	:identifier cc
          | gotostatement
          |ifclause j
          | forclause statement
	;
	
// premier souci les labels et les identifiers soit on regroupe tout en un seul soit on di
	
forclause
	:	'FOR' simpleARi ':=' forlist 'DO'
	;
	
forlist	:
               forlistelement (',' forlistelement)*
	;
	
//n	:	(',' forlistelement)*
	//;
	
forlistelement
	:simpleARi q
	;

q	:|'STEP'simpleARi 'UNTIL'expression
         |'WHILE'expression
           ;
          
	
	
	
	
//j:	uncodistatement k|forstatement|forclause statement| label ':' forclause statement
	//;
k	:	'ELSE' statement|
	;

//uncodistatement
	//:	y|label':' y
	//;
//y	:	unlabelstatement| begin
	//;
	
y	:	identifier cc
	|	gotostatement
	|begin
	|
	;
	
//unlabelstatement 
	//:	identifier cc | gotostatement|
	//;
	
j	:	forclause statement | identifier u | |  gotostatement|begin///j'ai enleve vide
	;

//u	:w k| ':' forstatement (label ':')* forstatement
	//;
	
	
u	:	cc k
	|	':' w
	;

w	:	forstatement (label ':')* forstatement
	|	 y k
	;

	//
//;

//u	:	cc| ':' y (label ':' y)*
	//;
//w	:	|
//         (label ':' y)+
// ;



//w	:	cc
	//|':' y (label ':')* y
	//;
	

	
cc	:	':='  simpleAR
	|	actualparametrepart
	; 


actualparametrepart
	:	'(' actualparalist')'(STRING ':' '('actualparalist')')*
	|
	;
	
actualparalist
	:	(actualpara paralim)*
	;
	
//p
	//:	paralim actualpara p
	//|
	//;

actualpara
	:	identifier
	;
//l	:	leftpart l
 //       |
	//;
	
leftpart:	identifier ':='
	;
 
 
gotostatement
	:	'GOTO' designExp
	;
	

	
forstatement
	:	'Y'
	;
	
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'a'..'b'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   'COMMENT' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
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