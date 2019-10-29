grammar algol60;

options{k=1;
language = Java;
backtrack =false;
output=AST;
ASTLabelType=CommonTree;
}

//Block 1

prog : 'BEGIN'c
	|(label':')+'BEGIN'c;
	
compound_tail : stat b;

b : 'END'
   |';'compound_tail;

c : compound_tail
   |decl';'d;
   
d : (decl';')*compound_tail;

//Block 2

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

paramDelimiter : ',' | ')' letterString '(';

letterString : 'e'; //à modifier

arrayDecl : 'array' arrayList;

arrayList : (arraySeg)*;

arraySeg : id as;

as : '['boundPairList']'','arraySeg;

boundPairList : boundPair(','boundPair)*;

boundPair : arithmeticExpr ':' arithmeticExpr;

arithmeticExpr : 'a'; //à modifier

typeList : simpleVar(','simpleVar)*;

simpleVar : id;

id : 'id';   //à modifier

//Block 3

stat : ifClause if
     | forClause stat
     | var':='leftListAux assignAux
     | gotoStat
     |
     |'begin'c
     |unsignInt':'(label':')*clause
     |id statAuxAux;
     
statAuxAux : statAux
	   | ':='leftListAux assignAux;

if : uncondStat unAux
   | forStat;
   
uncondStat : basicStat
           | 'begin'c
           | (label':')+'begin'c;
           
basicStat : unlabelBasicStat
	  | label ':' basicStat;
	  
unlabelBasicStat : assignStat
		 | gotoStat
		 | 
		 | id actualParamPart;
   
unAux : 'Else' stat
      | ;
      
forStat : forClause stat
        | label ':' forStat;
        
forClause : 'for' var ':=' forList 'do' ;

forList : forListElem(','forListElem)*;

forListElem : arithmeticExpr forListElemAux;

forListElemAux : 'step' arithmeticExpr 'until' arithmeticExpr
	       | 'while' boolExpr
	       | ;
	       
gotoStat : 'GOTO' designExpr;
     
statAux : actualParamPart
	| ':'(label':')*clause;
	
clause : ifClause if 
       | forClause stat
       | var':='leftListAux assignAux
       | gotoStat
       |
       | id clauseAux
       | 'begin'c;
       
clauseAux : ':='leftListAux assignAux
	  | actualParamPart;
       
assignStat : leftList assignAux;

assignAux : arithmeticExpr
          | boolExpr;
   	   
leftList : var'='leftListAux //à remonter dans assignStat
	 | id':='leftListAux;
	 
leftListAux : var':='leftListAux
	    | id':='leftListAux
	    | ;

var : 'a'; //à modifier

actualParamPart : '('actualParamList')'
		| ;
		
actualParamList : actualParam(paramDelimiter actualParam)*;

actualParam : string
	    | expr
	    | id;

label : id 
      | unsignInt ;
      
designExpr : simpleDesignExpr
	   | ifClause simpleDesignExpr 'Else' designExpr;
	  
simpleDesignExpr : label
		 | switchDesignator
		 | '('designExpr')';
		 
switchDesignator : id '['subscriptExpr']';

subscriptExpr : arithmeticExpr;
		 
ifClause : 'If' boolExpr 'Then';
      
unsignInt : 'b'; // à modifier

boolExpr : 'e' ; //à modifier

string : 'a'; //à modifier

//block 4

expr : 'a'; //à modifier
