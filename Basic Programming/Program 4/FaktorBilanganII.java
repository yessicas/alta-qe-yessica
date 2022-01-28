import java.util.Scanner;

public class FaktorBilanganII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Sebuah Nilai = ");

        int bilangan = scanner.nextInt();
        System.out.println("Output");


        for(int i=bilangan; i>0;i--)
        {
            if (bilangan%i==0)
            {
                System.out.println(i + " ");
            }
        }

    }
}
