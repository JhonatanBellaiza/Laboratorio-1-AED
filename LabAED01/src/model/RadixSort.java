package model;
import java.util.Random;

public class RadixSort {

    public static void main(String[] args){
        final int SIZE = 10;

        Random r = new Random();
        int[] test = new int[SIZE];

        for (int i = 0; i < SIZE; i++){
            test[i] = r.nextInt(100);
        }

        long start = System.currentTimeMillis();
        test = Radixsort(test);
        long end = System.currentTimeMillis();

        for ( int i=0; i<test.length ; i++) {
        	System.out.println(" "+test[i]);
        }
        System.out.println("Mayor: "+ test[test.length-1]);
        System.out.println("MilliTimes: "+(end-start));
    }

    public static int[] Radixsort(int[] A) {
    	
    	int n = A.length;
    	int max = A[0];
    	for (int i = 1; i < n; i++) {
    	     if( A[ i ] > max )
    	        max = A[i];
    	}
    	int cantdigi= Integer.toString(max).length();
    	int miles = (int) Math.pow(10, (cantdigi-1));
//    	(pl aumenta, tal que, pl*10 cada ciclo)
    	for (int pl = 1; pl <= miles; pl *= 10) { 
    		
    		int[] out = new int[A.length];

            int[] count = new int[10];

            for(int i=0; i < A.length; i++){
                int digit = ((A[i]/pl ) % 10);
                count[digit] += 1;
            }

            for(int i=1; i < count.length; i++){
                count[i] += count[i-1];
            }

            for(int i = A.length-1; i >= 0; i--){
                int digit = ((A[i]/pl ) % 10);

                out[count[digit]-1] = A[i];
                count[digit]--;
            }
            A = out;
    	}
        return A;

    	
    }
}