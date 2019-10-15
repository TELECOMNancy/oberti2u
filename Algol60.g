grammar Algol60; \\Fichier commun grammaire du projet

options{
	backtrack =false; //LL(k)
	k=1;
}

prog : block | compound statement //tentative de derecursivation et de factorisation d'un bout de grammaire de masswerk.at pour tenter de rendre la grammaire LL(1) (le fichier ne compile pas)																  

block : unlabelled block | label ':' block


unlabelled block : block head ';' compound tail


block head : 'BEGIN' declaration block head'

block head':  | ; declaration block head' // après derecursivation, factorisation et reduction de la regle d'origine

compound statement : unlabelled compound | label:compound statement

unlabelled compound : 'BEGIN' compound tail

compound tail : statement 'END' | statement ; compound tail

// On voit qu'il y a ambiguité au niveau de block head' (SD non disjoints)



			





