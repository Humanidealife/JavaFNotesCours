//Entête pour "package", cela est une notation obligatoire
package pro.wangqian.decouvertejava.demonstration.transport.terrestre;

import pro.wangqian.decouvertejava.demonstration.Vidangeable;
import pro.wangqian.decouvertejava.demonstration.Ville;
import pro.wangqian.decouvertejava.demonstration.transport.Moteur;
import pro.wangqian.decouvertejava.demonstration.transport.Passager;
import pro.wangqian.decouvertejava.demonstration.transport.TypeBoiteVitesse;
import pro.wangqian.decouvertejava.demonstration.transport.VehiculeMotorise;

import java.util.Objects;

public class Voiture extends VehiculeMotorise implements Vidangeable {
   //Convention d’écriture
   /*
   1. Attributs statiques
   2. Attributs d’instances
   3. Constructeurs (ordonnés par leur nombre de paramètres)
   4. Méthodes (
               1. méthodes statiques
               2. méthodes d’instances)
    */


   //La prorpriété nbRoues est une valeur commune à toutes les instances
   //nbRoues est donc static
   //Une propriété statique ou un attribut statique est une propriété dont la valeur est définie par la classe
   //On l'appelle également une variable de classe
   //variable de classe, le contenu est commun à toutes les instances
   //variable d'instance, le contenu peut différer en fonction des objets
   //Désormais toutes les voitures instanciées vont avoir 4 roues

   //Si l'on combine "final" avec "static", on parle alors de "CONSTANTE" et il est recommandé d'écrire en Java
   //  le nom d'une "CONSTANTE" tout en majuscule par exemple "NB_ROUES"
   public static int nbRoues = 4;

   //"Getter" et "Setter"

   //La syntaxe de "getNbPortes" suit un certain standard,
   //  cette méthode commence par "get"n et ensuite suivie par le nom de la propriété qui nous intéresse avec la
   //  première lettre en majuscule.
   public int getNbPortes() {
      return nbPortes;
   }
   //La méthode "setNbPortes" prend en paramètre la nouvelle valeur de la propriété que l'on veut modifier.
   //Son contenu est très simple,
   public void setNbPortes(int nbPortes) {
      this.nbPortes = nbPortes;
   }

   public TypeBoiteVitesse getTypeBoite() {
      return typeBoite;
   }

   public void setTypeBoite(TypeBoiteVitesse typeBoite) {
      this.typeBoite = typeBoite;
   }

   public String getCouleur() {
      return couleur;
   }

   public void setCouleur(String couleur) {
      this.couleur = couleur;
   }

   public Integer getRapportCourant() {
      return rapportCourant;
   }

   public void setRapportCourant(Integer rapportCourant) {
      this.rapportCourant = rapportCourant;
   }

   private String immatriculation;

   public String getImmatriculation() {
      return immatriculation;
   }

   //Méthode qui a vocation de valoriser "immatriculation".
   //Cette méthode ressemble quelque part au "Setter", c'est pourquoi l'on n'a pas ajouté de "Setter"
   //On veut que "numeroImmatriculation" soit compatible avec le standard français,
   //  c'est-à-dire (deux lettres, un espace, trois chiffres, un espace et deux lettres).

   //Dans notre code actuel, on détecte un cas d’exception « if (numeroImmatriculation.length() != 9){} »,
   //  et notre méthode indique qu’elle est susceptible de rejeter une exception de type « NombreDeCaractereInvalideException ».
   //Il est temps de rejeter réellement cette exception lorsque dans notre méthode on va détecter l’exception,
   //  dans le bloc de « if »
   public void immatriculer (String numeroImmatriculation) throws NombreDeCaractereInvalideException, VoitureDejaImmatriculeeException{

      //On rejette une erreur en utilisant la Class "UnknownError" qui est une Class fille de "Error".
      //throw new UnknownError("Erreur inconnues");

      //On peut au moins nous assurer que la longueur de cette "String" soit 9
      //Un cas d'exception

      if (numeroImmatriculation.length() != 9){
         //On va utiliser le mot clé "throw" suivi d'une instance de l'exception que l'on veut rejeter.
         //On peut utiliser le constructeur sans paramètre,
         //  ou bien utiliser le constructeur capable de prendre en paramètre un message lisible pour l'être humain
         //À partir du moment, on rejette une exception, le traitement de la méthode est intérrompu,
         //  tout ce qui se trouve par la suite est complètement ignoré. Cette réaction est ce que l'on cherche à faire.
         throw new NombreDeCaractereInvalideException("Le numéro " + numeroImmatriculation +
                                                      " ne comporte pas le nombre de caractères attendu");
      }
      //Une autre cas d'exception
      //Si la Voiture possède déjà une immatriculation
      if (this.immatriculation != null){
         throw new VoitureDejaImmatriculeeException("Cette voiture est déjà immatriculée du numéro : " + this.immatriculation);
      }

      //Pour simuler une Exception "NullPointerException"
      //On affiche la longueur de l'immatriculation courante,
      //  mais le problème est que la propriété "immatriculation" est au départ "null"(la valeur par défaut).
      //Le fait de vouloir invoquer une méthode sur un Objet "null" va générer cette Exception "NullPointerException". Cette Exception n'est pas déclarée
      //  avec "throws", et pour l'instant, elle n'est pas attrapée dans la méthode "assembler"
      System.out.println("Le numéro est actuellement de longueur : " + this.immatriculation.length());

      this.immatriculation = numeroImmatriculation;

   }


   private int nbPortes = 5;
   //boolean automatique;
   //Pour avoir automatique = 1, semi-automatique = 2 et manuelle =3, on ajout un "int"
   //Pour que ce code soit compréhensible, il faut ajouter à pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture des propriétés staitques pour référencer ces valeurs

   //Après instauration de "enum", le "typeBoite" ne correspond plus à un "int", mais à l'un des éléménts de
   //  l'énumération, il s'agit donc d'un "pro.wangqian.decouvertejava.demonstration.transport.TypeBoiteVitesse"
   private TypeBoiteVitesse typeBoite;
   // la propriété couleur bénéficie d'une valeur par défaut, qui est null.
   //String n'est pas un type primitif, String est un type objet, c'est une classe
   //Cette classe qui représente une chaîne de caractères bénéficie de propriétés
   //  dont une est la séquence des caractères qui compose la chaîne de caractères
   private String couleur;

   //Ajout d'une propriété, comme on ne donne pas de valeur de départ, sa valuer par défaut va être 0
   //Mais avec son type primitif, on ne sait pas si ce rapportCourant est 0 signifiant on est sur le point mort
   //  ou bien que ce rapportCourant n'a juste pas encore été valorisé
   //int rapportCourant;
   //On le transforme en Integer
   //  Donc désormais rapportCourant par défaut vaut "null"
   private Integer rapportCourant;

   //La classe pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture n'a plus de propriétés comme carburation et nbCylindres
   //Mais comme on veux à partir de la pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture avoir accès à ces informations
   //On va donc rajouter une nouvelle propriété : qui se nomme "moteur" et de type "pro.wangqian.decouvertejava.demonstration.transport.Moteur"
   //Voici une nouvelle propriété qui va aussi caractériser la pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture : moteur
   //On a encapsulé les deux propriétés : "carburation" et "nbCylindres" dans une nouvelle classe : class pro.wangqian.decouvertejava.demonstration.transport.Moteur
   //Ce concept d'encapsulation est fondamental dans les langages d'objet
   //La valeur par défaut des prorpiétés de type Objet est : "null"

   //Un constructeur est un bloc d’instructions qui se trouve dans la classe instanciée et il est écrit comme ci-dessous :
   //On rajoute un paramètre dans le constructeur
   public Voiture (String couleur){
      //Avec "super(new pro.wangqian.decouvertejava.demonstration.transport.Moteur())", on est obligé d'écrire ainsi
      //Parce que maintenant il est impossible de construire une pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture avec simplement la couleur, car le Parent
      //  nécessite de bénéficier d'un moteur
      //super(new pro.wangqian.decouvertejava.demonstration.transport.Moteur());
      this();

      //Dans le bloc d'instructions on va profiter de la construction pour associer à l'objet, en cours de création,
      // la nouvelle courleur passée en paramètre en employant le mot clé "this" -> objet courant
      //Le premier mot couleur est "la couleur de l'objet courant"
      //Le deuxième mot couleur est "la couleur passée en paramètre"
      this.couleur = couleur;
      System.out.println("Une voiture est construite avec la couleur comme paramètre, sa couleur est " + couleur);
      //Attention, le fait de définir un constructeur avec paramètre va faire disparaître le constructeur par défaut -> constructeur sans paramètre
      //Il n'est donc plus impossible d'instancier la classe sans passer le paramètre couleur maintenant
   }

   //Pour que l'on puisse continuer à utiliser un constructeur sans paramètre, il fuat l'ajouter expliciement à nouveau dans la classe
   public Voiture(){
      //On peut ajouter des paramtères dans le parenthèses de "super"
      //Cela construit la voiture en utilisant tout d'abord le constructeur du Parent qui prend en paramètre un moteur
      //C'est ailleur ce que l'on serait obligé de faire si l'on avait considéré qu'un pro.wangqian.decouvertejava.demonstration.transport.VehiculeMotorise ne pouvait jamais être construit sans moteur
     super(new Moteur());
   }
   //On a maintenant donc deux constructeurs dans la classe voiture, et libre aux développeurs de choisir le constructeur le plus
   //  adapté à chaque utilisation
   //Attention : Rajouter un constructeur paramétré dans une classe, c'est également indiquer aux développeurs que ce paramètre est essentiel ou
   //  du moins d'une grande utilité.
   //On peut ajouter autant de constructeurs que l'on souhaite
   //Attention : On ne peut pas ajouter deux constructeurs qui disposent exactement la même nature de paramètres

   //Mais rien ne nous empêche de créer des constructeurs qui disposent de plusieurs paramètres

   /*pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture(String couleur, int nbPortes){
      this.couleur = couleur;
      this.nbPortes = nbPortes;
      System.out.println("Cette voiture est construite avec la couleur et le nombre de portes comme paramètres");
   }*/

   //"super" nous permet, lors de l'exécution, de faire référence à la classe Parente, notamment pour en invoquer un constructeur
   public Voiture(Moteur moteur){
      //Ici on invoque le constructeur de pro.wangqian.decouvertejava.demonstration.transport.VehiculeMotorise qui prend en paramètre le moteur
      super(moteur);
   }

   //On peut construire une voiture en recevant en paramètre les constituants du moteur
   public Voiture(String carburation, int nbCylindres){

      //super(new pro.wangqian.decouvertejava.demonstration.transport.Moteur());
      //OU c'est encore mieur de faire comme ci-dessous
      this();

      //Puis on profite de la construction de la voiture pour instancier son moteur
      Moteur moteur = new Moteur();
      moteur.carburation = carburation;
      moteur.nbCylindres = nbCylindres;
      this.moteur = moteur;
   }



   //Nous devons indiquer si cette opération est susceptible de retourner un résultat ou pas.
   //Ici l'oprération "klaxonner" ne retourne aucun résultat
   //dans ce cas-là, il faut préfixer le nom de méthode par "void"(vide). Cela indique que la méthode ne retourne aucun résultat
   //Cette méthode peut être qualifiée de static, poarce que cette méthode se comporte de la même manière quelle que soit la voiture
   //Cette méthode ne dépend pas des spécificités de l'objet en particulier
   //Avec le mot clé "static" cette méthode peut être invoquée sans avoir besoin d'une instance particulière, tout comme pour
   // les prorpriétés statiques : NomDeLaClasse.nomDeLaMetode
   public static void klaxonner(){
      System.out.println("Tutut!");
   }

   /*int accelerer(){
      System.out.println("J'accélère");
      //Nouvelle instruction : le code qui va invoquer cette méthode, voudra savoir également à l'issue de l'accélération
      //quelle est la nouvelle vitesse atteinte par la voiture
      //Il s'agira dans cette méthode de retourner un résultat qui est donc cette nouvelle vitesse
      //Il faut donc indique devant le nom de la méthode, le type du résultat retourné -> int
      //Pour retourner un résultat à la fin de l'opération, à la fin de la méthode -> return; suivi du résultat retourné
      return 100;
   }*/

   //Surcharge dela méthode accelerer
   //Ici cette méthode reçoit un paramètre, un int vitesseEnPlus, qui correspond à la vitesse en plus que l'on souhaitait ajouter
   //à ma vitesse courante
   //cette méthode retourne un int, qui est la vitesse finale atteinte suite à cette accélération
   //qui est donc le résultat de "vitesse + vitesseEnPlus"

   //Mais lorsque le paramètre reçu dans la méthode a le même nom que la propriété de l'objet que l'on manipule
   //C'est le paramètre de la méthode qui a la priorité
   //Quand le paramètre qui a exactement le même nom que l'attibut de la classe, on doit écrire



   //La voiture peut passer un rapport
   //Mais cette méthode est possiblement être paramètrée lors de son invocation
   //Il faut donc mettre dans les paraenthèses les différents paramètres que l'on peut valoriser lors de son invocation
   //Il faut connaître le rapport courant de la voiture
   //this : dans la méthode passerRapport de la classe pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture, c'est le rapportCourant de la maVoiture4 qui est incrémenté de 1
   //parce que c'est la méthode passerRapport de maVoiture4 qui a été invoquée
   //jusque là le mot clé "this" n'a pas été utilisé pour indiquer que dans la méthode on veut manipuler l'objet courant
   //mais il est tout à fait autorisé de le faire.
   //Cette méthode est une méthode d'instance, parce qu'elle implique l'attribut "rapportCourant"
   //Cet attribut "rapportCourant" de l'objet particulier est manipulé.
   //Cette méthode nécessite d'être invoquée à partir d'une pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture en particulier

   /*
   int passerRapport(boolean augmenter){
      if (augmenter){
         //cela signifie le rapportCourant de l'objet actuellement manipulé pendnat l'exécution
         //"tihis" est implicite
         //Ici on ajoute "this" ou pas, cela revient au même
         //MAIS DANS LA PLUPART DES CAS ON UTILISE "this" POUR LEVER UNE AMBIGUITE
         this.rapportCourant++;
      }
      else{
         rapportCourant --;
      }
      return rapportCourant;
   }

    */

   //On ne peut retourner qu'une seule valeur d'un seul type,
   //Mais une méthode peut avoir plusieurs paramètres

   //Surchage de méthode
   //La méthode tournerOrientation au-dessus est surchargée par laméthode tournerOrientation en-dessous
   //Cette méthode est aussi statique, le comportement de cette méthode n'implique aucun atttribut d'instatnce
   //Cette méthode ne fait que manipuler les paramètres d'entrée
   public static void tournerOrientation (boolean droite, int angle){
      String droiteOuGauche = null;
      if (droite){
         droiteOuGauche = "droite";
      }
      else{
         droiteOuGauche = "gauche";
      }
      System.out.println("Les " + nbRoues + " roues de la voiture vont tourner à " + droiteOuGauche +" d'un angle de " + angle + "°");
   }
   // Ou comme cela

    public static void tournerOrientation (String droiteOuGauche, int angle){
      System.out.println("La voiture va tourner à " + droiteOuGauche +" d'un angle de " + angle + "°");
   }


   //Admettons maintenant que la méthode "transporter" puisse recevoir en paramètre le "passager" et "villeDeDepart", mais aussi
   //  la liste de toutes les villes par lesquelles le "passager" va transiter
   //Dans ce cas-là, on a besoin d'un tableau de ville
   //Lorsque la méthode "transporter" est invoquée, et bien ce tableau pourra contenir 0 ou à n "villeEtapes"
   //Pour que les "etape1, etape2, etape3" fonctionnent comme paramètre, il faut remplacer l'argument de type tableau par un "varags"
   // c'est-à-dire arguments variables. On remplace les "[]" par "..." ce qui s'appelle une "ellipse"
   //Ceci signifie en Java qu'après "villeDeDepart", il peut y avoir un nombre variable de villeEtapes
   //Maintenant comment utiliser "villeEtapes" qui va contenir de 0 à n villes ?
   //En réalité Java va transformer tous ces arguments en un tableau de "ville"
   //Finalement "villeEtapes" bénéficie de toutes les capacités d'un tableau
   //Mais on ne peut avoir qu'une seule ellipse dans une méthode ou d'un constructeur
   //  et le paramètre sous forme d'éllipse doit impérativement constituer le dernier paramètre des arguments

   /**
    *
    * transporter est une méthode qui permet de transporter d'un passager d'une ville de départ
    *   à une ville d'arrivée en passant par des étapes.
    *   Puis, on peut générer une documentation au format HTML, en faisant "Tools" -> "Generate JavaDoc"
    *
    * @param passager
    * @param villeDeDepart
    * @param villeEtapes
    * @return
    */
   public Ville transporter (Passager passager, Ville villeDeDepart, Ville... villeEtapes){
      //Si une méthode de cette classe pro.wangqian.decouvertejava.demonstration.transport.VehiculeMotorise ne convient pas à la classe pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture
      //Dans ce cas-là on a tout à fiat le droit de réécrire la méthode concernée dans la classe fille
      System.out.println("La voiture transporte un passager qui s'appelle " + passager.prenom + " " + passager.nom);
      System.out.println("Et la ville de départ est " + villeDeDepart.nom + " " + villeDeDepart.pays);
      System.out.println("La première ville étapes est " + villeEtapes[0].nom);
      System.out.println("La taille du tableau villeEtapes est " + villeEtapes.length);
      //retour de la villeDArrivee
      //Il faut d'abord instancier une ville
      //On pourrait préfixer la variable "villeDArrivee" par "final".
      //"villeDArrivee" est une "Ville", cette variable pointe sur l'Objet "Ville".
      //Mais ce qui est 'final" c'est la variable "villeDArrivee", ce n'est absolument pas le contenu de la "Ville'
      //  On peut tout à fait modifier le "nom" et n'importe quelles propriétés de cette "Ville"
      final Ville villeDArrivee;
      villeDArrivee = new Ville();
      villeDArrivee.nom ="Rennes";
      villeDArrivee.pays = "France";
      //Le type du résultat que l'on fournit en retour doit être déclaré en début de la méthode
      return villeDArrivee;
   }

   //On doit définir le contenu pour la méthode "vidanger" implémentée
   //implémentation "implements"
   @Override
   public void vidanger() {
      System.out.println("Dévisser le bochon sous la culasse et attendre que cela coule");
   }

   public static void main(String... args){
      System.out.println("Ici je commence dans la classe pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture");

   }
   //Cette Interface dispose d'une méthode qui s'appelle "compareTo"
   //Cette méthode va retourner un "int" qui doit être supérieur à 0, si l'Objet courant est supérieur à l'Objet passé en paramètre ;
   //  le "int" va être inférieur à 0, si l'Objet courant est inférieur à l'Objet passé en paramètre ;
   //  et il va retourner 0, si l'Objet courant est égale à l'Objet passé en paramètre.
   //Lorsque "Collections.sort" essaie d'ordonner une List, "Collections.sort" va invoquer la méthode "compareTo" de chacun des éléments
   //  contenus dans la List, et va demander à chacun de ces éléments de se comparer eux-mêmes par rapport aux autres éléments
   //  qui vont lui être automatiquement fournis.
   //"Collections.sort" va donc demander à "maVoiture1" de se comparer avec "maVoiture4" ou inversement.
   //On peut remarquer que ce qui est passé en paramètre est un "Object", non pas une "pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture",
   //  car nativement l'Interface "Comparable" autorise des "Object" de nature différentes à se comparer.
   //  Par exemple : est-ce qu'une "Carotte" est plus grande qu'une "pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture", un Integer qui vaut 10 est inférieur qu'un Float qui vaut 10,9f
   //Mais il est difficile de trouver un ordre naturel pour des "pro.wangqian.decouvertejava.demonstration.transport.terrestre.Voiture",
   //  on prend comme critère son âge, la taille ou numéro d'immatriculation ?
   //Cela dit qu'implémenter "Comparable" n'a pas de sens.


   //Parfois les règles d'équivalence sont un peu différentes entre "equals" et "hashCode".
   //Auto-génération des méthodes "equals" et "hashCode" selon des règles différentes.
   //Clique droite, puis Generate, "equals() et hashCode()", une assistance qui propose des critères d'égalité différents.
   //Ici, on base les deux méthodes "equals" et "hashCode" sur "nbPortes".
   //On peut remarquer que ces méthodes générées automatiquement sont généralement un peu plus complexes que
   //  ce que l'on a écrites dans la Class "pro.wangqian.decouvertejava.demonstration.Carre" manuellement.
   //Parce qu'elles tiennent compte de toutes les situations qui peuvent subvenir.
   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Voiture voiture = (Voiture) o;
      return nbPortes == voiture.nbPortes;
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(nbPortes);
   }

   //De la même manière d'avoir les méthodes "equals" et "compareTo"
   //  qui suivent exactement les mêmes règles pour ce qui concerne l'équivalence.
   //Parfois un peu difficile, cela est très fortement dépendant du fait que l'ordre naturel que l'on a choisi a été bien choisi.
   //Le cas des travaux pratiques va être un bon exemple, parce que l'on avait indiqué que deux "Planet" étaient équivalentes, si elles
   //  étaient de même distance de leur "Etoile", or certaines personnes considéraient probablement que deux "Planet" qui ont plutôt
   //  les mêmes noms sont des "Planet" équivalentes. Il serait quasiment impossible de faire co-habiter ces deux règles
   //  "mêmes noms" et "mêmes distances".
   //Cela nous amène à nous poser une autre question :
   //  devons-nous nous contenter de l'ordre naturel pour ordonner des Objets dans une Collection ?
   //La réponse est non, on pourra considérer que des Objets puissent être ordonnés de différentes manières selon différents critères.
   //Et on pourrait également considérer qu'ils ne bénéficient pas de l'Interface "Comparable" puissent être ordonnés par ailleurs.
   //  Dans ce cas-là, on sera probablement intéressé par l'Interface "Comparator" (documentation sur le siteOracle)



}
