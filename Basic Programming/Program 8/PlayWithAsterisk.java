public class PlayWithAsterisk {

    private static void PlayWithAsterisk(int n){

        for (int i=1;i<=n;i++)
        {
            //Membuat spasi
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            //Membuat bintang
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for (int l=1;l<=i-1;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        PlayWithAsterisk(5);


    }
}