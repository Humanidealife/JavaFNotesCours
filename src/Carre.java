//On fait en sorte que Carre implémente "Comparable"
public class Carre implements Comparable{
    //Cette Class dispose d'une propriété qui est cote (de type "long")
    //long cote;

    //Si le type de la propriété est une Class conteneur
    Long cote;

    //Un constructeur à Carre
    Carre(long cote){
        this.cote = cote;
    }

    @Override
    //On va fait en sorte que des Carre puissent se comparer.
    public int compareTo(Object o) {

        //On va considérer que ce qui est passé en paramètre est un autreCarre
        //On va effectuer un trans-typage de "o"

        //Dans cette méthode, on a comparé nous-même le "cote" de chacun des "Carre" pour savoir quel "Carre" est le plus grand

        Carre autreCarre = (Carre)o;

        //Mais comment sait-on si un Carre est plus grand qu'un autreCarre ?
        //Sous-entendu si sa surface est plus grande qu'un autreCarre, il suffit de comparer son "cote"
        /*
        if (cote==autreCarre.cote) return 0;
        if (cote > autreCarre.cote) return 1;
        return -1;
        */

        //La méthode "compareTo" sera très simple à écrire, puisqu'il s'agit de comparer le "cote" de chacun des "Carre",
        //  on peut utiliser l'ordre naturel de la Class "Long" du "cote"
        return this.cote.compareTo(autreCarre.cote);

    }
}
