package Kalkulator;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("Penjumlahan  " +  kalkulator.tambah(3,4));
        System.out.println("Pengurangan  " + kalkulator.kurang(15,4));
        System.out.println("Perkalian    " + kalkulator.kali(10,10));
        System.out.println("Pembagian    " + kalkulator.bagi(12,3));

    }
}
