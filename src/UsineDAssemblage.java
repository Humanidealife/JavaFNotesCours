//Une UsineDAssemblage d'un VehiculeMotorise
public class UsineDAssemblage {

    //Cette méthode "assembler" doit retourner un VehiculeMotorise
    VehiculeMotorise assembler(){
        Moteur moteurvm = new Moteur();
        VehiculeMotorise vm = new VehiculeMotorise (moteurvm);
        return vm;
    }

}
