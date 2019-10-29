grammar algol602;
options{ k=1;
language= Java;
output=AST;
ASTLabelType=CommonTree; 
backtrack= false;
} 


/// cheching de expression et mise en place des opérations
prog	:	prog1 
	;
	
expression
	:	simpleAR | ifclause ei
	;
	
ei	:	simpleDesign 'ELSE'
	;
	
simpleAR:	simpleARi(':=' simpleARi)*
	;
	
simpleARi:	multExp(('+' | '-') multExp)*
	;
	

	
multExp	:	powExp('POW' powExp)*
	;
	
powExp	:	identifier actualparametrepart
         |'(' expression ')'
         |INT
	;
	
identifier
	:	ID 
	;
	

prog1	:	 begin EOF
                 |(label ':')+ begin
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
	:	arrayseg a
	;

a	:	',' arrayseg a
	|	
	;

arrayseg:	identifier r;

r	:	'[' boundplist']'
	|	',' arrayseg
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
 
formalparameterpart : | '(' formalparameterlist ')'
	;
	

//specificationpart
//	:	specificationpart1| specifier identifier ',' specificationpart1
	//; 
	
specificationpart
	:specifier identifier ';' specificationpart
	|
	;
	
specifier
	:'STRING' | type  h| 'ARRAY' | 'LABEL' | 'SWITCH' | 'PROCEDURE'
	;
	
h	:	| 'ARRAY'| 'PROCEDURE'
	;
	
formalparameterlist
	:	formalpara g
	;
	
g	:	paralim formalpara g
	|	
	;

formalpara
	:	identifier
	;

paralim	:	','| '('  ':' '('
	;
	
valuepart :'VALUE' identifier 
;
	
 	
designExp
	:	simpleDesign
	|ifclause simpleDesign 'ELSE' designExp
	;
	
simpleDesign
	:	 label
	|'(' designExp ')'
	;
	
	
ifclause:	 'IF' expression 'THEN'
        ;
                 
declaration
	:	localorown typedeclaration| typedeclaration|switchdec
	;
begin	:	'BEGIN' d
        ;

d	:	declaration ';' (declaration ';')* compoundT
	|	compoundT
	;
	
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

di	:	',' (identifier ',')* ';' f
	|  ':' m c
	|':='  simpleAR c
	|	'(' actualparametrepart ')' c
	|';' f
	| 'END'
	;
	
//dii	:	compoundT 
//             | declaration ';' compoundT
	//;
	
	
//e	:	';' f
	//;
	
f	:	localorown typedeclaration ';' f //(prendre l'initiative de boucler ici sur d
         | identifier fi
         |'ARRAY' arraylist ';'compoundT
         |procedure ';' compoundT
         |switchdec ';' compoundT
         |
        // | identifier rs 'END' 
        // |identifier rs ';' compoundT 
	;

fi	:	',' (identifier ',')* ';' compoundT
	|  ':' m c
	|':='  simpleAR c
	|	'(' actualparametrepart ')' c
	|';' compoundT
	| 'END'
	
	;
	
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
	
forlist	:	forlistelement n
	;
	
n	:	',' forlistelement n
	|	
	;
	
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
	:	'(' actualparalist')'
	|
	;
	
actualparalist
	:	actualpara p
	;
	
p
	:	paralim actualpara p
	|
	;

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
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
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