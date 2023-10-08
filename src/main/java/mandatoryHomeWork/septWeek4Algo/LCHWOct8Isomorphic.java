package mandatoryHomeWork.septWeek4Algo;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct8Isomorphic {
	
	//ip : String, String
	//op: true or false
	//Logic
	//1. if len <>, return false
	//2.Init hm of Char, Char
	//3.Iterate through all the elements till last 
		//4. Check if the char of s & is not available as key or value , if not available add to hm else return false
	//5. Check if the value for char in s equals the current char in string t, if not return false
	
	//TC : O[N2], SC: O[N]
	
	 public boolean isIsomorphic(String s, String t) {
         if(s.length()!=t.length()) return false;
      Map<Character, Character> hm = new HashMap<>();

   for (int i = 0; i < s.length(); i++) {
     char sChar = s.charAt(i);
     char tChar = t.charAt(i);
     if (!hm.containsKey(sChar)) {
       if (!hm.containsValue(tChar))
         hm.put(sChar, tChar);
       else
         return false;
     }
     else {
       char ch = hm.get(sChar);
       if (ch != tChar)
         return false;
     }
   }

   return true;
 }
	 
		@Test
		public void test1() {
			Assert.assertEquals(true, isIsomorphic("abc", "def"));
		}

		@Test
		public void test2() {
			Assert.assertEquals(true, isIsomorphic("vikki", "nikki"));
		}

		@Test
		public void test3() {
			Assert.assertEquals(false, isIsomorphic("vye", "yay"));
		}
		
		@Test
		public void test4() {
			Assert.assertEquals(false, isIsomorphic("xanthippe", "pep"));
		}

}
