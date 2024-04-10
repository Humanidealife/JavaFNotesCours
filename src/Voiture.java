public class Voiture {
   int nbPortes = 5;
   boolean automatique;
   // la propriété couleur bénéficie d'une valeur par défaut, qui est null.
   String couleur;

   //Nous devons indiquer si cette opération est susceptible de retourner un résultat ou pas.
   //Ici l'oprération "klaxonner" ne retourne aucun résultat
   //dans ce cas-là, il faut préfixer le nom de méthode par "void"(vide). Cela indique que la méthode ne retourne aucun résultat
   void klaxonner(){
      System.out.println("Tutut!");
   }
}
