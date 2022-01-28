public class Mean {

    private static float Mean(float[] number){
        int tambah = 0;
        for(float dataTambah : number){
            tambah += dataTambah;

        }
        return (float) (tambah / (double) number.length);

    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));

    }
}
