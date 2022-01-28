

public class CetakTabelPerkalian {

    private static void cetakTabelPerkalian(int n){
        for(int i = 0; i <= 10; i++) {
            for(int j = 0; j <= 10; j++) {
                System.out.println(" " + i*j +"\t");
            }
            System.out.println("\n\n");
        }

    }

    public static void main(String[] args) {
        cetakTabelPerkalian(5);
    }


}
