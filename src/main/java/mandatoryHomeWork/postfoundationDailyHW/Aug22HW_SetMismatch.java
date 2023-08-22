package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Aug22HW_SetMismatch {

	//Input: int[]
	//Outpur: int[]
	//Logic
	//1. initialize count int[] of size a.length+1 to check the freq of the elements 
	//2. In a for each loop, run through the elements of a and increment the count of that value in count[]
	//3. Run a for loop from 1 to count.length-1 to check if any element has 2 or 0 in value, if yes assign them to duplicate and miss 
	//return the duplicate and miss as array

	public int[] setMismatch(int[] a) {
		int[] count = new int[a.length+1];

		for (int i : a) {
			count[i]++;
		}

		int duplicate=0;
		int miss=0;
		for (int i = 1; i < count.length; i++) {
			if(count[i]==2) {
				duplicate =i;
			}
			if(count[i]==0) {
				miss =i;
			}

		}

		return new int[] {duplicate,miss};
	}


	@Test
	public void test1() {
		int[] res = {2,3};
		Assert.assertEquals(res, setMismatch(new int[] {1,2,2,4}));
	}
	
	@Test
	public void test2() {
		int[] res = {0,0};
		Assert.assertEquals(res, setMismatch(new int[] {1,2,3,4}));
	}
	
	@Test
	public void test3() {
		int[] res = {2,1};
		Assert.assertEquals(res, setMismatch(new int[] {2,2,3,4}));
	}


}
