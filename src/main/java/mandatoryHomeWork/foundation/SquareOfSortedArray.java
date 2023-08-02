package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SquareOfSortedArray {
	
//	Input: sorted array
//	Output: Square of the sorted array in sorted format
//	Logic:
//		1. Iterate the array in a for loop 
//		2. mulitply the arr value with itself and store in the same index to get square
//		3. Sort and return array

	public int[] squareSorted(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[i]*arr[i];
		}
		Arrays.sort(arr);
		return arr;
	}

	@Test
	public void tst1() {
		int[] expected = {0,1,9,16,100};
		int[] actual = squareSorted(new int[]{-4,-1,0,3,10});
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tst2() {
		int[] expected = {4,9,9,49,121};
		int[] actual = squareSorted(new int[]{-7,-3,2,3,11});
		Assert.assertArrayEquals(expected, actual);
	}
}
