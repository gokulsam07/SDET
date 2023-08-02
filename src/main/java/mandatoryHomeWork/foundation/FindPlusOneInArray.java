package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class FindPlusOneInArray {

	//Input : array of numbers
	//Outuput: count of numbers that satisfy x+1 availability 
	//Logic:
	//Initialize count=0;
	//   1. Iterate the given array in a for loop
	//   2. Using inner for loop iterate the same array using i+1 index to check if element in arr[i] is having a match for arr[i]+1
	// 3. If yes return the count

	public int plusOne(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]==arr[i]+1) {
					count++;
				}
			}
		}
		return count;
	}


	@Test
	public void tst1() {
		Assert.assertEquals(2, plusOne(new int[] {1, 2, 3}));
	}
	@Test
	public void tst2() {
		Assert.assertEquals(0, plusOne(new int[] {1, 1, 3, 3, 5, 5, 7, 7}));
	}
	@Test
	public void tst3() {
		Assert.assertEquals(4, plusOne(new int[] {1,2,2,3}));
	}

	@Test
	public void tst4() {
		Assert.assertEquals(3, plusOne(new int[] {-1, 0, 1, 5,6}));
	}


	@Test
	public void tst5() {
		Assert.assertEquals(4, plusOne(new int[] {5,3,1,0,-1,4}));
	}

}
