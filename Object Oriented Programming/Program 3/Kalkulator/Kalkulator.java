package Kalkulator;

public class Kalkulator {
    double nilai1;
    double nilai2;

    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }

    public double getNilai2() {
        return nilai2;
    }

    double tambah(double nilai1, double nilai2){
        return nilai1 + nilai2;
    }

    double kurang(double nilai1, double nilai2){
        return nilai1 - nilai2;
    }

    double kali(double nilai1, double nilai2){
        return nilai1*nilai2;
    }

    double bagi(double nilai1, double nilai2){
        return nilai1/nilai2;
    }


}
