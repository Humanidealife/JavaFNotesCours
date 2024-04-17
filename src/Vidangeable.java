public interface Vidangeable {
    //L'interface va définir cette capacité d'être vidangeable grâce à une ou plusieurs méthodes
    //Ces méthodes vont être déclarées dans l'interface, mais sans en donner le détail, on dit sans en donner l'implémentation
    //On ne dit pas dans l'interface "comment vidanger", parce que cela est propre à chaque classe qui exploite cette interface
    //On dira implémente cette interface
    //Une Voiture ne se vidange pas de la même façon qu'un lavabo
    //On va associer une seule méthode "vidanger" à l'interface
    //"public" est pour la visibilité
    public void vidanger();

}
