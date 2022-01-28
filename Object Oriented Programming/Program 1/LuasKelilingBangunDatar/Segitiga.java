package LuasKelilingBangunDatar;

public class Segitiga implements BangunDatar  {

    public double luas(double a, double t) {

        return (0.5 * a * t);
    }
    public double sisiMiring(double s1, double s2) {
        return Math.sqrt((s1 * s1) + (s2 * s2));
    }


    public double keliling(double s1, double s2) {


        return (s1 + s2 + sisiMiring(s1,s2));
    }


}
