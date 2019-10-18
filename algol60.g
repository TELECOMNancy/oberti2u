grammar algol60;

options{k=1;
language = Java;
backtrack =false;
output=AST;
ASTLabelType=CommonTree;
}

prog : 'BEGIN'c
	|(label':')+'BEGIN'c;
	
compound_tail : stat b;

b : 'END'
   |';'compound_tail;

c : compound_tail
   |decl';'d;
   
d : (decl';')*compound_tail;

decl : 'a';

label : 'b';

stat : 'c';



