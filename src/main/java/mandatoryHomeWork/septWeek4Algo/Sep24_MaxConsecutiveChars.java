package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class Sep24_MaxConsecutiveChars {
	//ip: String
	//op: int
	//Logic init left, right , count
	// Iterate till last elememt of string 
		// if the left and right char not equal, move the left pointer to the place where right pointer exists
		// else take the maximum of count / right-left+1
	//return count
	//time complexity - O[N], space complexity - O[1]

	public int maxPower(String s) {
		int left=0;
		int right=0;
		int count=0;

		while(right<s.length()) {
			if(s.charAt(left)!=s.charAt(right)) {
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
	public void test(){
		Assert.assertEquals(2, maxPower("leetcode"));
	}
	@Test
	public void test1(){
		Assert.assertEquals(5, maxPower("abbcccddddeeeeedcba"));
	}

	@Test
	public void test2(){
		Assert.assertEquals(1, maxPower("a"));
	}
	@Test
	public void test3(){
		Assert.assertEquals(5, maxPower("aaaaa"));
	}
	@Test
	public void test4(){
		Assert.assertEquals(1, maxPower("abcdef"));
	}
}
