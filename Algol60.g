grammar algol60;

options{k=1;
language = Java;
backtrack =false;
output=AST;
//ASTidType=CommonTree;
}

//Block 1

prog : 'BEGIN'c
	|(id':')+'BEGIN'c;
	
compound_tail : ifClause if b
     | forClause stat b
     | gotoStat b
     | b
     |'begin'c b;
     //|id compound_tailAux;

compound_tailAux :  statAuxAux b
 		| ':'cAuxAux ;
 
//compound_tailAuxAux : id compound_tailAuxAuxAux
//		    | ifClause if b 
  //     	     | forClause stat b
    //   	     | gotoStat b
      // 	     | b
       //	     | 'begin'c b;

//compound_tailAuxAuxAux : ':'compound_tailAuxAux
//		       | clauseAux b;

b : 'END'
   |';'compound_tail
   |';'id compound_tailAux;

c : ifClause if b
   | forClause stat b
   | gotoStat b
   | b
   |'begin'c b
   |id cAux
   |decl';'d;
   
cAux : (','id)*';'d
     | statAuxAux b
     //| ':'(id':')*clause b //unsignInt':'(id':')*clause b (on a 1 cas d'écriture en plus (qui n'est jamais atteint ?)
     | ':'cAuxAux;
        
cAuxAux : id cAuxAuxAux
       |ifClause if b 
       | forClause stat b
       | gotoStat b
       | b
       | 'begin'c b;
       
cAuxAuxAux : ':'cAuxAux
	   | clauseAux b;
   
/*d : (decl';')+compound_tail
  | (id(','id)*';')+compound_tail
  | compound_tail;*/
  
d : (decl';')+dAux
  | (id(','id)*';')+dAux
    | compound_tail id compound_tailAux
  | id compound_tailAux;
  
dAux : compound_tail
      | id compound_tailAux; 

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
      | arrayDecl;
      
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
	  | 'id'
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

id : 'g';   //à modifier

//Block 3

stat : ifClause if
     | forClause stat
     | gotoStat
     | 
     |'begin'c
     |id statAuxAux;
     
statAux : actualParamPart
	| ':'(id':')*clause;
     
statAuxAux : statAux
	   | ':='leftListAux assignAux
   	| varAux':='leftListAux assignAux;

if : uncondStat unAux
   | forStat;
   
uncondStat : basicStat
           | 'begin'c
           | (id':')+'begin'c;
           
basicStat : unidBasicStat
	  | id ':' basicStat;
	  
unidBasicStat : assignStat
		 | gotoStat
		 | 
		 | id actualParamPart;
   
unAux : 'Else' stat
      | ;
      
forStat : forClause stat
        | id ':' forStat;
        
forClause : 'for' id varAux ':=' forList 'do' ;

forList : forListElem(','forListElem)*;

forListElem : arithmeticExpr forListElemAux;

forListElemAux : 'step' arithmeticExpr 'until' arithmeticExpr
	       | 'while' boolExpr
	       | ;
	       
gotoStat : 'GOTO' designExpr;
	
clause : ifClause if 
       | forClause stat
       | gotoStat
       |
       | id clauseAux
       | 'begin'c;
       
clauseAux : ':='leftListAux assignAux
	  | actualParamPart
	  | varAux':='leftListAux assignAux;
       
assignStat : leftList assignAux;

assignAux : arithmeticExpr
          | boolExpr;
   	   
leftList : id varAux'='leftListAux //à remonter dans assignStat
	 | id':='leftListAux;
	 
leftListAux : id varAux':='leftListAux
	    | id':='leftListAux
	    | ;

varAux : '['subscriptList']'
       | ;
       
subscriptList : 'a'; // à modifier

actualParamPart : '('actualParamList')'
		| ;
		
actualParamList : actualParam(paramDelimiter actualParam)*;

actualParam : string
	    | expr
	    | id;
      
designExpr : simpleDesignExpr
	   | ifClause simpleDesignExpr 'Else' designExpr;
	  
simpleDesignExpr : id
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





