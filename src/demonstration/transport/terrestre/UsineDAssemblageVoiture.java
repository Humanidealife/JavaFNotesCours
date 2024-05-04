package demonstration.transport.terrestre;

import demonstration.transport.UsineDAssemblage;

public class UsineDAssemblageVoiture extends UsineDAssemblage {
    //Grâce à la covariance des méthodes on peut réécrire une méthode de la classe Parente, ici c'est assembler
    //  et modifier le type de retour
    public Voiture assembler(){
        Voiture v = new Voiture();
        return v;
    }
}
