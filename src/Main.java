import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    int unAttribut = 5;
    void quelqueChose(){
        System.out.println("Une méthode de la classe Main");
    }

    //Ce qui est spécial pour la classe "Main", c'est qu'elle possède une méthode "main"
    //La méthode "main" est statique, mais cette méthode constitue le point d'entrée de notre programme, notre logiciel
    //  quand "main" est écrite ainsi "public static void main(String... args){}"
    //Lorsque l'on exécute cette classe avec l'IDE ou avec des lignes de commande, on indique à la machine virtuelle que "Main" dispose
    //  la méthode "main", et que c'est à cet endroit-là que l'on veut commencer
    //Cette méthode "public static void main(String... args){}", dans un logiciel, pourrait apparaître à de multiples endroits.
    //Par exemple, on peut ajouter cette méthode "main" dans la classe "Voiture"

    //Le tableau de String ou cet ensemble de String nous permet, lorsque l'on exécute la classe, de lui envoyer des paramètres complémentaires
    public static void main(String[] args) {

        Main mn = new Main();
        System.out.println(mn.unAttribut);
        mn.quelqueChose();


        System.out.println("Hello world!");
        //pour accepter un argument
        //System.out.println("Hello c'est vrai" + args[0]);
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
        //maVoiture1.automatique = true;
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

        /*
        maVoiture1.accelerer();

        // et si je mets comme ci-dessous, j'afficherai alors la valeur retournée de la méthode "accelerer"
        System.out.println("la nouvelle vitesse après l'accélérarion est " + maVoiture1.accelerer()+ "km/h");  */

        // On peut également conserver le résultat dans une variable
        /*
        int nouvelleVitesse = maVoiture1.accelerer();
        System.out.println(nouvelleVitesse);
        */

        /*int nouveauRapport = maVoiture1.passerRapport(true);
        System.out.println(nouveauRapport);
        System.out.println(maVoiture1.rapportCourant);*/

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

        //L'objet qui va être manipulé dans la méthode "passerRapport" sera "maVoiture4".
        //maVoiture4.passerRapport(true);

        maVoiture1.accelerer(70);
        System.out.println(maVoiture1.vitesse);

        Voiture maVoiture6 = new Voiture();
        maVoiture6.nbPortes = 5;
        //Pour qu'une voiture bénéficie d'un moteur, il faut également instancier la classe Moteur pour obtenir un objet de type Moteur
        Moteur moteur6 = new Moteur();
        moteur6.carburation = "Diesel";
        moteur6.nbCylindres = 6;
        //ce moteur6 que l'on vient de créer, il faut l'affectuer à la propriété moteur de maVoiture6
        maVoiture6.moteur = moteur6;

        System.out.println("Le nombre de cylindres de la voiture6 est de " + maVoiture6.moteur.nbCylindres);

        //On travaille ici avec la référence du moteur6
        //Ici il ne s'agit en aucun cas de clôner ou de dupliquer le moteur de la maVoiture6 pour en faire le moteur de maVoiture1
        //Il s'agit simplement de copier la référence à ce moteur6, et donc d'indiquer que l'emplacement dans la mémoire où se trouve le moteur6
        //  de maVoiture6 et maVoiture1 est le même.
        //On parle ici de copie par référence (par opposition à la copie par valeur -> ce qui est utilisée pour les types primitifs)

        maVoiture1.moteur = moteur6;
        //Comment dissocier un moteur à une voiture ?
        //Il suffit de valoriser la prorpiété moteur de la Voiture en "null"
        //Mais le motuer6 existe toujours en part entière, il n'est seulement plus associé à la maVoiture6
        maVoiture6.moteur = null;

        //Mais si l'on approte une modification au moteur6, cette modification sera visible pour toutes les voitures qui le possèdent

        Passager passager1 = new Passager();
        passager1.nom = "AUBOIS";
        passager1.prenom = "Anatole";
        Ville villeDeDepart1 = new Ville();
        villeDeDepart1.nom = "Le Mans";
        villeDeDepart1.pays = "France";
        //On donne donc en paramètre de cette méthode un objet (passager1) de type Passager
        //On peut récupérer ce retour ici en le stockant dans une variable du même type que le résultat retourné
        Ville villeDArrivee1 = maVoiture1.transporter(passager1,villeDeDepart1);
        System.out.println("Le passager est arrivé dans la ville de " + villeDArrivee1.nom + " " + villeDArrivee1.pays);

        //Comme il s'agit d'une prorpiété statique, il est en réalité pas nécessaire de disposer d'une instance, d'un objet
        // pour savoir de combien de routes dispose une voiture
        System.out.println(maVoiture1.nbRoues);
        //On peut simplement faire
        System.out.println("Une voiture en général a " + Voiture.nbRoues + " roues");
        //Des propriétés ou attributs statiques peuvent aussi être changés de valeur
        //On peut modifier le nombre de roues des voitures en général
        Voiture.nbRoues = 5;
        System.out.println("Une voiture en général a " + Voiture.nbRoues + " roues");

        Voiture.klaxonner();

        Voiture.tournerOrientation(false, 30);
        Voiture.tournerOrientation("droite", 56);

        Voiture maVoiture7 = new Voiture("violete");

        Voiture maVoiture8 = new Voiture("Jaune", 4);

        //On peut également faire comme ci-dessous
        //La variable pourrait être de type VehiculeMotorise
        //maVoiture9 a plusieurs formes, ce que l'on appelle le polymorphisme
        //On construit un objet de type Voiture qui sera déposé dans la mémoire avec une adresse
        //On localise cette adresse à travers d'une variable maVoiture9 sous le type VehiculeMotorise
        //A partir de là, maVoiture9 est considérée comme un VehiculeMotorise, mais non-plus comme une Voiture
        //  les proprétés spécifiquement liées à une Voiture sont inconnues pour maVoiture9
        VehiculeMotorise maVoiture9 = new Voiture();
        //Il serait intéressant de pouvoir indiquer explicitement que maVoiture9 n'est pas qu'un VehiculeMotorise, elle est aussi une Voiture
        //  lors de l'utilisation des propriétés spécifiques d'une Voiture
        //Il y a deux manière de faire
        //Soit créer une nouvelle variable, donner à cette variable en valeur de maVoiture9, mais avec un petit préfixe
        //  dans ce préfixe on indique le type de la classe sous laquelle on veut considérer maVoiture9SousFormeVoiture.
        //Avec cette façon, maVoiture9 va être transtypée en Voiture pour être associée à la variable maVoiture9SousFormeVoiture,
        //  à partir de là, on peut utiliser maVoiture9SousFormeVoiture à chaque fois que l'on a besoin accéder à une propriété ou à une méthode
        //  spécifique à la classe Voiture
        /*Voiture maVoiture9SousFormeVoiture = (Voiture)maVoiture9;*/

        //Mais si l'on ne veut pas créer une varaible supplémentaire, on peut transtyper la variable directement en écrivant
        //C'est un transtypage à la volée
        //((Voiture)maVoiture9).automatique = true;


        Moteur moteur10 = new Moteur();
        Voiture maVoiture10 = new Voiture(moteur10);

        //On peut obtenir un VehiculeMotorise en utlisant l'UsineDAssemblage
        UsineDAssemblage uda = new UsineDAssemblage();

        //UsineDAssemblage ne nous dit pas de quel type de VehiculeMotorise il s'agit.
        VehiculeMotorise vm1 = uda.assembler();


        UsineDAssemblageVoiture udaVoiture = new UsineDAssemblageVoiture();
        Voiture v1 = udaVoiture.assembler();

        Bateau bt1 = new Bateau();
        bt1.masse = 200;
        Port p1 = new Port();
        p1.accueilDEngin(bt1);

        Voiture peugeot206 = new Voiture();
        //Mon Objet est toujours une Voiture, mais dans le code on considère que cet Voiture comme un VehiculeMotorise, ni plus ni moins
        VehiculeMotorise peugeot307 = new Voiture();
        //On peut également, grâce au fait que Voiture implémente l'Interface Vidangeable, considérer une Voiture sous forme d'Objet Vidangeable
        //A ce moment là, bien sûr que la peugeot508 est ici, ne pourrait être que Vidangeable
        //La seule chose à laquelle j'ai accès, c'est la méthode vidanger
        Vidangeable peugeot508 = new Voiture();

        //System.err.println("Erreur");
        //Cette méthode statique "exit" reçoit en paramètre un "int" qui va définir le code de retour du programme présent,
        // car "exit" va metrtre fin au programme présent, une fin normale ou anormale.
        //  lorsque cette fin est considéérée normale, le "int" qui va être passer en paramètre est "0"

        //Le code ci-dessous va metre fin à la machine virtuelle, avec une code qui signifie "tout s'est bien passé".

        //Quand la valeur est différente de "0", par exemple "1" : par convention on considère que le programme s'est arrêté en erreur
        //  avec un code erreur "1", il n'y a que le développeur seul qui sait la signification du code erreur "1"

        //Une autre méthode statique intéressante du "System"
        //Cette méthode au retour d'un "long", ce "long" représente le nombre de millisecondes écoulé depuis le 1 janvier 1970.
        //  C'est une manière très simple de connaître précisément la date actuelle
        long time = System.currentTimeMillis();
        System.out.println(time);
        //La plupart des machines sont capables de mesurer le temps de manière encore plus précise que des millisecondes
        //  en allant jusqu'aux nanoseconde
        //On va recevoir en retour des nanosecondes à partir d'une date arbitraire que l'on ne connaîssait pas
        //On ne connaît pas la référence de départ, mais "nanoTime" nous permet d'analyser très finement des écarts de temps.
        //Par exemple, combien de temps cela prend pour affichier "Hello"
        long timeStart = System.nanoTime();
        System.out.println("Hello");
        long timeEnd = System.nanoTime();
        System.out.println(timeEnd - timeStart);

        //Cette méthode statique ci-dessous va nous retourer les propriétés du système hôte

        System.out.println(System.getProperties());

        //On peut également connaître les variables d'environnement associées à l'utilisteur et au système
        // qui m'ont permis de démarrer mon programme
        //"getenv" nous retoure l'intégralité de toutes les variables d'environnement connues
        //  par exemple : la variable d'environnement "path"
        //Si l'on cherche une variable d'environnement particulière, on peut dans "getenv()",
        //  passer en valeur le nom de cette variable recherchée
        /*System.out.println(System.getenv("Path"));*/

        //Pour instancier "Scanner", il faut impérativement passer en paramètre du constructeur le canal ou le flux d'entrée
        //  en l'occurence "System.in"
        //L'entrée qui est scannée, peut être parcourue prograssivement à partir du début de multiples manières
        /*Scanner sc = new Scanner(System.in);*/

        //La plus simple étant de lire la prochaine ligne avec "nextLine"
        //String ligneSuivante = sc.nextLine();
        //System.out.println(ligneSuivante);

        //Une autre méthode pratique "nextInt"
        //int entierSuivant = sc.nextInt();
        /*System.out.println(entierSuivant);*/

        //Il y a aussi la méthode "nextBoolean" pour la classe "System"

        //Pour un "int" c'est la classe Integer
        Integer i = Integer.valueOf(10);
        System.out.println(i);
        float f1 = Float.parseFloat("14.3");

        //Si l'on veut explicitement donner une valeur à la propriété "rapportCourant"
        //Comme ceci toutes les caractéristiques de l'objet sont accessible
        //Par exemple la méthode ".equals()"
        maVoiture6.rapportCourant = Integer.valueOf(4);//Mais cela n'est pas vraiment nécessaire avec l'auto-boxing
        //On peut en réalité directement faire comme ci-dessous:
        //rapportCourant contient bien un "Integer", un objet
        maVoiture7.rapportCourant = 3;

        //Avec auto-unboxing, on peut écrire directement
        maVoiture7.rapportCourant++;

        System.out.println(maVoiture6.rapportCourant);

        //La conversion de type "int" est converit en "String"
        //Avec cette façon, il faut que la valeur de la "String" soit compatible avec le "int"
        int i2 = Integer.parseInt("89");
        System.out.println(i2);

        //Transformer un "String" à un autre type, cela passe généralement par la méthode "parse" de la calsse conteneur du type cible
        //Pour faire l'inverse  c'est possible avec
        String i3 = String.valueOf(i2);
        System.out.println(i3);

        //Pour convertir entre les types numériques
        int i4 = 45;
        long i4AsLong = i4;//Veriosn Java 17

        //"boiteSemiAuto" n'est ici qu'un raccourci pour dire la valeur "2"

        //Pour valoriser le "TypeBoiteVitesse" d'une Voiture, il fuat obligatoirement séléctionner
        //  une des valeurs de l'énumération "TypeBoiteVitesse", le choix est donc restreint à une gamme prédéterminée
        maVoiture10.typeBoite = TypeBoiteVitesse.SEMI_AUTO;

        //Avec un constructeur du "TypeBoiteVitesse"
        System.out.println("Le type de ma boîte de vitesse est " + maVoiture10.typeBoite.nomTypeBoite);

        //On peut aussi utiliser des tpes énumérés dans un "switch case"
        /*switch (maVoiture10.typeBoite) {
            case AUTO:
                System.out.println("La boîte de cette voiture est automatique");
                break ;
            case SEMI_AUTO:
                System.out.println("La boîte de cette voiture est semi-automatique");
                break ;
            case MANUELLE:
                System.out.println("La boîte de cette voiture est manuelle");
                break ;
        }*/

        //On peut également écrire comme
        //maVoiture10.typeBoite = 2;

        //Une autre méthode pour savoir quel est le "int" qui est derrière chaque propriété ? Par exemple pour semi-automatique
        System.out.println(maVoiture10.typeBoite.ordinal());

        //Comment récupérer un élément de l'énumération en donnant simplement son nom sous forme de String
        TypeBoiteVitesse semiAuto = TypeBoiteVitesse.valueOf("SEMI_AUTO");
        System.out.println("La boîte récupérée par le String est " + semiAuto.nomTypeBoite);

        //Voici un tableau unidimensionnel qui a une seule dimension de 5 éléments de type « int »
        //La valeur à l'intérieur du crochet désigne le nombre d'éléments, le nombre d'espaces que va comprendre le tableau
        //  et lorsqu'il s'agit d'un tableau unidimensionnel, il n'y a qu'un seul chiffre.
        //Pour manipuler ces tableaux, on est dans l'obligation de les affecter à des variables.
        //Le type de la variable sera le type du contenu du tableau
        //Ces tableaux pour l'instant sont constitués de 5 espaces vides. Plus précisément,
        //  de 5 fois la valeur 0 pour le tableau de "int", de 5 caractères vides pour le tableau de "char",
        //  et de 5 fois "null" pour le tableau de "Voiture". Les tableaux d'Objets sont au départ constitués de valeur "null".

        int [] tableauDeInt = new int[5];
        //S'il s'agissait d'un tableau de caractères
        char[] tableauDeChar = new char[5];
        //S'il s'agissait d'un tableau de Voiture (Objet, pas type primitif)
        Voiture[] tableauDeVoiture = new Voiture[5];

        //Pour valoriser un ou plusieurs éléments d'un tableau,
        tableauDeInt[1] = 15;
        tableauDeInt[4] = 18;
        //Pour afficher la valeur d'une des positions du tableau
        System.out.println("Le deuxième élément du tableau d'entier est " + tableauDeInt[1]);

        //Pour un tableau d'Object
        tableauDeVoiture[1] = maVoiture8;
        tableauDeVoiture[4] = new Voiture("Diesel",4);
        System.out.println("Le deuxième élément de mon tableau de voiture est " + tableauDeVoiture[1].couleur);

        //Mot clé "length" qui permet de connaître la taille d'un tableau.
        //Il s'agit de compter la taille du tableau sans aucune considération de son contenu
        System.out.println("La taille du tableau de caractères est " + tableauDeChar.length );

        Passager passagerA = new Passager();
        passagerA.nom = "AAA";
        passagerA.prenom = "Aaa";

        Ville depart = new Ville();
        depart.nom = "Aville";

        Ville etape1 = new Ville();
        etape1.nom = "Première étape";

        Ville etape2 = new Ville();
        etape2.nom = "Deuxième étape";

        Ville etape3 = new Ville();
        etape3.nom = "Troisième étape";

        Voiture voitureDeTransport1 = new Voiture();

        /*Ville[] villeEtapes = new Ville[3];
        villeEtapes[0] = etape1;
        villeEtapes[1] = etape2;
        villeEtapes[2] = etape3;*/

        //Il est dommage de construire un tableau intermédiaire pour passer en paramètre cet ensemble de villeEtapes
        //Depuis Java 5, il est possible de fournir un ensemble d'arguments du même type à une méthode ou à un constructeur
        //  sans avoir à les ajouter dans un tableau
        voitureDeTransport1.transporter(passagerA, depart, etape1, etape2, etape3);

        //Pour déclarer un tableau multidimensionnel, c'est toujours la même syntaxe.
        //On ajoute autant de crochets supplémentaires que de dimensions supplémentaires à notre tableau
        //Ci-dessous est un tableau à deux dimensions
        //On pourrait dire que "5" correspond aux colonnes du tableau, "3" aux lignes du tableau
        int[][] tableauDeuxDimensions = new int [5][3];
        //Pour valoriser les éléments du tableau : par exemple, un élément de la 2ème colonne et la 3ème ligne
        tableauDeuxDimensions[1][2] = 16;
        //Pour connaître le contenu du tableau, maintenant, il faut faire appel à deux boucles imbriquées
        //Une première pour itérer sur les colonnes
        //ici "length" correspond à la taille de la première dimension du tableau
        for (int col=0 ; col<tableauDeuxDimensions.length; col++){
            //Pour chaque colonne, une nouvelle boucle
            //Pour connaître la taille d'une ligne, puisqu'un tableau à deux dimensions est un tableau à une dimension dont chacun
            //  des élements est également un tableau
            for (int ligne=0; ligne<tableauDeuxDimensions[col].length; ligne++){
                System.out.println("L'élément contenu à la position " + col + "," + ligne + " vaut " + tableauDeuxDimensions[col][ligne]);
            }
        }

        //Un tableau de 4 dimensions
        int[][][][] tableau4D = new int[5][6][7][8];
        tableau4D[1][2][3][4] = 48;

        //Instanciation d'une "ArrayList"
        //Le type de la variable dans laquelle on va stocker cette "ArrayList" pourrait être "ArrayList", c'est ce qui paraît le plus évident,
        //  mais en général, on va plutôt utiliser le type de l'interface, on va donc utiliser le type "List".
        //C'est une bonne pratique, et cette bonne pratique est bien souvent valable pour toutes "Class" qui bénéficient d'une interface.
        //"List" et "ArrayList" ont besoin d'imports
        //"<>" s'appelle l'opérateur diamant
        List list = new ArrayList();
        //Pour ajouter quelque chose dans la List
        //Une List, comme toutes collections, n'acceptent que des objets, mais grâce à l'auto-boxing,
        //  on peut aussi ajouter des types primitifs, le type conteneur sera instancié de façon transparente
        //On peut mélanger le type des Objets dans une collection
        list.add(3);
        list.add(maVoiture3);

    }

}