package model;

public class Procesator {
	
	private int[] a;
	private float[] f;
	
	public final static double MS_PER_SECOND = 1000;
	public final static double NS_PER_SECOND = 1000000000;


	
	
	
	public Procesator() {
		
		
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
	
	
	public String takeTimeQuickSort(int A[], int izq, int der) {
		
		String time = "";
		
		//Milliseconds
		long START_MS=System.currentTimeMillis();
		long DURATION_MS = System.currentTimeMillis()-START_MS;
		
		//Nanoseconds
		long START_NS = System.nanoTime();
		long DURATION_NS = System.nanoTime()-START_NS;

		//Seconds
		
		double DURATION_S1= DURATION_MS/MS_PER_SECOND;
		double DURATION_S2= DURATION_NS/NS_PER_SECOND;

		time+= "RESULT IN NANOSECONDS: "+DURATION_MS+"nanoseconds"+"\n"+
				"RESULT IN SECONDS: "+DURATION_S2+"seconds";
		return time;
	}
	
	public String takeTimeMergeSort(int A[], int izq,int m, int der) {
		
		String time = "";
		
		//Milliseconds
		long START_MS=System.currentTimeMillis();
		long DURATION_MS = System.currentTimeMillis()-START_MS;
		
		//Nanoseconds
		long START_NS = System.nanoTime();
		long DURATION_NS = System.nanoTime()-START_NS;

		//Seconds
		
		double DURATION_S1= DURATION_MS/MS_PER_SECOND;
		double DURATION_S2= DURATION_NS/NS_PER_SECOND;

		time+= "RESULT IN NANOSECONDS: "+DURATION_MS+"nanoseconds"+"\n"+
				"RESULT IN SECONDS: "+DURATION_S2+"seconds";
		return time;
	}
	
	public String takeTimeRadixSort(int A[]) {
		
		String time = "";
		
		//Milliseconds
		long START_MS=System.currentTimeMillis();
		long DURATION_MS = System.currentTimeMillis()-START_MS;
		
		//Nanoseconds
		long START_NS = System.nanoTime();
		long DURATION_NS = System.nanoTime()-START_NS;

		//Seconds
		
		double DURATION_S1= DURATION_MS/MS_PER_SECOND;
		double DURATION_S2= DURATION_NS/NS_PER_SECOND;

		time+= "RESULT IN NANOSECONDS: "+DURATION_MS+"nanoseconds"+"\n"+
				"RESULT IN SECONDS: "+DURATION_S2+"seconds";
		return time;
	}
	
	



	
	
}
