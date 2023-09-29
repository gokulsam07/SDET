package mandatoryHomeWork.septWeek3Algos;

import org.junit.Test;
import org.testng.Assert;

public class Sep22LCHW_KBeauty {
	//ip : int, int
	//op: int
	//Logic: init beauty, convert the num to string
	//1. Run a for loop from start to index length-k
	//2. Take substring from i to i+k and convert to int
	//3. if the num !=0 && the num/sub has no remainder, inc beauty by 1
	// return beauty
	//Time complexity - O[N*M] -- n len of given num, m for substring time

	public int divisorSubstrings(int num, int k) {
		int beauty=0;
		String s = String.valueOf(num);

		for(int i=0;i<=s.length()-k;i++) {
			int sub = Integer.valueOf(s.substring(i,i+k));
			if(sub!=0&&num%sub==0) {
				beauty++;
			}
		}
		return beauty;

	}

	@Test
	public void test1() {
		Assert.assertEquals(1, divisorSubstrings(631,1));
	}

	@Test
	public void test2() {
		Assert.assertEquals(2, divisorSubstrings(240,2));
	}

	@Test
	public void test3() {
		Assert.assertEquals(1, divisorSubstrings(50000,3));
	}
	@Test
	public void test4() {
		Assert.assertEquals(2, divisorSubstrings(430043,2));
	}

}
