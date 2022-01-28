import java.util.Scanner;

public class FaktorBilangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Sebuah Nilai = ");

        int bilangan = scanner.nextInt();
        System.out.println("Output");


        for(int i=1; i<=bilangan;i++)
        {
            if (bilangan%i==0)
            {
                System.out.println(i + " ");
            }
        }

        System.out.println();

    }
}
