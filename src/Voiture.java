public class Voiture extends VehiculeMotorise implements Vidangeable{
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
   static int nbRoues = 4;

   int nbPortes = 5;
   boolean automatique;
   // la propriété couleur bénéficie d'une valeur par défaut, qui est null.
   //String n'est pas un type primitif, String est un type objet, c'est une classe
   //Cette classe qui représente une chaîne de caractères bénéficie de propriétés
   //  dont une est la séquence des caractères qui compose la chaîne de caractères
   String couleur;

   //Ajout d'une propriété, comme on ne donne pas de valeur de départ, sa valuer par défaut va être 0
   int rapportCourant;

   //La classe Voiture n'a plus de propriétés comme carburation et nbCylindres
   //Mais comme on veux à partir de la Voiture avoir accès à ces informations
   //On va donc rajouter une nouvelle propriété : qui se nomme "moteur" et de type "Moteur"
   //Voici une nouvelle propriété qui va aussi caractériser la Voiture : moteur
   //On a encapsulé les deux propriétés : "carburation" et "nbCylindres" dans une nouvelle classe : class Moteur
   //Ce concept d'encapsulation est fondamental dans les langages d'objet
   //La valeur par défaut des prorpiétés de type Objet est : "null"

   //Un constructeur est un bloc d’instructions qui se trouve dans la classe instanciée et il est écrit comme ci-dessous :
   //On rajoute un paramètre dans le constructeur
   Voiture (String couleur){
      //Avec "super(new Moteur())", on est obligé d'écrire ainsi
      //Parce que maintenant il est impossible de construire une Voiture avec simplement la couleur, car le Parent
      //  nécessite de bénéficier d'un moteur
      //super(new Moteur());
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
   Voiture(){
      //On peut ajouter des paramtères dans le parenthèses de "super"
      //Cela construit la voiture en utilisant tout d'abord le constructeur du Parent qui prend en paramètre un moteur
      //C'est ailleur ce que l'on serait obligé de faire si l'on avait considéré qu'un VehiculeMotorise ne pouvait jamais être construit sans moteur
     super(new Moteur());
   }
   //On a maintenant donc deux constructeurs dans la classe voiture, et libre aux développeurs de choisir le constructeur le plus
   //  adapté à chaque utilisation
   //Attention : Rajouter un constructeur paramétré dans une classe, c'est également indiquer aux développeurs que ce paramètre est essentiel ou
   //  du moins d'une grande utilité.
   //On peut ajouter autant de constructeurs que l'on souhaite
   //Attention : On ne peut pas ajouter deux constructeurs qui disposent exactement la même nature de paramètres

   //Mais rien ne nous empêche de créer des constructeurs qui disposent de plusieurs paramètres

   /*Voiture(String couleur, int nbPortes){
      this.couleur = couleur;
      this.nbPortes = nbPortes;
      System.out.println("Cette voiture est construite avec la couleur et le nombre de portes comme paramètres");
   }*/

   //"super" nous permet, lors de l'exécution, de faire référence à la classe Parente, notamment pour en invoquer un constructeur
   Voiture(Moteur moteur){
      //Ici on invoque le constructeur de VehiculeMotorise qui prend en paramètre le moteur
      super(moteur);
   }

   //On peut construire une voiture en recevant en paramètre les constituants du moteur
   Voiture(String carburation, int nbCylindres){

      //super(new Moteur());
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
   static void klaxonner(){
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
   //this : dans la méthode passerRapport de la classe Voiture, c'est le rapportCourant de la maVoiture4 qui est incrémenté de 1
   //parce que c'est la méthode passerRapport de maVoiture4 qui a été invoquée
   //jusque là le mot clé "this" n'a pas été utilisé pour indiquer que dans la méthode on veut manipuler l'objet courant
   //mais il est tout à fait autorisé de le faire.
   //Cette méthode est une méthode d'instance, parce qu'elle implique l'attribut "rapportCourant"
   //Cet attribut "rapportCourant" de l'objet particulier est manipulé.
   //Cette méthode nécessite d'être invoquée à partir d'une Voiture en particulier
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

   //On ne peut retourner qu'une seule valeur d'un seul type,
   //Mais une méthode peut avoir plusieurs paramètres

   //Surchage de méthode
   //La méthode tournerOrientation au-dessus est surchargée par laméthode tournerOrientation en-dessous
   //Cette méthode est aussi statique, le comportement de cette méthode n'implique aucun atttribut d'instatnce
   //Cette méthode ne fait que manipuler les paramètres d'entrée
   static void tournerOrientation (boolean droite, int angle){
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

    static void tournerOrientation (String droiteOuGauche, int angle){
      System.out.println("La voiture va tourner à " + droiteOuGauche +" d'un angle de " + angle + "°");
   }


   Ville transporter (Passager passager, Ville villeDeDepart){
      //Si une méthode de cette classe VehiculeMotorise ne convient pas à la classe Voiture
      //Dans ce cas-là on a tout à fiat le droit de réécrire la méthode concernée dans la classe fille
      System.out.println("La voiture transporte un passager qui s'appelle " + passager.prenom + " " + passager.nom);
      System.out.println("Et la ville de départ est " + villeDeDepart.nom + " " + villeDeDepart.pays);

      //retour de la villeDArrivee
      //Il faut d'abord instancier une ville
      Ville villeDArrivee = new Ville();
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
}
