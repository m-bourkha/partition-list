## ADNEOM Java Test
--------------------

Ce projet contient une fonction � partition � qui prend un param�tre � liste � et un param�tre � taille � et retourne une liste de sous liste, o� chaque sous liste a au maximum � taille � �l�ments.

### Exemples d'entr�es et sorties

```
partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]

```

Pour ex�cuter ce projet :
- il faut installer une machine virtuelle java 7 ou sup�rieur.

- il faut installer maven

### Ex�cuter les tests unitaires
Entrer dans le dossier partition-list puis ex�cuter les commande maven :
```
mvn clean 
mvn test
```

### Utiliser la biblioth�que PartionList

Entrer dans le dossier partition-list et ex�cuter ses commandes

``` 
mvn clean
mvn install
```
Copier le .jar g�n�rer dans le dossier target dans le class Path de votre projet pour utiliser La function partitione.