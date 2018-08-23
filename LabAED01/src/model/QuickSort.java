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

//        for (Integer i : test){
//            System.out.println(i);
//        }
        System.out.println("Mayor: "+ test[test.length-1]);
        System.out.println("MilliTimes: "+(end-start));
    }
    
	public static void quicksort(int A[], int izq, int der) {

		  int pivote=A[izq]; // tomamos primer elemento como pivote
		  int i=izq; // i realiza la búsqueda de izquierda a derecha
		  int j=der; // j realiza la búsqueda de derecha a izquierda
		  int aux;
		 
		  while(i<j){            // mientras no se crucen las búsquedas
		     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
		     while(A[j]>pivote) j--;         // busca elemento menor que pivote
		     if (i<j) {                      // si no se han cruzado                      
		         aux= A[i];                  // los intercambia
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
		   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
		   if(izq<j-1)
		      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
		   if(j+1 <der)
		      quicksort(A,j+1,der); // ordenamos subarray derecho
		}

}
