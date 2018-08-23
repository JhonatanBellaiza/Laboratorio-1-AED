package model;

public class Procesator {
	
	public final static double MS_PER_SECOND = 1000;
	public final static double NS_PER_SECOND = 1000000000;

	
	private QuickSort quick;
	private MergeSort merge;
	private RadixSort radix;
	
	
	
	public Procesator() {
		
		
	}
	
	
	public String takeTimeQuickSort(int A[], int izq, int der) {
		
		String time = "";
		
		//Milliseconds
		long START_MS=System.currentTimeMillis();
		getQuick().quicksort(A, izq, der);
		long DURATION_MS = System.currentTimeMillis()-START_MS;
		
		//Nanoseconds
		long START_NS = System.nanoTime();
		getQuick().quicksort(A, izq, der);
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
		getMerge().merge(A, izq, m, der);
		long DURATION_MS = System.currentTimeMillis()-START_MS;
		
		//Nanoseconds
		long START_NS = System.nanoTime();
		getMerge().merge(A, izq, m, der);
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
		getRadix().Radixsort(A);
		long DURATION_MS = System.currentTimeMillis()-START_MS;
		
		//Nanoseconds
		long START_NS = System.nanoTime();
		getRadix().Radixsort(A);
		long DURATION_NS = System.nanoTime()-START_NS;

		//Seconds
		
		double DURATION_S1= DURATION_MS/MS_PER_SECOND;
		double DURATION_S2= DURATION_NS/NS_PER_SECOND;

		time+= "RESULT IN NANOSECONDS: "+DURATION_MS+"nanoseconds"+"\n"+
				"RESULT IN SECONDS: "+DURATION_S2+"seconds";
		return time;
	}
	
	


	public QuickSort getQuick() {
		return quick;
	}


	public void setQuick(QuickSort quick) {
		this.quick = quick;
	}


	public MergeSort getMerge() {
		return merge;
	}


	public void setMerge(MergeSort merge) {
		this.merge = merge;
	}


	public RadixSort getRadix() {
		return radix;
	}


	public void setRadix(RadixSort radix) {
		this.radix = radix;
	}
	
	
	

}
