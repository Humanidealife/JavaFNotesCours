public class Bateau implements Amarrable{

    int masse;

    @Override
    public int nbCordes(int vitesseDuVent) {
        //return masse/10 + vitesseDuVent/100;
        int cordesBateau = masse/10;
        cordesBateau += vitesseDuVent/20;
        return cordesBateau;
    }
}
