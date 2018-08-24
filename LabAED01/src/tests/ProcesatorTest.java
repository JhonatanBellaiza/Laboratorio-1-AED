package tests;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;
import model.Procesator;

class ProcesatorTest{
	
	private Procesator ps;
	private int A[];
	private float[] Af;

	public void stage1() {
		
		ps = new Procesator();
		
		final int SIZE = 100;
		
        Random r = new Random();
        A = new int[SIZE];

        for (int i = 0; i < SIZE; i++){
            A[i] = r.nextInt(Integer.MAX_VALUE);
        }

	}

	public void stage2() {
		
		ps = new Procesator();
		int[] b = {10,5,3,8,9,45,6,8,47,25,3,6,78,1,1000};
		A = b;

	}
	
	public void stage3() {
		
		ps = new Procesator();
		
		Af = new float[8];

		float[] b = {1.8f, 1.6f, 29.6f, 56.2f,89.3f,1.2f, 1.1f,23.5f};
        Af = b;
        
	}
	
	@Test
	public void QuickSortTestF() {
		
		stage3();
		ps.quicksortF(Af, 0, Af.length-1);
		
		int sort = 0;
		for(int i=1 ; i<Af.length; i++) {
			if(sort==0 && Af[i-1]>Af[i]) {
				sort++;
			}
		}
		
		assertEquals(0, sort);
	}
	
	@Test
	public void MergeSortTestF() {
		
		stage3();
		ps.mergesortF(Af, 0, Af.length-1);
		
		int sort = 0;
		for(int i=1 ; i<Af.length; i++) {
			if(sort==0 && Af[i-1]>Af[i]) {
				sort++;
			}
		}
		
		assertEquals(0, sort);
	}
		
	@Test
	public void QuickSortTest() {
		
		stage1();
		ps.quicksort(A, 0, A.length-1);
		
		int sort = 0;
		for(int i=1 ; i<A.length; i++) {
			if(sort==0 && A[i-1]>A[i]) {
				sort++;
			}
		}
		
		assertEquals(0, sort);
	}
	
	@Test
	public void MergeSortTest() {
		
		stage1();
		ps.mergesort(A, 0, A.length-1);
		
		int sort = 0;
		for(int i=1 ; i<A.length; i++) {
			if(sort==0 && A[i-1]>A[i]) {
				sort++;
			}
		}
		
		assertEquals(0, sort);
	}
	
	@Test
	public void RaixSortTest() {
		
		stage1();
		A = ps.Radixsort(A, ps.getMax(A));
		
		int sort = 0;
		for(int i=1 ; i<A.length; i++) {
			if(sort==0 && A[i-1]>A[i]) {
				sort++;
			}
		}
		
		assertEquals(0, sort);
	}
	
	@Test
	public void getMaxTest() {
		
		stage2();
		int max = ps.getMax(A);
		assertEquals(1000, max);
	}
	

}
