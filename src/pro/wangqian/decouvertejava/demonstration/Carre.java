package pro.wangqian.decouvertejava.demonstration;

//On fait en sorte que pro.wangqian.decouvertejava.demonstration.Carre implémente "Comparable"
public class Carre implements Comparable{
    //Cette Class dispose d'une propriété qui est cote (de type "long")
    //long cote;

    //Si le type de la propriété est une Class conteneur
    Long cote;

    //Un constructeur à pro.wangqian.decouvertejava.demonstration.Carre
    Carre(long cote){
        this.cote = cote;
    }
    //On va redéfinir la méthode "equals()"
    //Pour rappel, "equals()" est une méthode qui est définie au niveau de "Object"
    //Clique droit, "Generate", "Override Methods", puis "equals"

    @Override
    //La méthode "equals()" est utilisée dans bien des situations, pas seulement lorsque l'Objet se trouve dans une Collection
    //On va d'abord vérifier si l'Objet passé en paramètre est bien un "pro.wangqian.decouvertejava.demonstration.Carre", qui pourrait s'agir d'autres choses
    public boolean equals(Object obj) {
        //return super.equals(obj);
        if (!(obj instanceof Carre)){
            return false;
        }
        //Dans le cas contraire, il va s'agir d'un pro.wangqian.decouvertejava.demonstration.Carre
        Carre autreCarre = (Carre)obj;
        //On va vérifier si le "cote" de cet "autreCarre" a la même valeur que le "cote" du "pro.wangqian.decouvertejava.demonstration.Carre" courant
        //Dans ce cas-là, on utilise les mêmes règles que "compareTo"
        return cote == autreCarre.cote;
    }
    //Le fait d'avoir implémenté "compareTo" nous oblige dans quelques sortes de redéfinir "equals()"
    //Mais le fait de redéfinir "equals()" nous oblige de redéfinir une autre méthode "hashCode()"
    //"hashCode" est une méthode qui retourne un "int", cet "int" doit être unique. Chaque instance doit montrer un "hashCode" différent
    // sauf si "hashCode" les considère équivalentes.
    //La consigne de l'éditeur est la suivante :
    //  Si la méthode "equals" de deux instances indique une égalité, la méthode "hashCode" doit renvoyer la même valeur.
    //Parce que dans le cas d'un "hashSet" ou d'une "hashTable", le "hashCode " est appelé en premier pour savoir si deux Objets
    //  sont potentiellement équivalents.
    //Et cette façon est plus rapide qu'utiliser "equals" ; ensuite Java va confirmer cette équivalence en appelant la méthode "equals"
    //On va écrire cette méthode "hashCode"


    @Override
    //On a indiqué que deux "pro.wangqian.decouvertejava.demonstration.Carre" étaient équivalents si leur "cote" étaient égaux.
    //On va donc utiliser cette même règle pour le "hashCode".
    //Un "Long" bénéficie déjà de son propre "hashCode", on va donc simplement faire un "return"
    public int hashCode() {
        //Le "hashCode" du "pro.wangqian.decouvertejava.demonstration.Carre" est donc dépendant du "hashCode" du "cote", deux "pro.wangqian.decouvertejava.demonstration.Carre" différents auront deux "hashCode" différents,
        //  deux "pro.wangqian.decouvertejava.demonstration.Carre" équivalents, donc les "cote" sont équivalents, auront un "hashCode" identique.
        return cote.hashCode();
    }

    @Override
    //On va fait en sorte que des "pro.wangqian.decouvertejava.demonstration.Carre" puissent se comparer.
    public int compareTo(Object o) {

        //On va considérer que ce qui est passé en paramètre est un autreCarre
        //On va effectuer un trans-typage de "o"

        //Dans cette méthode, on a comparé nous-même le "cote" de chacun des "pro.wangqian.decouvertejava.demonstration.Carre" pour savoir quel "pro.wangqian.decouvertejava.demonstration.Carre" est le plus grand

        Carre autreCarre = (Carre)o;

        //Mais comment sait-on si un pro.wangqian.decouvertejava.demonstration.Carre est plus grand qu'un autreCarre ?
        //Sous-entendu si sa surface est plus grande qu'un autreCarre, il suffit de comparer son "cote"
        /*
        if (cote==autreCarre.cote) return 0;
        if (cote > autreCarre.cote) return 1;
        return -1;
        */

        //La méthode "compareTo" sera très simple à écrire, puisqu'il s'agit de comparer le "cote" de chacun des "pro.wangqian.decouvertejava.demonstration.Carre",
        //  on peut utiliser l'ordre naturel de la Class "Long" du "cote"
        return this.cote.compareTo(autreCarre.cote);

    }
}
