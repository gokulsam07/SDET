package mandatoryHomeWork.postfoundationDailyHW;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Sep4LCHW_Acronym {
	
	//Input: String list, String
	//Output: boolean
	//Logic
	//1. Check if the len of string and size of list is !=, if yes, retrun false
	//2. In a for each loop, append the first char of each word to string builder
	//3. Store the sb in fin check if it equals string s
	
	public boolean isAcronym(List<String> words, String s) {
		   StringBuilder sb = new StringBuilder();
	        if(words.size()!=s.length()) return false;

	        for(String word:words){
	            sb.append(word.charAt(0));
	        }

	       String fin = new String(sb);

	       return fin.equals(s);
	}
	
	@Test
	public void test1() {
		ArrayList<String> al = new ArrayList<>();
		al.add("if");
		al.add("you");
		al.add("know");
		al.add("what");
		al.add("i");
		al.add("mean");
		Assert.assertEquals(true, isAcronym(al,"iykwim"));
	}

	
	@Test
	public void test2() {
		ArrayList<String> al = new ArrayList<>();
		al.add("alice");
		al.add("bob");
		al.add("charlie");
		Assert.assertEquals(true, isAcronym(al, "abc"));
	}

	@Test
	public void test3() {
		ArrayList<String> al = new ArrayList<>();
		al.add("an");
		al.add("apple");
		Assert.assertEquals(false, isAcronym(al,"a"));
	}
	
	@Test
	public void test4() {
		ArrayList<String> al = new ArrayList<>();
		al.add("For");
		al.add("your");
		al.add("information");
		Assert.assertEquals(false, isAcronym(al,"fyi"));
	}

}
