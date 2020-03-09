## ADNEOM Java Test
--------------------

Ce projet contient une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.

### Exemples d'entrées et sorties

```
partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]

```

Pour exécuter ce projet :
- il faut installer une machine virtuelle java 7 ou supérieur.

- il faut installer maven

### Exécuter les tests unitaires
Entrer dans le dossier partition-list puis exécuter les commande maven :
```
mvn clean 
mvn test
```

### Utiliser la bibliothèque PartionList

Entrer dans le dossier partition-list et exécuter ses commandes

``` 
mvn clean
mvn install
```
Copier le .jar générer dans le dossier target dans le class Path de votre projet pour utiliser La function partitione.