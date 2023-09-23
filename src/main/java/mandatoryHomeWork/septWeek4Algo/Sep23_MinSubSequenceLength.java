package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class Sep23_MinSubSequenceLength {

	//ip: int[], int
	//op : int
	//Logic - init left, right, currentSum, minSubArrayLength as Integer.MAX_VALUE

	//1. Run a while loop till the right index is less than the int[] length
	//2. Add the value in the right index to currentSum
	//3. Run a while loop if the currentSum > k
	// set the min of minSubArrayLength & length of index of p1 & p2 +1
	// subtract the left index value and inc left by 1 
	// inc right by 1
	//if the minSubarrayLength equals the max value return -1 (no match) else return the minSubarrayLength

	public int minLengthSubarray(int[] input, int k) {
		int left = 0;
		int right = 0;
		int minSubarrayLength = Integer.MAX_VALUE;
		int currentSum = 0;

		while (right < input.length) { //6,2,3,4,1
			currentSum += input[right];

			while (currentSum > k) {
				minSubarrayLength = Math.min(minSubarrayLength, right - left + 1);
				currentSum -= input[left];
				left++;
			}

			right++;
		}

		return minSubarrayLength == Integer.MAX_VALUE ? -1 : minSubarrayLength;
	}


	@Test
	public void test1(){
		Assert.assertEquals(3, minLengthSubarray(new int[]{1,2,3,4,5}, 10));
	}
	@Test
	public void test2(){
		Assert.assertEquals(2, minLengthSubarray(new int[]{1,2,4,4,1}, 7));
	}

	@Test
	public void test3(){
		Assert.assertEquals(-1, minLengthSubarray(new int[]{1,2,3,4,5}, 22));
	}

	@Test
	public void test4(){
		Assert.assertEquals(1, minLengthSubarray(new int[]{1,2,3,4,6}, 5));
	}

	@Test
	public void test5(){
		Assert.assertEquals(1, minLengthSubarray(new int[]{6,2,3,4,1}, 5));
	}




}
