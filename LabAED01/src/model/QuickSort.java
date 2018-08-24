package model;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args){
        final int SIZE = 100000000;

        Random r = new Random();
        int[] test = new int[SIZE];

        for (int i = 0; i < SIZE; i++){
            test[i] = r.nextInt(Integer.MAX_VALUE);
        }

        long start = System.currentTimeMillis();
        quicksort(test, 0, test.length-1);
        long end = System.currentTimeMillis();

        System.out.println("Mayor: "+ test[test.length-1]);
        System.out.println("MilliTimes: "+(end-start));
    }
    
	public static void quicksort(int A[], int izq, int der) {

		  int pivote=A[izq];
		  int i=izq;
		  int j=der;
		  int aux;
		 
		  while(i<j){        
		     while(A[i]<=pivote && i<j) i++; 
		     while(A[j]>pivote) j--;         
		     if (i<j) {                                            
		         aux= A[i];  
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   A[izq]=A[j];
		   A[j]=pivote;
		   if(izq<j-1)
		      quicksort(A,izq,j-1);
		   if(j+1 <der)
		      quicksort(A,j+1,der);
		}
//	  int pivote=A[izq];
//	  int i=izq;
//	  int j=der;
//	  int aux;
//	 
//	  while(i<j){        
//	     while(A[i]<=pivote && i<j) i++; 
//	     while(A[j]>pivote) j--;         
//	     if (i<j) {                                            
//	         aux= A[i];  
//	         A[i]=A[j];
//	         A[j]=aux;
//	     }
//	   }
//	   A[izq]=A[j];
//	   A[j]=pivote;
//	   if(izq<j-1)
//	      quicksort(A,izq,j-1);
//	   if(j+1 <der)
//	      quicksort(A,j+1,der);
//	}
}
