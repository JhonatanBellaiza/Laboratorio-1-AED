package model;
import java.util.Random;

public class RadixSort {

    // Main function to test performance sorting 1 million integers.
    // Results in about 220 ms on a 2.3 Ghz Core i5 processor w/4GB 1333 Mhz RAM
    public static void main(String[] args){
        final int SIZE = 100000000;

        Random r = new Random();
        int[] test = new int[SIZE];

        for (int i = 0; i < SIZE; i++){
            test[i] = r.nextInt(Integer.MAX_VALUE);
        }

        long start = System.currentTimeMillis();
        test = sort(test);
        long end = System.currentTimeMillis();

//        for (Integer i : test){
//            System.out.println(i);
//        }
        System.out.println("Mayor: "+ test[test.length-1]);
        System.out.println("MilliTimes: "+(end-start));
    }

    // Sort the numbers beginning with least-significant digit
    public static int[] sort(int[] input){
    	
//    	int max = 4580;
//    	int place = Integer.toString(max).length();
//    	int orden = (int) Math.pow(10, (place-1));
//    	System.out.println("Tamaño: "+ place+ " Del orden del: "+orden);
//         Largest place for a 32-bit int is the 1 billion's place
        for(int place=1; place <= 1000000000; place *= 10){
//             Use counting sort at each digit's place
            input = countingSort(input, place);
        }

        return input;
    }

    private static int[] countingSort(int[] input, int place){
        int[] out = new int[input.length];

        int[] count = new int[10];

        for(int i=0; i < input.length; i++){
            int digit = getDigit(input[i], place);
            count[digit] += 1;
        }

        for(int i=1; i < count.length; i++){
            count[i] += count[i-1];
        }

        for(int i = input.length-1; i >= 0; i--){
            int digit = getDigit(input[i], place);

            out[count[digit]-1] = input[i];
            count[digit]--;
        }

        return out;

    }

    private static int getDigit(int value, int digitPlace){
        return ((value/digitPlace ) % 10);
    }

}