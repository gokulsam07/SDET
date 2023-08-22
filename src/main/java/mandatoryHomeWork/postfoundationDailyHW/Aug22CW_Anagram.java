package mandatoryHomeWork.postfoundationDailyHW;

import java.util.HashMap;
import org.junit.Test;
import org.testng.Assert;

public class Aug22CW_Anagram {
	//Input: String, String
	//Output: boolean
	//Logic
	//1. convert the given strings to lowercase to avoid issues of case sensitivity
	//2. Create two hashmaps of Char,Int K,V
	//3. Iterate the strings separately to run through all the elements & check if the map contains the key, if yes increase the value by 1 
	// if it doesn't put 1 for the given key
	//4. return m1.equals(m2)
	
	//Time Complexity --- O[N]
	
	
	public boolean isAnagram(String a,String b) {
		String s1 =a.toLowerCase();
		String s2 =b.toLowerCase();
		if(a.length()!=b.length()) return false;
		HashMap<Character,Integer> m1 = new HashMap<>();
		HashMap<Character,Integer> m2 = new HashMap<>();

		for(int i=0;i<s1.length();i++) {
			if(m1.containsKey(s1.toCharArray()[i])) {
				m1.put(s1.toCharArray()[i], m1.get(s1.toCharArray()[i])+1);
			}
			else {
				m1.put(s1.toCharArray()[i], 1);
			}
		}


		for(int i=0;i<s2.length();i++) {
			if(m2.containsKey(s2.toCharArray()[i])) {
				m2.put(s2.toCharArray()[i], m2.get(s2.toCharArray()[i])+1);
			}
			else {
				m2.put(s2.toCharArray()[i], 1);
			}
		}

		return m1.equals(m2);
	}

	@Test
	public void test1() {
		Assert.assertEquals(true, isAnagram("anaGram","gramana"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, isAnagram("anaram","gramana"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(true, isAnagram("lamayalam","malayalam"));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(false, isAnagram("bbcc","dabc"));
	}


}
