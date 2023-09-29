package mandatoryHomeWork.septWeek3Algos;

import org.junit.Test;
import org.testng.Assert;

public class Sep22CW_RemoveOuterParantheses {
	//ip: String
	//op: String
	//Logic: Init StringBuilder and freq
	//1. Run till last element using for loop
	//2. if the char is ( check if the freq >0, if yes append the char tp sb
	//freq++
	//3. else, reduce freq, and if freq>0, append char to sb
	//return sb as string
	//Time complexity - O[N]
	public String removeOuterParentheses(String s) {
		StringBuilder sb = new StringBuilder();
		int freq = 0;

		for (int i = 0; i < s.length(); i++) { //(()())(())(()(()))
			if (s.charAt(i) == '(') {
				if (freq > 0) {
					sb.append(s.charAt(i));
				}
				freq++;
			} else {
				freq--;
				if (freq > 0) {
					sb.append(s.charAt(i));
				}
			}
		}

		return new String(sb);
	}

	@Test
	public void test1() {
		Assert.assertEquals("()()()", removeOuterParentheses("(()())(())"));
	}

	@Test
	public void test2() {
		Assert.assertEquals("", removeOuterParentheses("()"));
	}

	@Test
	public void test3() {
		Assert.assertEquals("()()()()(())", removeOuterParentheses("(()())(())(()(()))"));
	}

	@Test
	public void test4() {
		Assert.assertEquals("", removeOuterParentheses(""));
	}
}
