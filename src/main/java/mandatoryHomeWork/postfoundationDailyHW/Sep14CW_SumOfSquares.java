package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Sep14CW_SumOfSquares {
	//ip : int[]
	//op : int
	//Logic
	//1. Run for loop from  1 to n
	//2. check if n%i==0, if yes square nums[i-1] and add it to total
	//return total
	//Time complexity - O[N] - n length of array
	
	public int sumOfSquares(int[] nums) {
        int total = 0;
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                total = total + nums[i - 1] * nums[i - 1];
            }
        }
        return total;
    }
	
	@Test
	public void test1() {
	
		Assert.assertEquals(21, sumOfSquares(new int[] {1,2,3,4}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(63, sumOfSquares(new int[] {2,7,1,19,18,3}));
	}


}
