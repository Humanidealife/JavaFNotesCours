public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Deuxième ligne");
        int age;
        long nombreDePas = 14527785478789L;
        int anneeDeNaissance;
        anneeDeNaissance = 1998;
        float prixEssence = 1.78F;
        char prenomInitial = 'Q';
        prenomInitial = '\uFF27'; // un caractère encodé en format unicode
        boolean homme = true;
        String prenom = "Quentin";
        prenom = "Q";
        String monPrenom = prenom = "Etienne";
        System.out.println(prenom);
        System.out.println(monPrenom);

        int quotient = 5/2;
        System.out.println(quotient);

        int reste = 5%2;
        System.out.println(reste);

        float quotientFloat = 5F/2;
        System.out.println(quotientFloat);

        float quotientEntier = 5/2;
        System.out.println(quotientEntier);

        boolean estCeVrai = 20<30;
        System.out.println(estCeVrai);

        int nb1 = 25;
        int nb2 =30;

        boolean comparaison = nb1>nb2;
        System.out.println(comparaison);

        char char1 = 'c';
        char char2 = 'j';
        boolean comparaisonChar = char1 < char2;
        System.out.println(comparaisonChar);

        boolean bool1 = true;
        boolean bool2 = false;
        boolean boolResultat = bool1&&!bool2;
        System.out.println(boolResultat);
        age = 28;
        int nb;
        nb = age++;
        System.out.println(age);
        System.out.println(nb);

        String chaineConcatenee = "Voici une chaîne " + "concaténée";
        System.out.println(chaineConcatenee);

        String debut = "C'est le début";
        String fin = " et puis c'est fini";
        String histoire = debut + fin;
        System.out.println(histoire);
        System.out.println(debut +fin);

        String numero = "Mon numéro est ";
        System.out.println(numero+28);
        System.out.println(numero+28+1);
        System.out.println(numero+(28+1));

        int x = 42;
        if (x<=10){
            System.out.println(x + " est inférieur ou égale de 10");
        }
        else if (x>=30){
            System.out.println(x + " est suprérieur de 30");
        }
        else {
            System.out.println(x + " est supérieur de 10 mais inférieur de 30");
        }

        int somme = 0;
        switch (somme) {
            case 30 :
                System.out.println("La somme est de 30");
                break;
            case 300 :
                System.out.println("La somme est de 300");
                break;
            case 15 :
                System.out.println("La somme est de " + somme);
                break;
            default :
                System.out.println("Cette somme ne correspond à aucune proposition");
                break;
        }


        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("la fin du for");
        int nb3 = 0;
        while (nb3<15){
            System.out.println(nb3);
            nb3+=3;
            System.out.println(nb3);
        }

        boolean jeContinue = true;
        while (jeContinue) {
            System.out.println("Une itération");
            jeContinue=false;
        }

       /*boolean caContinue = false;
        do {
            System.out.println("Une autre itération");
            caContinue =true;
        }
        while (caContinue)*/

        boolean maBoucle = true;
        int chiffre = 0;
        while (maBoucle){
            chiffre++;
            System.out.println("chiffre = " + chiffre);
            if (chiffre == 5){
                continue;
            }
            System.out.println("quand le chiffre vaut 5, on ne voit pas ce message");
            if (chiffre ==10){
                maBoucle = false;
            }
        }

        Voiture maVoiture1 = new Voiture();
        maVoiture1.nbPortes = 3;
        maVoiture1.automatique = true;
        maVoiture1.couleur = "Blanche";

        System.out.println("La couleur de ma voiture 1 est de couleur " + maVoiture1.couleur);

        maVoiture1.couleur = "Grise";
        maVoiture1.nbPortes = 5;
        System.out.println("Mais finalement la couleur de ma voiture 1 est de couleur " + maVoiture1.couleur + " et elle dispose de " + maVoiture1.nbPortes + " portes");

        //Sans lui affecter de valeur, la valeur de maVoiture2 est indéfinie. Sa valeur par défautn'est pas null
        Voiture maVoiture2 = null;

        Voiture maVoiture3 = new Voiture();
        System.out.println(maVoiture3.couleur);

        if (maVoiture3.couleur == null){
            System.out.println("La couleur de ma voiture 3 est null");
        }

        //On peut utiliser null pour supprimer la valeur actuelle d'une variable de type Objet

        maVoiture1.couleur = null;
        System.out.println(maVoiture1.couleur);
        //En écrivant ceci, on exécute toutes les instructions qui se trouvent dans la méthode "klaxonner".
        maVoiture1.klaxonner();

        maVoiture1.accelerer();
        // et si je mets comme ci-dessous, j'afficherai alors la valeur retournée de la méthode "accelerer"
        System.out.println("la nouvelle vitesse après l'accélérarion est " + maVoiture1.accelerer()+ "km/h");

        // On peut également conserver le résultat dans une variable
        int nouvelleVitesse = maVoiture1.accelerer();
        System.out.println(nouvelleVitesse);

        int nouveauRapport = maVoiture1.passerRapport(true);
        System.out.println(nouveauRapport);
        System.out.println(maVoiture1.rapportCourant);

        maVoiture1.tournerOrientation(true, 10);
        maVoiture3.tournerOrientation(false, 30);

        Voiture maVoiture4 = new Voiture();
        Voiture maVoiture5 = new Voiture();
        //Si l'on veut comparer les deux variables maVoiture4 et maVoiture5 avec l'opérateur "=="
        boolean egaleOuNon = maVoiture4 == maVoiture5;
        //Il s'agit de comparer les emplacements des deux objets qui se trouvent dans chacune des varaibles, les emplacements dans la mémoire
        //Ces emplacements sont différents
        //Le résultat est false
        System.out.println(egaleOuNon);

        //Les String, en toute logique, devraient suivre exactement la même règle
        String chaine1 = "Le ciel est bleu";
        String chaine2 = "Le ciel est bleu";
        //Etant donné il s'agit de deux objets, il devrait être à deux emplacements différents dans la mémoire
        //Puis le résultat de leur comparaison devrait retourner false
        boolean comparaisonStrings = chaine1 == chaine2;
        //Mais le résultat est en réalité true.
        //Parce que quand on affecte la valeur à un String, contrairement à n'importe quel objet, jusqu'ici,
        //on n'a pas instancier le String en faisant appel explicitement au mot clé "new".
        //Tout cela est une spécificité de String
        //On peut construire un String en passant directement la valeur du String sans faire appel explicitement au mot clé "new"
        //c'est-à-dire : sans construire l'objet explicitement
        //Quand on construit le String de cette manière-là, afin d'optimiser les performences
        //Java va stocker en mémoire le String à un seul emplacement bien particulier
        //Et à chaque fois que l'on construit de la même manière un autre String en affectant exactement la même valeur
        //Java va réutiliser le même objet
        //Il s'agit donc du même emplacement de mémoire
        System.out.println(comparaisonStrings);

        //On peut également construire un String comme n'importe quel objet
        //En faisant appel au mot clé "new"
        //On peut passer quelque chose en paramètre
        String chaine3 = new String("Le ciel est bleu");
        String chaine4 = new String("Le ciel est bleu");
        boolean comparaisonString23 = chaine2 == chaine3;
        boolean comparaisonString34 = chaine3 == chaine4;
        System.out.println(comparaisonString23);
        System.out.println(comparaisonString34);

        //Comme on ne peut pas garantir que le signe "==" nous renvoie "true" pour deux String que l'on considère identiques
        //On va donc comparer les String en utilisant une méthode : "equals"
        //Cette méthode "equals" est utilisable quelque soit l'objet
        //Avec la méthode "equals", on vérifie si sémentiquement ces deux String peuvent être considérés égaux
        //"equals" va comparer les deux String caracères par caractère
        boolean comparaisonStringEquals = chaine3.equals(chaine4);
        System.out.println(comparaisonStringEquals);
        //Mais on peut employer la méthode, qui est spécifiquement à String, "equalsIgnoreCase"
        String chaine5 = new String("LE CIEL EST BLEU");
        boolean comparaisonSens = chaine4.equalsIgnoreCase(chaine5);
        System.out.println(comparaisonSens);


    }
}