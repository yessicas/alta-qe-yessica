package LuasKelilingBangunDatar;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        System.out.println("Luas");
        System.out.println("Persegi  " +  persegi.luas(4));

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.println("Persegi Panjang " + persegiPanjang.luas(7,8));

        Segitiga segitiga = new Segitiga();
        System.out.println("Segitiga " + segitiga.luas(3,4));

        System.out.println();

        System.out.println("Keliling");
        System.out.println("Persegi  " + persegi.keliling(4));
        System.out.println("Persegi Panjang " + persegiPanjang.keliling(7,8));
        System.out.println("Segitiga " + segitiga.keliling(3,4));




    }
}
