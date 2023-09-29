package mandatoryHomeWork.septWeek3Algos;

import org.junit.Test;
import org.testng.Assert;

public class Sep18LCHW_GoodSubString {
	//ip: String
	//op: int
	//Logic
	//Init count
	//1. Run the for lopp from 0 to i<=s.length()-3 for accomodating all the substrings
	//2. check if the first, second & third char are non repeating
	//if yes, count++
	//return count

	//Time complexity -- O[N] -- n number of substrings

	public int countGoodSubstrings(String s) {
		int count=0;
		for(int i=0;i<=s.length()-3;i++){
			if((s.charAt(i)!=s.charAt(i+1))&&(s.charAt(i)!=s.charAt(i+2))&&(s.charAt(i+2)!=s.charAt(i+1))){
				count++;
			}
		}
		return count;
	}

	@Test
	public void test1() {
		Assert.assertEquals(0, countGoodSubstrings("a"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(1, countGoodSubstrings("abc"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(1, countGoodSubstrings("xyzzaz"));
	}

	@Test
	public void test4() {
		Assert.assertEquals(4, countGoodSubstrings("aababcabc"));
	}
}
