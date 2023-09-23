package mandatoryHoweWork.septWeek3Algos;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Sep17_MinDiffSlideWindow {

	//ip: int[], int
	//op: int
	//Logic
	//1. Sort the array
	//2. Init min = integer max
	//3. Run a for loop till length of array -k
	//4. subtract the next element from the previous element
	//5. check if the sub is less than min, and assign the lowest one
	//return min
	//Time complexity -- n log n
	public int minDiff(int[] a, int k) {
		Arrays.sort(a);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<=a.length-k;i++) { //1,4,7,9 k=2
			int sub = a[i+k-1]-a[i];
			min = Math.min(min, sub);
		}
		return min;
	}


	@Test
	public void test1() {
		Assert.assertEquals(0, minDiff(new int[] {90},1));
	}

	@Test
	public void test2() {
		Assert.assertEquals(2, minDiff(new int[] {9,4,1,7},2));
	}

	@Test
	public void test3() {
		Assert.assertEquals(3, minDiff(new int[] {0,1,3,5,9},3));
	}
}
