package pro.wangqian.decouvertejava.demonstration.transport.terrestre;

import pro.wangqian.decouvertejava.demonstration.transport.UsineDAssemblage;

public class UsineDAssemblageVoiture extends UsineDAssemblage {
    //Grâce à la covariance des méthodes on peut réécrire une méthode de la classe Parente, ici c'est assembler
    //  et modifier le type de retour
    public Voiture assembler(){
        Voiture v = new Voiture();
        //On va essayer d'attribuer une "immatriculation" à notre voiture.
        //Peu importe que cette immatriculation soit correcte ou pas, notre code comporte désormais une erreur.
        //Cette erreur nous indique que la méthode "immatriculer" rejette une exception, le type "NombreDeCaractereInvalideException" et que
        //  l'on devrait à ce niveau-là, nous nous en préoccupons.
        //Si l'on regarde les propositions de correction, on peut constater deux solutions :
        //1. On ne souhaite pas se préoccuper de cette exception à ce niveau (le niveau de la méthode "assembler"). On va donc
        //  rejeter(throws) un peu plus haut

        v.immatriculer("112233");
        return v;
    }
}
