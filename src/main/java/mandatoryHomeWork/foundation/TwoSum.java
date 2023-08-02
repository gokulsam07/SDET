package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

//Input: Non empty Array of number and sum to find in the array
//Outuput: Index of the sum of the number
//Logic: 
//	Iterate the array in two for loops to fetch i & i+1 element value
//	check the sum is equal to target
//	return the index value if the sum is equal to target


public class TwoSum {

	public int[] TestTwoSum(int[] arr, int tar) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==tar) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};

	}

	@Test
	public void tst1() {
		Assert.assertArrayEquals(new int[]{0, 1}, TestTwoSum(new int[] {2,7,1,15},9));	
	}
	@Test
	public void tst2() {
		Assert.assertArrayEquals(new int[]{1, 2}, TestTwoSum(new int[] {3,2,4},6));	
	}
	@Test
	public void tst3() {
		Assert.assertArrayEquals(new int[]{0, 1}, TestTwoSum(new int[] {3,3},6));	
	}
}
