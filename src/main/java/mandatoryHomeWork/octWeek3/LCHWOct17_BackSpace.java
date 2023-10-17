package mandatoryHomeWork.octWeek3;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class LCHWOct17_BackSpace {
	
	//ip: String, String
	//op: boolean
	//Logic : init two char stack 
	//Run thru all element of s and if the char is a to z push to stack, else check if stack is not empty and pop 
	//do the same for t str
	//return s1 equals s2
	//TC: O[N]; SC: O[N]
	public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
		 Stack<Character> s2 = new Stack<>();
		 for(char ch: s.toCharArray()){
			 if(ch>='a'&&ch<='z') {
				s1.push(ch);
			 }
			 else {
				 if(!s1.isEmpty()) s1.pop();
			 }
		 }
		 for(char ch: t.toCharArray()){
			 if(ch>='a'&&ch<='z') {
				s2.push(ch);
			 }
			 else {
				 if(!s2.isEmpty()) s2.pop();
			 }
		 }
	        return s1.equals(s2);
   }
	
	
	@Test
	public void test() {
		Assert.assertEquals(true, backspaceCompare("##aba##b","##ab"));
	}
	@Test
	public void test1() {
		Assert.assertEquals(true, backspaceCompare("##b##",""));
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, backspaceCompare("##aba##ba##","##ab#a"));
	}
	@Test
	public void test3() {
		Assert.assertEquals(false, backspaceCompare("b#bac##","b#b#b#"));
	}
}
