public class Port {

    //Cette méthode va recevoir en paramètre l'engin qui va venir s'amarrer au Port
    //  le plus inmportant c'est que l'engin soit amarrable, peu imorte que ce soit un bateau ou autre
    //Donc ce que l'on va recevoir en paramètre c'est un objet qui est au moins amarrable
    //C'est-à-dire qui implémente au minimum Amarrable
    void accueilDEngin(Amarrable amarrable){
        //On a besoin de connaître comment ça amarre l'engin au Port, donc combien de cordes dont bénéficie
        int nbCordesPort = amarrable.nbCordes(50);
        System.out.println("Le nombre de cordes nécessaires est de " + nbCordesPort);
    }
}
