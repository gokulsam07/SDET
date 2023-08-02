package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class IncreaseSumBy1 {
	
	//Input: Array of number
	//Output: Array of numbers --> increment the face value by 1
	//Logic:
	//1. In a for loop, check if the number is less than 9, if yes increment it by 1 and return it
	//2. If no, set it to zero and continue the loop till first index
	// The below logic is to add 1 in front if the number has only 9 in face value
	///3. increment the array size by 2 (by default it will add 0 to last index)
	//4. Add 1 to index 0 and return it
	
	public int[] incSum(int[] arr) {
		 for (int i = arr.length - 1; i >= 0; i--) {
				if (arr[i] < 9) {
					arr[i]++;
					return arr;
				}
				arr[i] = 0;
			}

			arr = new int[arr.length + 1];
			arr[0] = 1;
			return arr;
	}

	@Test
	public void tst1() {
		Assert.assertArrayEquals(new int[] {9,8,7,6,5,4,3,2,1,1}, incSum(new int[] {9,8,7,6,5,4,3,2,1,0}));
	}

	@Test
	public void tst2() {
		Assert.assertArrayEquals(new int[] {4,3,3,0}, incSum(new int[] {4,3,2,9}));
	}

	@Test
	public void tst3() {
		Assert.assertArrayEquals(new int[] {2,0}, incSum(new int[] {1,9}));
	}
}
