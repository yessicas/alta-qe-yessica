package Volume;

public class Main {
    public static void main(String[] args) {
        System.out.println("Volume");
        Kubus kubus = new Kubus();
        System.out.println("Kubus  " +  kubus.volume(10));
        Balok balok = new Balok();
        System.out.println("Balok  " + balok.volume(3,6,10));
        Tabung tabung = new Tabung();
        System.out.println("Tabung  " + tabung.volume(7,10));

    }



}
