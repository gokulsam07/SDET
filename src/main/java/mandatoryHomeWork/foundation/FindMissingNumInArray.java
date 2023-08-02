package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindMissingNumInArray {

	//Input: int[] with missing num
	//Output: find the missing num in array of size n
	//Logic
	//1. sort the array
	//2. initialize int=0
	//3. In a for loop, check if the arr[index]!=index, if yes, return i
	//4. return i outside loop to return the value if the missing value is last value of array


	public int findNum(int[] arr) {
		Arrays.sort(arr);
		int i=0;
		for (i = 0; i < arr.length; i++) {
			if(arr[i]!=i) {
				return i;
			}

		}
		return i;
	}


	@Test
	public void tst1() {
		Assert.assertEquals(2, findNum(new int[] {3,0,1}));
	}
	@Test
	public void tst2() {
		Assert.assertEquals(2, findNum(new int[] {0,1}));
	}
	@Test
	public void tst3() {
		Assert.assertEquals(8, findNum(new int[] {9,6,4,2,3,5,7,0,1}));
	}
	
	@Test
	public void tst4() {
		Assert.assertEquals(0, findNum(new int[] {1,2,3}));
	}
}
