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

decl : loot typeD
     | switchDecl
     | typeD;
     
loot : type
     | 'own type';
  
type : 'real' //terminaux à compléter
     | 'int'
     | 'bool';
     
typeD : procedDecl
      | arrayDecl
      | typeList;
      
switchDecl : 'switch' id ':=' switchList;

switchList : designExpr(','designExpr)*;
      
procedDecl : 'procedure' procedureHeading procedureBody;

procedureBody : stat;

designExpr : 'b';

procedureHeading : id formalParamPart ';' valuePart specPart;

valuePart : 'value' idList ';'
	  | ;
	 
idList : id(','id)*;

specPart : (specifier idList)*;

specifier : type s
	  | 'string'
	  | 'label'
	  | 'switch'
	  | 'procedure';
	  
s : 'array'
  | 'proced'
  | ;

formalParamPart : 
                | '('formalParamList')';
                
formalParamList : id(paramDelimiter id)*;

paramDelimiter : ',' | ';';

arrayDecl : 'array' arrayList;

arrayList : (arraySeg)*;

arraySeg : id as;

as : '['boundPairList']'','arraySeg;

boundPairList : boundPair(','boundPair)*;

boundPair : arithmeticExpr ':' arithmeticExpr;

arithmeticExpr : 'a';

typeList : simpleVar(','simpleVar)*;

simpleVar : id;

id : 'id';   

label : 'b';

stat : 'c';

