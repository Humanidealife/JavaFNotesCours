public class Voiture {
   int nbPortes = 5;
   boolean automatique;
   // la propriété couleur bénéficie d'une valeur par défaut, qui est null.
   String couleur;
   //Ajout d'une propriété, comme on ne donne pas de valeur de départ, sa valuer par défaut va être 0
   int rapportCourant;
   int vitesseCourante;

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
   int accelerer(int vitesseEnPlus){
      System.out.println("J'accélère");
      return vitesseCourante + vitesseEnPlus;
   }


   //La voiture peut passer un rapport
   //Mais cette méthode est possiblement être paramètrée lors de son invocation
   //Il faut donc mettre dans les paraenthèses les différents paramètres que l'on peut valoriser lors de son invocation
   //Il faut connaître le rapport courant de la voiture
   int passerRapport(boolean augmenter){
      if (augmenter){
         rapportCourant++;
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
