package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class Sep23_SentencePalindrome {

	//ip : String
	//op: boolean[]
	//Logic
	// Split the sentence at "  ", create bool[] of size word.length, count =0
	//1. Run a for each to iterate all the words, pass word to a method to check if it is palindrome
	//2. If yes, set the value in op to true, else false
	//3. return boolean array

	//for palindrome check
	///Logic init two pointers
	//1. Check if the char at pointer i and j are equal until the pointers cross (inc i, dec j after each poitn check)
	//2. If pointers are equal continue loop, else return false
	//3 return true

	//Time complexity -  O[N], Space complexity - O[N]

	public boolean[] isPalindrome(String s) {
		String[] words = s.toLowerCase().split(" ");
		boolean[] op = new boolean[words.length];
		int count=0;

		for(String word:words) {
			if(checkPass(word)) {
				op[count++]=true;
			}
			else {
				op[count++]=false;
			}
		}
		return op;
	}

	public boolean checkPass(String s) {
		int left = s.length()/2 -1;
		int right = (s.length()%2==0)? s.length()/2 : s.length()  +1;
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
		Assert.assertEquals(new boolean[] {false, false, true, true}, isPalindrome("This is a Tst"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(new boolean[] {false, false, false, true}, isPalindrome("mY mother tongue MalaYAlAm"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(new boolean[] {true}, isPalindrome("MoOm"));
	}

}
