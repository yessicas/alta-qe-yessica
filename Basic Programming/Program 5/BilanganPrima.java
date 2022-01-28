public class BilanganPrima {

    private static boolean primaNumber(int number) {

        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter += 1;
            }
        }

        if (counter == 2) {
            System.out.println(number + " true");
        } else {
            System.out.println(number + " false");
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(primaNumber(11));
        System.out.println(primaNumber(13));
        System.out.println(primaNumber(17));
        System.out.println(primaNumber(20));
        System.out.println(primaNumber(35));



    }

}
