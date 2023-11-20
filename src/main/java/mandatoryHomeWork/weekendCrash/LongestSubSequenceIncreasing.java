package mandatoryHomeWork.weekendCrash;

import org.junit.Test;
import org.testng.Assert;

public class LongestSubSequenceIncreasing {
	
	//ip: int[]
	//op: int
	//Logic --> init len & currLen=1 & two pointer at idx 0 &1 
	//1. Run while loop till last ele
	//2. if ele at j> ele at i, inc currLen & inc both pointers by 1 
	//3. else shift the i to j and inc j by 1 & set currLen to 1
	
	//if len<currLen assign currLen to len & return len
	//TC: O(n), SC: O(1)
	@Test
	public void lenTest() {
		Assert.assertEquals(3, maxSubSeqLen(new int[] {5,2,4,4,5,6}));
	}
	@Test
	public void lenTest1() {
		Assert.assertEquals(5, maxSubSeqLen(new int[] {1,2,3,4,5}));
	}
	@Test
	public void lenTest2() {
		Assert.assertEquals(1, maxSubSeqLen(new int[] {9,8,7,6,4}));
	}
	@Test
	public void lenTest3() {
		Assert.assertEquals(3, maxSubSeqLen(new int[] {1,1,2,2,3,5}));
	}
	    public int maxSubSeqLen(int[] nums) {
	        int len=1,currLen=1,i=0,j=1;
	        while(j<nums.length) {
	        	if(nums[j]>nums[i]) {
	        		currLen++;i++;j++;
	        	}
	        	else {
	        		i=j;j++;currLen=1;
	        	}
	        	len = (len<currLen)? currLen:len;
	        }
	        return len;  
	    }
	}

