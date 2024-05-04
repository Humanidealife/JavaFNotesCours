package demonstration.transport.naval;

import demonstration.transport.Amarrable;

public class Bateau extends VehiculeMaritime implements Amarrable {
    //Tout comme une classe qui implémente une Interface, doit définir le contenu des méthodes de l'Interface
    //  une classe qui hérite d'une classe abstraite doit définir l'implémentation des méthodes abstraites
    //  ici la méthode klaxonner

    public int masse;

    @Override
    public int nbCordes(int vitesseDuVent) {
        //return masse/10 + vitesseDuVent/100;
        int cordesBateau = masse/10;
        cordesBateau += vitesseDuVent/20;
        return cordesBateau;
    }

    @Override
    void klaxonner() {
        System.out.println("Pop-pop");
    }
}
