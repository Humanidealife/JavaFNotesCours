//Pour que les types de boîtes soient claire, on peut créer une classe avec seulement les 3 propriétés automatique, semiaotomatique et manuelle
//  plutôt que de noyer dans la classe Voitures avec d'autres propriétés existantes
public class TypeBoiteVitesse {
    //"final" est le mot clé qui signifie que la valeur de cette propriété ne pourra jamais être modifiée.
    //  C'est-à-dire ici on définit des constances, dans ce cas-là, selon la convention, il faut nommer ces variables constantes tout en Majuscule
    static final int AUTO = 1;
    static final int SEMI_AUTO = 2;
    static final int MANUELLE = 3;
}
