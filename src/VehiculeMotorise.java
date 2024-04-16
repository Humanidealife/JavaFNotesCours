public class VehiculeMotorise {

    Moteur moteur;
    int vitesse;

    int accelerer(int vitesse){
        System.out.println("J'accélère");
        //this.vitesse est la propriété de l'objet
        this.vitesse += vitesse;
        return this.vitesse;
        // acienne version
        // return vitesse + vitesseEnPlus;
    }

    //void signifie que cette méthode ne retourne rien
    //"Passager" est le type du paramètre ou argument, et cette classe va être créée
    //"passager" est le nom de cet argument
    Ville transporter (Passager passager, Ville villeDeDepart){
        //Si une méthode de cette classe VehiculeMotorise ne convient pas à la classe Voiture
        //Dans ce cas-là on a tout à fiat le droit de réécrire la méthode concernée dans la classe fille
        System.out.println("Le véhicule transporte un passager qui s'appelle " + passager.prenom + " " + passager.nom);
        System.out.println("Et la ville de départ est " + villeDeDepart.nom + " " + villeDeDepart.pays);

        //retour de la villeDArrivee
        //Il faut d'abord instancier une ville
        Ville villeDArrivee = new Ville();
        villeDArrivee.nom ="Rennes";
        villeDArrivee.pays = "France";
        //Le type du résultat que l'on fournit en retour doit être déclaré en début de la méthode
        return villeDArrivee;
    }
    /*VehiculeMotorise(){

    }*/

    //On peut ajouter également (dans une classe) un constructeur qui prend en paramètre un type complexe, par exemple une classe comme paramètre
    VehiculeMotorise(Moteur moteur){
        this.moteur = moteur;
        System.out.println("Cette voiture est construite avec moteur comme paramètre");
    }
}
