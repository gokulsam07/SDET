package mandatoryHomeWork.octWeek1Algo;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class AllAnagramUsingArrays {

	public boolean anagramCheck(String s, String t) {
		int[] arr = new int[26];
		if(s.length()!=t.length()) return false;

		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
			arr[t.charAt(i)-'a']--;
		}

		return Arrays.toString(arr).equals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
	}

	@Test
	public void test1() {
		Assert.assertEquals(true, anagramCheck("anagram","gramana"));
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, anagramCheck("dabble","babble"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(true, anagramCheck("lamayalam","malayalam"));
	}

	@Test
	public void test4() {
		Assert.assertEquals(false, anagramCheck("bbcc","dabc"));
	}
}