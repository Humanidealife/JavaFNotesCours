package pro.wangqian.decouvertejava.demonstration.transport.aerien;

import pro.wangqian.decouvertejava.demonstration.transport.Amarrable;

public class Montgolfiere implements Amarrable {

    int surface;

    @Override
    public int nbCordes(int vitesseDuVent) {
        int cordesMontgolfire = surface/50;
        cordesMontgolfire += vitesseDuVent/20;
        return cordesMontgolfire;
    }
}
