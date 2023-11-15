package mandatoryHomeWork.novWeek3;

import org.junit.Assert;
import org.junit.Test;

public class CWNov15_MaxContinuousSubSequence {
	//ip: int[]
	//op: int
	//Logic --> init two pointers, zeroCounter
	//1. Loop thru all elements using right pointer
	//2. if element at the right index is zero, inc zeroCounter by 1
	//3. while zeroCount > 0, check if ele at index left is zero, if yes dec zeroCounter 
	//4. inc left by 1
	//5. Loop in reverse from right position till i gte 0, whenever the index equls 0, return i
	//return -1 all other
	//TC:O[N], SC:O[k]
	

	    public int findIndexToReplace(int[] arr) {
	        int zeroCount = 0;  
	        int left = 0;      
	        int right =0;
	        for (right = 0; right < arr.length; right++) {
	            if (arr[right] == 0) {
	            	zeroCount++;
	            }
	            while (zeroCount > 0) {
	                if (arr[left] == 0) {
	                	zeroCount--;
	                }
	                left++;
	            }
	        }
	        for (int i = right - 1; i >= 0; i--) {
	            if (arr[i] == 0) {
	                return i;
	            }
	        }

	        return -1; 
	    }
	    
		 @Test
		 public void test()
		 {
			Assert.assertEquals(2, findIndexToReplace( new int[]{0,0,0,1,1,1,1,1}));
		 }
		 @Test
		 public void test1()
		 {
			 Assert.assertEquals(7, findIndexToReplace( new int[]{ 0, 0, 1, 0, 1, 1, 1, 0, 1, 1}));
		 }
		 @Test
		 public void test3()
		 {
			 Assert.assertEquals(-1, findIndexToReplace( new int[]{1,1,1,1,1,1}));
		 }
		 
		 public void test4()
		 {
			 Assert.assertEquals(3, findIndexToReplace( new int[]{1,1,0,0,1,1,1,1}));
		 }
}
