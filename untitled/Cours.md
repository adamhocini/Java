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

La programmation orientee objet

La programmation orientee objet est un paradigme de programmation qui permet de representer des objets du monde reel en utilisant des classes et des objets.

Les classes

Voici la syntaxe pour creer une classe en java :

public class NomDeLaClasse {
    // attributs / champs
    // constructeurs
    // methodes
}
Les classes sont constituees de champs, de constructeurs et de methodes. Les champs representent les donnees de la classe, les constructeurs permettent de creer des objets et les methodes permettent de manipuler les objets.

A ces notions fondamentales vont s'ajouter trois concepts importants :

l'encapsulation
l'heritage
le polymorphisme
L'encapsulation permet de proteger les donnees d'une classe en les rendant privees. On va ainsi cacher certains elements qui ne sont pas necessaire a l'utilisateur de la classe, mais necessaire a son bon fonctionnement. Dans le cas d'une classe Article, l'utilisateur n'a pas besoin de connaitre le prix de revient de l'article, mais il a besoin de connaitre son prix de vente. Dans le cas d'une voiture, l'utilisateur n'a pas besoin de connaitre la vitesse de rotation du moteur, mais il a besoin de connaitre la vitesse de la voiture.

Les elements de la classes visibles depuis l'exterieur constitue l'interface de la classe.

L'heritage permet de creer des classes filles a partir d'une classe mere. Autrement dit on cree un nouvelle classe a partir d'une classe existante. La classe fille herite de tous les elements de la classe mere. On peut alors ajouter des elements supplementaires a la classe fille.

Le polymorphisme permet de manipuler des objets de classes differentes avec une meme interface. Ce concept est un peu difficile a comprendre au depart, mais il est tres important en programmation orientee objet. Il est possibles d'utiliser plusieurs classes differentes qui ont une meme interface. Deux autres concepts sont souvent associes au polymorphisme : la surcharge et la substitution.

Mise en pratique avec JAVA:

Alt text

Declaration d'une classe :

[modificateur] class NomDeLaClasse [extends NomDeLaClasseMere] [implements NomDeLinterface  ]  {

    // Code source de la classe
    // attributs / champs
    // constructeurs
    // methodes
}
Les modificateurs de classes :

public : la classe est visible depuis n'importe quel autre classe. Sans ce modificateur, la classe est visible uniquement depuis le package dans lequel elle est declaree.
abstract: la classe est abstraite. Une classe abstraite ne peut pas etre instanciee.
final: la classe ne peut pas etre heritee.
Les methodes de classes :

    [modificateur] typeDeRetour nomDeLaMethode([parametres]) {
        // code source de la methode
    }
Les modificateurs de methodes :

public : la methode est visible depuis n'importe quel autre classe. Sans ce modificateur, la methode est visible uniquement depuis le package dans lequel elle est declaree.
protected : la methode est visible depuis la classe, le package et les classes filles.
private : la methode est visible uniquement depuis la classe.
static : la methode est une methode de classe. Elle peut etre utilisee sans instancier la classe.
abstract : la methode est abstraite. Elle doit etre redefinie dans les classes filles.
final : la methode ne peut pas etre redefinie dans les classes filles.
native : la methode est implementee dans un langage autre que Java.
synchronized : la methode ne peut etre utilisee que par un seul thread a la fois.
Creation d'accesseurs pour les champs prives (getter et setter):

    public typeDeRetour getNomDuChamp() {
        return nomDuChamp;
    }

    public void setNomDuChamp(typeDuChamp nomDuChamp) {
        this.nomDuChamp = nomDuChamp;
    }
Les constructeurs d'une classe :

Il s'agit d'une methode particuliere qui permet de creer des objets a partir d'une classe. Le constructeur porte le meme nom que la classe et n'a pas de type de retour. Il est possible de creer plusieurs constructeurs dans une classe. On parle de surcharge de constructeurs. Si aucun constructeur n'est declare dans une classe, un constructeur par defaut est cree par le compilateur. Ce constructeur par defaut est un constructeur vide qui ne fait rien.

    public NomDeLaClasse() {
        // code source du constructeur
    }
Declaration de la classe Personne:

public class Personne {
    // attributs / champs
    private String nom;
    public String prenom;

    // accessible depuis la classe, le package et les classes filles
    protected String adresse;
    private String codePostal;
    private String ville;

    // constructeurs
    public Personne() {
    }

    public Personne(String nom, String prenom, String adresse, String codePostal, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    // methodes
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}