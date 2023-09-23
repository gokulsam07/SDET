package mandatoryHoweWork.septWeek3Algos;

import org.junit.Test;
import org.testng.Assert;

public class Sep21LCHW_IsNice {

	//ip : Stri g
	//op : String
	//Logic init  empty string ans
	//1. Run two for loops, from i=0 & j=i+1 till length of string, take subString using i and j (j+1)
	//2. Check if the sub isNice and len of sub >len of ans, if yes assign the sub to ans
	//3. Return ans

	//IsNice
	//Run a for each by converting the passed substring to char[]
	//if char is upper convert to lower and vice versa - store in char
	// if the converted char is not present in the substring passed, return false
	//return true in all other cases

	//Time complexity - O[N3]

	public String longestNiceSubString(String s) {

		String ans = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				String sub = s.substring(i, j + 1);
				if (isNice(sub) && sub.length() > ans.length()) {
					ans = sub;
				}
			}
		}

		return ans;
	}

	public static boolean isNice(String s) {
		for (char c : s.toCharArray()) {
			char op = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
			if (s.indexOf(op) == -1) {
				return false;
			}
		}
		return true;
	}


	@Test
	public void test1() {
		Assert.assertEquals("YazaZyAay", longestNiceSubString("YazaZyAay"));
	}

	@Test
	public void test2() {
		Assert.assertEquals("Bb", longestNiceSubString("Bb"));
	}

	@Test
	public void test3() {
		Assert.assertEquals("", longestNiceSubString("c"));
	}

	@Test
	public void test4() {
		Assert.assertEquals("cCcC", longestNiceSubString("cCcCbvAbBa"));
	}
}
