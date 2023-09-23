package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class Sept23_Palindrome {

	//ip: String
	//op : boolean
	//Logic init two pointers
	//1. Check if the char at pointer i and j are equal until the pointers cross (inc i, dec j after each poitn check)
	//2. If pointers are equal continue loop, else return false
	//3 return true
	//Time complexity - O[N/2]

	public boolean isPalindrome1(String s) {
		if (s.length()<1) return false;
		for(int i=0, j=s.length()-1;i<j;i++,j--) {
			if(s.charAt(i)==s.charAt(j)) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}

	//Expand from centre
	public boolean isPalindrome(String s) {
		if (s.length()<1) return false;

		int left =s.length()/2 -1;
		int right = (s.length()%2==0)? s.length()/2 : s.length()/2 +1;
		while(right<s.length()) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			else {
				right++;
				left--;
			}
		}
		return true;
	}

	@Test
	public void test1() {
		Assert.assertEquals(true, isPalindrome("radar"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, isPalindrome("rader"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(true, isPalindrome("c"));
	}
	@Test
	public void test4() {
		Assert.assertEquals(false, isPalindrome(""));
	}

	@Test
	public void test5() {
		Assert.assertEquals(true, isPalindrome("RADAR"));
	}

	@Test
	public void test6() {
		Assert.assertEquals(true, isPalindrome("RaDaR"));
	}
	@Test
	public void test7() {
		Assert.assertEquals(false, isPalindrome("RaDar"));
	}
	@Test
	public void test8() {
		Assert.assertEquals(true, isPalindrome("moom"));
	}
}
