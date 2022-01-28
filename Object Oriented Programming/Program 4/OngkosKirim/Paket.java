package OngkosKirim;

public class Paket {
    private double panjang;
    private double lebar;
    private double tinggi;
    private double berat;

    Paket(double p, double l, double t, double b){
        this.panjang=p;
        this.lebar=l;
        this.tinggi=t;
        this.berat=b;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getBerat() {
        return berat;
    }

    private double dimensi(){
        return this.panjang*this.lebar*this.tinggi;
    }

    public double hasil(){
        final double harga=5000;
        final double min=50;
        double kg=0;
        if ( dimensi() >= min){
            kg = dimensi()/min;
        }
        else{
            kg = this.berat ;
        }
        if(kg<1){
            kg=1;
        }
        return Math.round(kg)*harga;

    }


}
