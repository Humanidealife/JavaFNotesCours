package pro.wangqian.decouvertejava.demonstration.transport;

//Une pro.wangqian.decouvertejava.demonstration.transport.UsineDAssemblage d'un pro.wangqian.decouvertejava.demonstration.transport.VehiculeMotorise
public class UsineDAssemblage {

    //Cette méthode "assembler" doit retourner un pro.wangqian.decouvertejava.demonstration.transport.VehiculeMotorise
    public VehiculeMotorise assembler(){
        Moteur moteurvm = new Moteur();
        VehiculeMotorise vm = new VehiculeMotorise (moteurvm);
        return vm;
    }

}
