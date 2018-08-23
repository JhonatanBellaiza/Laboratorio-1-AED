package model;
import java.util.Random;

public class MergeSort {
	
	
	
    public MergeSort() {
		
	}

	public static void mergesort( int A[],int izq, int der){
		
	
      
    	if (izq<der){
        	int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1 , der);
            merge(A,izq, m, der);
                
        }
    }
    
    public static void merge(int A[],int izq, int m, int der){
    	   int i, j, k;
    	   int [] B = new int[A.length];
    	   for (i=izq; i<=der; i++)
    	             B[i]=A[i];

    	             i=izq; j=m+1; k=izq;
    	             while (i<=m && j<=der)
    	             if (B[i]<=B[j])
    	                     A[k++]=B[i++];
    	             else
    	                     A[k++]=B[j++];
    	             
    	             
    	             while (i<=m) 
    	                           A[k++]=B[i++];
    	 }
    
    
    
 

	public static void main(String[] args){
        final int SIZE = 10000;

        Random r = new Random();
        int[] test = new int[SIZE];

        for (int i = 0; i < SIZE; i++){
            test[i] = r.nextInt(Integer.MAX_VALUE);
        }

        long start = System.currentTimeMillis();
        mergesort(test, 0, test.length-1);
        long end = System.currentTimeMillis();


        System.out.println("Mayor: "+ test[test.length-1]);
        System.out.println("MilliTimes: "+(end-start));
    }
}