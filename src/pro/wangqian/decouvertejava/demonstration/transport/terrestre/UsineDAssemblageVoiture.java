package pro.wangqian.decouvertejava.demonstration.transport.terrestre;

import pro.wangqian.decouvertejava.demonstration.transport.UsineDAssemblage;

public class UsineDAssemblageVoiture extends UsineDAssemblage {
    //Grâce à la covariance des méthodes on peut réécrire une méthode de la classe Parente, ici c'est assembler
    //  et modifier le type de retour
    public Voiture assembler() {
        Voiture v = new Voiture();
        //On va essayer d'attribuer une "immatriculation" à notre voiture.
        //Peu importe que cette immatriculation soit correcte ou pas, notre code comporte désormais une erreur.
        //Cette erreur nous indique que la méthode "immatriculer" rejette une exception, le type "NombreDeCaractereInvalideException" et que
        //  l'on devrait à ce niveau-là, nous nous en préoccupons.
        //Si l'on regarde les propositions de correction, on peut constater deux solutions :
        //1. On ne souhaite pas se préoccuper de cette exception à ce niveau (le niveau de la méthode "assembler"). On va donc
        //  rejeter(throws) un peu plus haut, c'est-à-dire à celui qui va appeler la méthode "assembler", l'exception qui peut survenir.
        //Si l'on fait cela, notre Class actuel compile à nouveau.

        //On va plutôt choisir la seconde option :
        //  2. qui consiste tout simplement à s'occuper de cette exception.
        //Désormais, notre méthode "immatriculer" se trouve dans un bloc préfixé par le mot clé "try".
        //"try" signifie essayer, essayer d'exécuter la méthode "immatriculer".
        //Si tout se passe bien, Java va continuer à traîter les instructions qui suivent la méthode "immatriculer"
        try {
            v.immatriculer("AA 444 AA");
            v.immatriculer("BB 555 BB");
            System.out.println("Tout s'est bien passé");
            return v;
            //En revanche, si la méthode "immatriculer" rejette une exception de type NombreDeCaractereInvalideException,
            //  et bien, on va rentrer dans le bloc "catch"(attraper) spécifique à l'exception considérée.
            //On peut tout simplement dire c'est toutes exceptions de type "Exception".
            //"Exception" inclut par héritage toutes les exceptions spécifiques, cela nous permet
            //  d'attraper(catch) toutes exceptions sans se préoccuper de leurs types.
        } /*catch (NombreDeCaractereInvalideException e) {
            //On va rentrer dans le bloc ici,
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        } catch (VoitureDejaImmatriculeeException e){
            System.out.println(e.getMessage());
        }*/
        //Une version de catch plus simple et intélligente
        catch (NombreDeCaractereInvalideException | VoitureDejaImmatriculeeException e){
            System.out.println(e.getMessage());
        }
        //On peut réellement compter sur le fait que tout ce qui se trouve dans le bloc "finally" va à la fin être effectué.
        //Quand bien même nos blocs "try" ou "catch" contiendraient un autre "throws" ou même un "return".

        //On pourrait également ajouter un bloc de "catch"
        catch (NullPointerException ue){
            System.out.println("NullPointerException est attrapée");
        }

        finally{
            System.out.println("Ce message s'affiche dans tous les cas");
        }
        return v;
    }
}
