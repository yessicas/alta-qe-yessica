import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Sebuah Nilai = ");

        String kata = scanner.nextLine();
        System.out.println("Output");

        int i = 0, j = kata.length() - 1;
        boolean isPalindrome = true;

        while(i<j){
            if (kata.charAt(i) != kata.charAt(j))
                isPalindrome = false;
            i++;
            j--;
        }

        System.out.println(isPalindrome);




    }
}
