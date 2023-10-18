package mandatoryHomeWork.octWeek3;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class LCHWOct18_RemoveDuplicate {
	// ip: string
	// op: string
	// Logic : init char stack & sb
	// Run thriugh all the string ele after conversion to char[]
	// 1. if the stk isn't empty and the char in current iteration equals char in stk, pop the stk
	//2. else add the value to stack
	// 3, Loop through stk till it is empty, add it to sb
	/// return sb as string in reversed format
	// TC & SC :O[N]
	public String removeDuplicates(String s) {
		Stack<Character> stk = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (!stk.isEmpty() && ch == stk.peek()) {
				stk.pop();
			} else {
				stk.push(ch);
			}
		}
		while (!stk.isEmpty()) {
			sb.append(stk.pop());
		}
		return new String(sb.reverse());
	}
	
	@Test
	public void test() {
		Assert.assertEquals("ab", removeDuplicates("bbabbb"));
	}
	@Test
	public void test1() {
		Assert.assertEquals("cab", removeDuplicates("cab"));
	}
	@Test
	public void test2() {
		Assert.assertEquals("", removeDuplicates("abssba"));
	}
	@Test
	public void test3() {
		Assert.assertEquals("robie", removeDuplicates("rooobie"));
	}
}
