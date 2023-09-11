package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class CW_Diet_Medium {
	
	//Input: int[] , int , int, int
	//Output: int (can be -ve)
	//Logic
	//  Initialize total =0
	//1. Run a for loop till cal.length-k
			//a. Initialize sum to add all the subset array
			//b. Initialize for loop, start index from i till less than i+k (to take subset), add all the cal values in the sum 
			//c. check if the sum is grt or lower than upper and lower using conditional checks, increment total as sum >upper 
			//d. decrement total if sum<lower
	//return total
	
	//Time complexity  - O[N2]

	public int diet(int[] cal, int k, int lower, int upper) {
		int total = 0;

		for (int i = 0; i <= cal.length - k; i++) { //{4,5,3,2,8,7},3,13,14
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += cal[j];
			}

			if (sum < lower) {
				total--;
			} else if (sum > upper) {
				total++;
			}
		}

		return total;
	}

	
	
	
	@Test
	public void test1() {
		Assert.assertEquals(0, diet(new int[] {1, 2, 3, 4, 5},1,3,3));
	}

	@Test
	public void test2() {
		Assert.assertEquals(1, diet(new int[] {3, 2},2,0,1));
	}

	@Test
	public void test3() {
		Assert.assertEquals(0, diet(new int[] {6, 5, 0, 0},2,1,5));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(-1, diet(new int[] {4,5,3,2,8,7},3,13,14));
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(3, diet(new int[] {0,5,4,2,1,7,6,9},6,2,4));
	}
	
	@Test
	public void test6() {
		Assert.assertEquals(1, diet(new int[] {0,5,4,2,1,7,6,9},8,2,4));
	}

}
