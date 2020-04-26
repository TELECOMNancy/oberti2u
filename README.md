# Groupe 27
Yann BOUGEARD -- Warren LATA -- Mathias OBERTI  -- Marcus Vinicius REIS DE MORAIS


## Niveau atteint

Niveau 4

Nous avons implémenté le print, donc nos tests afficheront des résultats pour attester de leur bon fonctionnement.

## PlusbeauTest

Nous avons implémenté un code avec des GOTO, FOR,LABEL , IF , appel de fonction et des tabelaux. Ce code calcul une somme . La valeur final affichée 3 est la somme des i qui sont affectés aux cases du tableau dans les labels.

Nous avons fait en bonus au niveau du FOR un FOR complexe avec des While,STEP et des entiers: le code se nomme For.Algol


## Quelques points sur l'utilisation de notre compilateur
Pour lancer notre compilateur nous avons implémenter les scripts shell demandés. Une fois le dépot cloné, il suffit de se placer à la racine du projet pour éxécuter les scripts bash. Trois commandes sont disponibles :

./build.sh : cette commande permet de générer le fichier .jar du projet à l'aide de Gradle et Intellij.

./compile.sh test.algol nom.txt : après avoir généré le .jar, cette commande permet de compiler un code algol, le code généré sera stocké dans le fichier nom.txt, un fichier nom.iup sera généré pour l'éxécution du code.

./run.sh nom.iup : cette commande permet d'éxécuter le fichier iup précédemment généré.


```console
foo@bar:~$ ./build.sh
foo@bar:~$ ./compile.sh ./TestsCompilation/niveau1.Algol niveau1.txt
foo@bar:~$ ./run.sh niveau1.iup
```
Dû à la différence d'environnement de travail entre Windows et les systèmes Unix, il est possible que la commande build.sh ne fonctionne pas sans lui donner de droits d'écriture, il faudra donc éxécuter la commande "chmod +x build.sh", le cas échéant.
Les tests que nous vous proposons sont présents dans le fichier Testscompilation.

## Quelques point concernant l'avancement et les limites du projet

Au niveau de notre implémentation des appels de fonction et de la gestion des registres, notre compilateur a du mal à générer des résultat correct lorsqu'il y'a trop d'appel récursif dans un code. Par exemple pour le code procedure.Algol que nous avons mis dans notre dossier TestsCompilation à partir de 8 appel récursif nous n'avons plus assez de registre pour avoir un résulat correct. Ceci est partiellement du au fait que nous utilisons quelques registres utilitaires en plus. Du fait des divers points de difficultés citées dans notre rapport nous n'avons pas eu le temps de nous concerter correctement pour essayer d'améliorer ce point sur la gestion des registres.

En général les fonctions récursives avec retour tels que factorielles (avec des opérations) ne sont pas parfaites du fait de ce problème de registre mais tous les autres fonctionnent parfaitement.

Pour vérifier le retour d'une fonction il faut affecter une variable avec l'appel de cette fonction et afficher  cette variable.

Pour les tableaux un point important est que les accès doivent toujours être des entiers purs et non des variables. Nous n'avons pas eu le temps d'implémenter les autres cas. En outre, lorsqu'un tableaux ou une matrice est déclaré il ou elle est automatiquement initialisé avec des 0.
De plus, nous n'avons pas implémenté l'accès en mémoire à un tableau situé dans un environnement de niveau supérieur(cas pour fonction et begin imbriqué sauf label).

Ps: Nous avons implémenté de telle sorte que dans une fonction on ne puisse pas faire d'instruction après un retour(cela rend les résultats faux). C'est à dire rien après NomFoncion:=valeur;

De manière plus globale, une majorité des limitations de notre travail sur la partie compilation, tient à une gestion de la mémoire parfois peu otpimisée conjuguée au faible nombre de registre géré par ASM.



