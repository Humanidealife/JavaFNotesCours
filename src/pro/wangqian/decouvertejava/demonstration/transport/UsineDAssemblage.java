package pro.wangqian.decouvertejava.demonstration.transport;

//Une pro.wangqian.decouvertejava.demonstration.transport.UsineDAssemblage d'un pro.wangqian.decouvertejava.demonstration.transport.VehiculeMotorise

//Le format de commentaire avec "/**" est un type de commentaire spécial. Cela s'appelle
//  "la documentation au format JavaDoc"
//Ce type de commentaire peut être ajouté devant la déclaration d'une CLass,
//  devant un constructeur, devant une méthode ou devant un attribut.
//Il s'agira de documenter dans un format standard Java (format JavaDoc) la Class, le constructeur,
//  la méthode ou l'attribut.
//Si l'on veut documenter cette Class "UsineDAssemblage".

/**
 *
 */

//On peut aussi déclarer une Class « final »,
// dans ce cas-là, on indique tout simplement que cette Class ne pourra pas être étendue.
public class UsineDAssemblage {

    //Cette méthode "assembler" doit retourner un pro.wangqian.decouvertejava.demonstration.transport.VehiculeMotorise
    // Une méthode pourrait également être qualifiée de « final »,
    // cela signifie pour méthode « public » qu’elle ne pourra pas être modifiée dans une Class héritante.
    public VehiculeMotorise assembler(){
        Moteur moteurvm = new Moteur();
        /*
        Il s'agit ici d'instancier d'un "VehiculeMotorise" avec un Moteur par défaut,
        on ne sait pas s'il s'agit d'un Moteur diesel ou essence.
         */

        VehiculeMotorise vm = new VehiculeMotorise (moteurvm);
        return vm;
    }

}
