package tests;

import static org.junit.Assert.assertArrayEquals;

import java.util.Random;

import org.junit.Test;

import junit.framework.TestCase;
import model.Procesator;

public class ProcesatorTest extends TestCase{
	
	private Procesator ps;
	
	public void stage1() {
		
		ps = new Procesator();
		
		final int SIZE = 10;

        Random r = new Random();
        int[] test = new int[SIZE];

        for (int i = 0; i < SIZE; i++){
            test[i] = r.nextInt(100);
        }
	}
	
	@Test
	public void QuickSortTest() {
		
		stage1();
		
	}
	
	@Test
	public void MergeSortTest() {
		
		stage1();
		
	}
	
	@Test
	public void RaixSortTest() {
		
		stage1();
		
	}
	

}
