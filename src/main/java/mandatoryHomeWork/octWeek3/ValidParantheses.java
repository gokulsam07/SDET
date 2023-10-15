package mandatoryHomeWork.octWeek3;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class ValidParantheses {
	//ip: String
	//op: boolean
	//Logic : init stack char
	//1. Iterate all the chars, if the char is a not closing brace, push to stack
	//2. If the char is closing char, check in switch case condtion, if the pop returns corresponding opening char, if not return false
	// return true in all cases
	//TC: O(n), SC: O(n)
	public boolean isValid(String s) { //({[]})
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) { 
			 switch (c) {
	            case ')':
	                if (stack.isEmpty() || stack.pop() != '(') {
	                    return false;
	                }
	                break;
	            case '}':
	                if (stack.isEmpty() || stack.pop() != '{') {
	                    return false;
	                }
	                break;
	            case ']':
	                if (stack.isEmpty() || stack.pop() != '[') {
	                    return false;
	                }
	                break;
	            default:
	                stack.push(c);
	        }
		}
		return stack.isEmpty();
	}



	@Test
	public void test() {
		Assert.assertEquals(true, isValid("{}()[]"));
	}
	@Test
	public void test1() {
		Assert.assertEquals(false, isValid("{)(}[]"));
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, isValid("{]"));
	}
	@Test
	public void test3() {
		Assert.assertEquals(false, isValid("(][)"));
	}
	@Test
	public void test4() {
		Assert.assertEquals(true, isValid("({[]})"));
	}
}

