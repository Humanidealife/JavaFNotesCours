package demonstration.transport.naval;

import demonstration.transport.Amarrable;

public class Port {

    //Cette méthode va recevoir en paramètre l'engin qui va venir s'amarrer au demonstration.transport.naval.Port
    //  le plus inmportant c'est que l'engin soit amarrable, peu imorte que ce soit un bateau ou autre
    //Donc ce que l'on va recevoir en paramètre c'est un objet qui est au moins amarrable
    //C'est-à-dire qui implémente au minimum demonstration.transport.Amarrable
    public void accueilDEngin(Amarrable amarrable){

        //A gauche de "instanceof" on met l'objet que l'on veut tester, en l'occurence amarrable ce qui est passé en paramètre
        //A droite de "instanceof" on met le type dont on veut savoir si amarrable est issue
        if (amarrable instanceof Bateau){
            //Ici ce bloc d'instructions n'a pour l'instant pas de grande importance
            System.out.println("Il s'agit bien d'un bateau ");

        }
        //On a besoin de connaître comment ça amarre l'engin au demonstration.transport.naval.Port, donc combien de cordes dont bénéficie
        int nbCordesPort = amarrable.nbCordes(50);
        System.out.println("Le nombre de cordes nécessaires est de " + nbCordesPort);
    }
}
