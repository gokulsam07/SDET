package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class PivotIndex {


	//Input: array of numbers
	//Output: index where the right sum & left sum equals, if present
	//Logic:
	//1. Iterate the array in a for loop
	//2. Initialize sum1 & sum2
	//3. In a for loop with index i+1, run it till last index of array to add all the values of arr i+1 to sum1 (rightsum)
	//4. In a for loop with index i-1, run it till first index of array to add all the values of arr i-1 to sum2 (leftsum)
	//5. check if both the sum are equal, if yes return i, else return -1 outside loop

	public int findPivot(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int sum1=0,sum2=0;

			for (int j = i+1; j < arr.length; j++) {
				sum1+=arr[j];
			}

			for (int m = i-1; m >= 0; m--) {
				sum2+=arr[m];
			}

			if(sum1==sum2) {
				return i;
			}

		}
		return -1;
	}

	@Test
	public void tst1() {
		Assert.assertEquals(3, findPivot(new int[] {1,7,3,6,5,6}));
	}

	@Test
	public void tst2() {
		Assert.assertEquals(-1, findPivot(new int[] {1,2,3}));
	}

	@Test
	public void tst3() {
		Assert.assertEquals(0, findPivot(new int[] {2,1,-1}));
	}
}
