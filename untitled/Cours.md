Lundi 10 juillet: -language système simple orienté objet et interpréter . -optimisation du temps des cycle de dev (compilation et exectution) -Les application produites sont potables: Compatible sur plusieurs plate-forme (cross-plateform) - Gestion de mémoir et erreur par rapport au C++ sont simplifiées -Possibilité de créer des application multi threadés - Les apps sont robustes et sécurisé grâce à des vérif du bytecode avant éxecution 

JAVA :
- Langage systeme simple, orienté objet et interprété,
- otpimisation du temps des cycles de dev.
  (compilation et execution)
- Les applications produites sont portables :
  cross platform.
- Par rapport au C++ gestion de la memoire et des erreurs sont simplifiées.
- Il est possible de creer des applications
  multi threadés
- Les applications sont trés robustes et sécurisées grâce à des verifications du bytecode avant exécution.


JAVA :
• Langage systeme simple, orienté objet et interprété,
• otpimisation du temps des cycles de dev. (compilation et execution)
• Les applications produites sont portables : cross platform.
• Par rapport au C++ gestion de la memoire et des erreurs sont simplifiées.
• Il est possible de creer des applications multi threadés
• Les applications sont trés robustes et sécurisées grâce à des verifications du bytecode avant exécution.


Plateforsms Java:
JDK: java dev kit
    -API JDK
    -Outil: javac, javadoc
JRE: (java runtime env) environnement d'exécution
    -API JAVA
    -Outils: java, javaw
JVM: (java virtuel machine) permet l'exécutuion du programme passe en paramètre de la commande java
    -Compiltateur

La machine virtuel Java:
Elle est mise a disposition pour de multiple OS
Ses roles sont multiples Os
    -elle change des classes( et leur bytecode ), a l'instanciation d'une classe c'est elle qui change le bytecode à interpréter
    -elle gère la mémoire: les pointeurs et les références
    -elle gère la libération de la mémoire:  garbage collector
    -elle gère aussi la sécurité
    -interfacage avec du code natif

L'api java
Ensemble de logiciel pré-concu pour fournir un grand nombre de focntionnalités


L'API Java 17:
    -21 modules
    -220 packages (l'equibalent des bibliotèque de classes en C# ou de librairies en langage C)
    -Plus de 4000 Classes et interfaces mise à disposition

Deux implémentations pour une platerform
    -orcale jdk
    -openJdk


Instance de class: l'objet créé à partir d'une classe Les catégorie de variables:

-Les varibale d'instance: nexiste que si une intance de classe est disponible. chaque instance possède sa propre version de la variable

-les variables de classes:elles sont aussi declarer à l'interieur d'une classe avec le mot cle static. La variable de classe est disponible directement depuis la classe et existe en un unique exemplaire. On peut avoir 50 instance d'une meme classe mais la valeur d'une variable de classe est unique.

-Les variable locales sont déclarer a l'interieur d'une methode

Pour écrire du code propre, avec peu d'erreur, suivre la convention d'écriture JAVA qui est un document officiel montrant comment écrire du JAVA propement: Quelque exemple: -Nomenclature des variable: - Le nom du variable commence par une lettre - Lettres, chiffre et underscore - Nombre illimité de caractère - sensible à la casse avec les majuscule - keywords - camel case: le nom commence par une minuscule et chaque nouveau mot par une majuscule

Les types de variable: On distingue deux types de variable -les types de valeur: celle qui stockent des valeurs - les types réérences: celle qui ne stockent pas réelement de valeur Les types valeurs designent les types primitifs, on en compte quatre en java: entiers, decimaux, les chars et les booleen Les types de références designent un types plus complexe: un ensemble cohérent de variables

La déclarition En java: [modificateur] type maVariable; On peut declarer plusieurs variables du meme types sur la meme ligne: type var1,var2,var3, ...; Exemple: int ageDeTom; Date armistice, noel;

Pour initialiser une varible, on utilise l'opérateur '=' int nombreDeTacos = 1;

exemple: int ageDeTom = 20; int ageDeTemel = ageDeTom; ageDeTom = 44; System.out.println(ageDeTemel); System.out.println(ageDeTom);

Résultat: 20 44

Ce code a pour but de prouver que la variable ageDeTom et ageDeTemel sont bien de varaible types valeur et non référence

Date naissanceTom = new Date( 103, 1, 11 ); Date autreDate = naissanceTom; //Changer la varible afin de tester la variable et savoir si c'est une variable types valeur ou référence naissanceTom.setTime(1); System.out.println(naissanceTom); System.out.println(autreDate);

Ce code a pour but de prouver que la variable autreDate et naissanceTom sont bien de varaible types reférence et non valeur

Nombre entier: ...

Nombre décimaux: Exemple: float someFloat = -150.324; System.out.println(someFloat); Resultat: java: incompatible types: possible lossy conversion from double to float

float someFloat = -150.324f;
System.out.println(someFloat);
Résultat:
-150.324
Les constantes: Variable qui ne doit pas être modifier au cours de l'execution du programme, il convient alors de définir des constantes.

Pour définir une constante on utilise le mot clé: final Exemple: final double PI = 3,14159265358979323846264338327950288419716939937510582;

L'initialisation de la constante est obligaoire lors de sa déclaration. Souvent les constante sont définies comme membre statique Par convention on les écrit en MAJUSCULES

Les enumération Elles permettent de definir un ensemble de constantes Exemple: public enum Month{ JANVIER, FEVRIER, MARS, AVRIL, MAI, JUIN, JUILLET, AOUT, SEPTEMBRE, OCTOBRE, NOVEMBRE, DECEMBRE } L'équivalent avec une classe:

public class Month{ public static final int JANVIER = 0, FEVRIER = 1, ... } La déclaration d'une enum peut etre considere comme l'utilisation d'une "classe cacher" Cette classe herite de java.lang.Enum

Les tableaux Exemple de syntaxe: //declaration du tableau int[] unTableau; //Initialisation avec 122 de taille ( Possible de mettre 122 objet dans ce tableau ) unTableau = new int[122]; //Autre facon d'initialiser int[] autreSyntaxe = {2,3,14,124,2};

On peut acceder au element d'un tableau de cette maniere: autreSyntxe[4] Si vous tenter d'acceder a un index inexistant vous allez obtenir une exception de type: ArrayIndexOutOfBoundException

Il est possible de travailler avec des tableaux a plusieurs dimension La syntaxe pour recuperer des element dans un tableau a 2 dimension est la suivante: int elemTableau2D = tableau2D[0][1];

Autre methode de creation: int [][] matrice; matrice = new int[2][]; matrice[0] = new int[4]; matrice[1] = new int[2];

Encore une autre syntaxe: int [][] encoreUneAutreSyntaxe = {{1,2,3}{1,3,6}} Tableau a deux lignes et trois colonnes

### Les conversions

En java il existe deux types de conversions :

les conversions implicites
les conversions explicites
Les conversions implicites

Les conversions implicites sont des conversions qui sont faites automatiquement par le compilateur.

int entier = 10;
double decimal = entier; // conversion implicite
Les conversions explicites

Les conversions explicites sont des conversions qui sont faites par le programmeur.

double decimal = 10.5;
int entier = (int) decimal; // conversion explicite
La conversion entre types numeriques est possible si le type de destination est plus grand que le type source.

int entier = 10;
double decimal = entier; // conversion implicite
La conversion vers des chaines de caractères est possible pour tous les types.

int entier = 10;
String chaine = String.valueOf(entier); // conversion explicite
Dans certains cas il n'y a pas besoin d'utiliser une methode pour convertir un type en chaine de caracteres.

int entier = 10;
String chaine = "" + entier; // conversion implicite
