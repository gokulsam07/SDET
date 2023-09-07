package mandatoryHomeWork.postfoundationDailyHW;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Sep6CW_MinimizeDiff {
	
	//Input: int[], int
	//Output: int
	//Logic
	//1. Initialize diff =0
	//2. Run a for loop till last ele of a and check if ele is > k, if yes reduce the element by k
	//3. else increment ele by k
	//4. sort the array 
	//return the diff of last and first element 

	public int minimizeDiff(int[] a, int k) {
		int diff=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>k) {
				a[i]=a[i]-k;
			}
			else {
				a[i]=a[i]+k;
			}
		}
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
		return a[a.length-1]-a[0];
	}


//	@Test
	public void test1() {
		Assert.assertEquals(3, minimizeDiff(new int[] {1,2,3,4,5},2));
	}

//	@Test
	public void test2() {

		Assert.assertEquals(5, minimizeDiff(new int[] {1,5,8,10},3));
	}
	
//	@Test
	public void test3() {

		Assert.assertEquals(4, minimizeDiff(new int[] {5,7,8,2,4},3));
	}
	
//	@Test
	public void test4() {

		Assert.assertEquals(0, minimizeDiff(new int[] {8},2));
	}
	@Test
	public void test5() {
		Assert.assertEquals(14, minimizeDiff(new int[] {10,4,20,19,9,4,20,14,15,10,9,15,8},9));
	}

	


}
