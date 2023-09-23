package mandatoryHoweWork.septWeek3Algos;

import org.junit.Test;
import org.testng.Assert;

public class Sep17_SlidingWindowMaxConsecutive {

	//ip : int[], int
	//op : int
	//Logic
	//1. Init max=Integer.MIN_VALUE
	//2. Run a for loop, till arr.length-k
	//3. init sum=0, run a nested for loop starting from i to <i+k
	//4. add the values in nested for loop , check if sum> max, if yes assign sum to max
	//return max
	//Time complexity -- O[N2]

	public int maxCons1(int[] arr, int k) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i  <= arr.length-k; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += arr[j];
			}
			if (sum > max)
				max = sum;
		}

		return max;
	}

	//ip: int[] , int
	//op :int
	//Logic
	//1. Init, max, sum
	//2. Add first k elements in arr and set to sum
	//3. In next for loop, start from k,till arr.length-1, add the next arr value (arr[i]) & sub the first one (arr[i-k])
	//4. Using math.max, assign the max value 

	//return max

	//Time complexity - O[N]

	public int maxCons(int[] arr, int k) {
		int max = Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i<k; i++) {
			sum+=arr[i];
		}
		max=sum;
		for (int i = k; i < arr.length; i++) { //-2,1,0
			sum=sum+arr[i]-arr[i-k];
			max=Math.max(sum, max);
		}

		return max;
	}

	@Test
	public void test1() {
		Assert.assertEquals(10, maxCons(new int[] {1,5,2,3,7,1},2));
	}

	@Test
	public void test2() {
		Assert.assertEquals(7, maxCons(new int[] {2,3,4,7},1));
	}

	@Test
	public void test3() {
		Assert.assertEquals(-1, maxCons(new int[] {-2,1,0},3));
	}

}
