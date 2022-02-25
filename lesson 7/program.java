import java.util.Random;


public class program {
 
    public static void main(String[] args) {
        
        int[] ar = new int[20];
        Random rand = new Random();
        int sum = 0;
        for (int i = 0; i < ar.length; i++ ) {
        ar [i] = rand.nextInt(10,30);
        sum += ar[i];
        }
        System.out.print(sum);

    }

}
    

