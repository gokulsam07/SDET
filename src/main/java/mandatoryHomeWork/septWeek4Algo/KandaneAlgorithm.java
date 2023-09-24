package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class KandaneAlgorithm {
	//ip: int[]
	//op : int
	//Logic = init maximumSum & currentSum
	//1. Iterate through all the elements, add each num to current sum
	//2. Store maximum of maximumSum and currentSum in maximumSum
	//3. If currentSum is negative set it to zero
	// return (maximumSum<0)?0:maximumSum
	
	//Time complexity - O[N], Space complexity - O[k]
	public int maxSubArray(int[] a) {
	    int maximumSum = Integer.MIN_VALUE;
	    int currentSum = 0;
	    
	    for (int num : a) {
	        currentSum += num;
	        maximumSum = Math.max(maximumSum, currentSum);
	        if (currentSum < 0) {
	            currentSum = 0;
	        }
	    }
	    
	    return (maximumSum<0)?0:maximumSum;
	}
	
	@Test
	public void test(){
		Assert.assertEquals(6, maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}
	@Test
	public void test1(){
		Assert.assertEquals(4, maxSubArray(new int[] {-1,-2,4,-5}));
	}

	@Test
	public void test2(){
		Assert.assertEquals(0, maxSubArray(new int[] {-2,-3,-5}));
	}

}
