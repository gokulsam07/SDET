package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class MaxConsecutiveRedo {
	
	//ip: string
	//op: int
	//Logic - init two pointer at 0 & 1, count var for res
	//1. run a while loop till the last element
	//2. if both the pointer index doesn't have same char, make both pointer point to same index
	//3. else assign the length of the max count by calculating the length of right-left
	//return count
	//TC : O[N], SC: O[k]
	
	public int maxCons(String s) {
		int left =0;
		int right=0;
		int count=0;
		
		while(right<s.length()) {
			if(s.charAt(right)!=s.charAt(left)) {
				left=right;
			}
			else {
				count = Math.max(count, right-left+1);
			}
			right++;
		}
		
		
		return count;
	}

	
	@Test
	public void test1() {
		Assert.assertEquals(1, maxCons("abcdef"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(3, maxCons("aabbbccdd"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(4, maxCons("deeeeree"));
	}
}
