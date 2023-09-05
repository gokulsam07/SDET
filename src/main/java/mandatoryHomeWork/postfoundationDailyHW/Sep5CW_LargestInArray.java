package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Sep5CW_LargestInArray {

	//Input: int[]
	//Output: int
	//Logic
	//1. Initialize max =arr[0];
	//2. In a for loop, run the loop till last element
	//3. Check if the element at index i is > max
	//4. if yes, assign the value at index i to max
	//return max

	//Time Complexity - O[N] -- N - size of array
	
	
	public int returnLargest(int[] arr) {
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) { 
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}



	@Test
	public void test1() {
		Assert.assertEquals(5, returnLargest(new int[] {1,2,3,4,5}));
	}

	@Test
	public void test2() {

		Assert.assertEquals(8, returnLargest(new int[] {0,2,7,4,8,5}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(1, returnLargest(new int[] {1,1,1,1}));
	}

	@Test
	public void test4() {
		Assert.assertEquals(-1, returnLargest(new int[] {-2,-3,-5,-1}));
	}

}
