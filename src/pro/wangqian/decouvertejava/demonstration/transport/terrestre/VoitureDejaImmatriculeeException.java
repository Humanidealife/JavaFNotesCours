package pro.wangqian.decouvertejava.demonstration.transport.terrestre;

//Ces Class exceptions par défaut héritent de la Class (java.lang.)Exception
public class VoitureDejaImmatriculeeException extends Exception{
    //On pourrait s'arrêter là, mais en général, on va ajouter à nos nouvelles Class Exception
    // au moins un constructeur qui va permettre à un utilisateur humain de rendre lisible cette Exception.
    //On doit donc faire : 1. Clique droite ->
    //                      2;Generate ->
    //                      3. Constructor ->
    //                      4.sélectionner le constructor sans paramètre
    //                                      également un constructor qui prend en paramètre un message seul


    public VoitureDejaImmatriculeeException() {
    }

    //Il s'agit d'une "String" libre que l'on peut préciser lorsque l'exception survient.
    public VoitureDejaImmatriculeeException(String message) {
        super(message);
    }
}
