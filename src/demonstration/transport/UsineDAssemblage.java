package demonstration.transport;

//Une demonstration.transport.UsineDAssemblage d'un demonstration.transport.VehiculeMotorise
public class UsineDAssemblage {

    //Cette méthode "assembler" doit retourner un demonstration.transport.VehiculeMotorise
    public VehiculeMotorise assembler(){
        Moteur moteurvm = new Moteur();
        VehiculeMotorise vm = new VehiculeMotorise (moteurvm);
        return vm;
    }

}
