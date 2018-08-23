package model;

public class Procesator {
	
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
