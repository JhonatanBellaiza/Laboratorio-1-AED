package model;

public class Procesator {
	
	private double timeLastSort;
	
	public final static double MS_PER_SECOND = 1000;
	public final static double NS_PER_SECOND = 1000000000;


	public Procesator() {
		
		
	}
	
	public void sort(int A[]) {
		int max = getMax(A);
		long START_NS;
		long DURATION_NS;
		double nlgn = Math.log(A.length)*A.length;
		int nk = A.length*max;
		if(nlgn > nk) {
			
			START_NS = System.nanoTime();
			A = Radixsort(A, max);
			DURATION_NS = System.nanoTime()-START_NS;
			
		}
		else {
			double nlgnE = Math.log(A.length)*A.length;
			double lgE = Math.log(A.length);
			if(nlgnE > (2*lgE)) {
				START_NS = System.nanoTime();
				quicksort(A, 0, A.length);
				DURATION_NS = System.nanoTime()-START_NS;
			}
			else {
				START_NS = System.nanoTime();
				mergesort(A, 0, A.length);
				DURATION_NS = System.nanoTime()-START_NS;
			}
		}
		takeTimeSort(START_NS, DURATION_NS);
	}
	
	public void sortF(float A[]) {
		long START_NS;
		long DURATION_NS;
		double nlgnE = Math.log(A.length)*A.length;
		double lgE = Math.log(A.length);
		if(nlgnE > (2*lgE)) {
			START_NS = System.nanoTime();
			quicksortF(A, 0, A.length);
			DURATION_NS = System.nanoTime()-START_NS;
		} 
		else {
			START_NS = System.nanoTime();
			mergesortF(A, 0, A.length);
			DURATION_NS = System.nanoTime()-START_NS;
		}
		takeTimeSort(START_NS, DURATION_NS);
	}
	
	public int getMax(int A[]) {
		int n = A.length;
    	int max = A[0];
    	for (int i = 1; i < n; i++) {
    	     if( A[ i ] > max )
    	        max = A[i];
    	}
    	return max;
	}
	//Enteros
	//QuickSort 
	public void quicksort(int A[], int izq, int der) {

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
	
	//RadixSort
	public int[] Radixsort(int[] A, int max) {
    	
    	
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
	
	//MergeSort
	public void mergesort( int A[],int izq, int der){
		
    	if (izq<der){
        	int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1 , der);
            merge(A,izq, m, der);
                
        }
    }
    
    private void merge(int A[],int izq, int m, int der){
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
    
    //Coma flotante
    //MergeSort
  	public void mergesortF( float A[],int izq, int der){
  		
      	if (izq<der){
          	int m=(izq+der)/2;
              mergesortF(A,izq, m);
              mergesortF(A,m+1 , der);
              mergeF(A,izq, m, der);
                  
          }
      }
      
    private void mergeF(float A[],int izq, int m, int der){
      	   int i, j, k;
      	   float [] B = new float[A.length];
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
      
  //QuickSort 
  	public void quicksortF(float A[], int izq, int der) {

  		  float pivote=A[izq];
  		  int i=izq;
  		  int j=der;
  		  float aux;
  		 
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
  		      quicksortF(A,izq,j-1);
  		   if(j+1 <der)
  		      quicksortF(A,j+1,der);
  		}
  	
  	public void takeTimeSort(long start, long end) {
  		
  	}
  	
//	public String takeTimeQuickSort(int A[], int izq, int der) {
//		
//		String time = "";
//		
//		//Milliseconds
//		long START_MS=System.currentTimeMillis();
//		long DURATION_MS = System.currentTimeMillis()-START_MS;
//		
//		//Nanoseconds
//		long START_NS = System.nanoTime();
//		long DURATION_NS = System.nanoTime()-START_NS;
//
//		//Seconds
//		
//		double DURATION_S1= DURATION_MS/MS_PER_SECOND;
//		double DURATION_S2= DURATION_NS/NS_PER_SECOND;
//
//		time+= "RESULT IN NANOSECONDS: "+DURATION_MS+"nanoseconds"+"\n"+
//				"RESULT IN SECONDS: "+DURATION_S2+"seconds";
//		return time;
//	}
//	
//	public String takeTimeMergeSort(int A[], int izq,int m, int der) {
//		
//		String time = "";
//		
//		//Milliseconds
//		long START_MS=System.currentTimeMillis();
//		long DURATION_MS = System.currentTimeMillis()-START_MS;
//		
//		//Nanoseconds
//		long START_NS = System.nanoTime();
//		long DURATION_NS = System.nanoTime()-START_NS;
//
//		//Seconds
//		
//		double DURATION_S1= DURATION_MS/MS_PER_SECOND;
//		double DURATION_S2= DURATION_NS/NS_PER_SECOND;
//
//		time+= "RESULT IN NANOSECONDS: "+DURATION_MS+"nanoseconds"+"\n"+
//				"RESULT IN SECONDS: "+DURATION_S2+"seconds";
//		return time;
//	}
//	
//	public String takeTimeRadixSort(int A[], int max) {
//		
//		String time = "";
//		
//		//Milliseconds
//		long START_MS=System.currentTimeMillis();
//		long DURATION_MS = System.currentTimeMillis()-START_MS;
//		
//		//Nanoseconds
//		long START_NS = System.nanoTime();
//		
//		long DURATION_NS = System.nanoTime()-START_NS;
//
//		//Seconds
//		
//		double DURATION_S1= DURATION_MS/MS_PER_SECOND;
//		double DURATION_S2= DURATION_NS/NS_PER_SECOND;
//
//		time+= "RESULT IN NANOSECONDS: "+DURATION_MS+"nanoseconds"+"\n"+
//				"RESULT IN SECONDS: "+DURATION_S2+"seconds";
//		return time;
//	}
//	
	



	
	
}
