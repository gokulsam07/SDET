package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class Sep24_ShortestDistanceToChar {

	//ip: String 
	//op: int[]
	//Logic init int[] of size == string length. init j as max value of int
	//1. Run a for loop till last element, if the char is given char, set i to j 
	// Set the absoulte value of  diff of i & j in op
	//2. Run a for loop from length to zero, if the char is given char, set i to j 
	// set the minimum of abs diff of i&j / existing value in the array of the index
	//return op

	//Time complexity - O[2N] , space complexity  - O[N]

	public int[] shortestToChar(String s, char c) {
		int[] op = new int[s.length()];
		int j = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) { //loveleetcode
			if (s.charAt(i) == c) {
				j=i;
			}
			op[i] = Math.abs(i - j);
		}
		j = Integer.MAX_VALUE;
		for (int i = s.length() - 1 ; i >= 0; i--) { ///loveleetcode
			if (s.charAt(i) == c) {
				j = i;
			}
			op[i] = Math.min(op[i], Math.abs(i - j));
		}
		return op;
	}
	
	@Test
	public void test(){
		Assert.assertEquals(new int[] {3,2,1,0,1,0,0,1,2,2,1,0}, shortestToChar("loveleetcode", 'e'));
	}
	@Test
	public void test1(){
		Assert.assertEquals(new int[] {0,0,0,0,0}, shortestToChar("aaaaa", 'a'));
	}

	@Test
	public void test2(){
		Assert.assertEquals(new int[] {0,1,2,3,4,5,6,7}, shortestToChar("abcdefgh", 'a'));
	}

}
