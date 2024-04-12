public class Voiture {
   int nbPortes = 5;
   boolean automatique;
   // la propriété couleur bénéficie d'une valeur par défaut, qui est null.
   //String n'est pas un type primitif, String est un type objet, c'est une classe
   //Cette classe qui représente une chaîne de caractères bénéficie de propriétés
   //  dont une est la séquence des caractères qui compose la chaîne de caractères
   String couleur;
   //Ajout d'une propriété, comme on ne donne pas de valeur de départ, sa valuer par défaut va être 0
   int rapportCourant;
   int vitesse = 20;
   //La classe Voiture n'a plus de propriétés comme carburation et nbCylindres
   //Mais comme on veux à partir de la Voiture avoir accès à ces informations
   //On va donc rajouter une nouvelle propriété : qui se nomme "moteur" et de type "Moteur"
   //Voici une nouvelle propriété qui va aussi caractériser la Voiture : moteur
   //On a encapsulé les deux propriétés : "carburation" et "nbCylindres" dans une nouvelle classe : class Moteur
   //Ce concept d'encapsulation est fondamental dans les langages d'objet
   //La valeur par défaut des prorpiétés de type Objet est : "null"
   Moteur moteur;

   //Nous devons indiquer si cette opération est susceptible de retourner un résultat ou pas.
   //Ici l'oprération "klaxonner" ne retourne aucun résultat
   //dans ce cas-là, il faut préfixer le nom de méthode par "void"(vide). Cela indique que la méthode ne retourne aucun résultat
   void klaxonner(){
      System.out.println("Tutut!");
   }

   int accelerer(){
      System.out.println("J'accélère");
      //Nouvelle instruction : le code qui va invoquer cette méthode, voudra savoir également à l'issue de l'accélération
      //quelle est la nouvelle vitesse atteinte par la voiture
      //Il s'agira dans cette méthode de retourner un résultat qui est donc cette nouvelle vitesse
      //Il faut donc indique devant le nom de la méthode, le type du résultat retourné -> int
      //Pour retourner un résultat à la fin de l'opération, à la fin de la méthode -> return; suivi du résultat retourné
      return 100;
   }
   //Surcharge dela méthode accelerer
   //Ici cette méthode reçoit un paramètre, un int vitesseEnPlus, qui correspond à la vitesse en plus que l'on souhaitait ajouter
   //à ma vitesse courante
   //cette méthode retourne un int, qui est la vitesse finale atteinte suite à cette accélération
   //qui est donc le résultat de "vitesse + vitesseEnPlus"

   //Mais lorsque le paramètre reçu dans la méthode a le même nom que la propriété de l'objet que l'on manipule
   //C'est le paramètre de la méthode qui a la priorité
   //Quand le paramètre qui a exactement le même nom que l'attibut de la classe, on doit écrire
   int accelerer(int vitesse){
      System.out.println("J'accélère");
      //this.vitesse est la propriété de l'objet
      this.vitesse += vitesse;
      return this.vitesse;
      // acienne version
      // return vitesse + vitesseEnPlus;
   }


   //La voiture peut passer un rapport
   //Mais cette méthode est possiblement être paramètrée lors de son invocation
   //Il faut donc mettre dans les paraenthèses les différents paramètres que l'on peut valoriser lors de son invocation
   //Il faut connaître le rapport courant de la voiture
   //this : dans la méthode passerRapport de la classe Voiture, c'est le rapportCourant de la maVoiture4 qui est incrémenté de 1
   //parce que c'est la méthode passerRapport de maVoiture4 qui a été invoquée
   //jusque là le mot clé "this" n'a pas été utilisé pour indiquer que dans la méthode on veut manipuler l'objet courant
   //mais il est tout à fait autorisé de le faire.
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
   void tournerOrientation (boolean droite, int angle){
      String droiteOuGauche = null;
      if (droite){
         droiteOuGauche = "droite";
      }
      else{
         droiteOuGauche = "gauche";
      }
      System.out.println("La voiture va tourner à " + droiteOuGauche +" d'un angle de " + angle);
   }
   // Ou comme cela

    void tournerOrientation (String droiteOuGauche, int angle){
      System.out.println("La voiture va tourner à " + droiteOuGauche +" d'un angle de " + angle);
   }


}
