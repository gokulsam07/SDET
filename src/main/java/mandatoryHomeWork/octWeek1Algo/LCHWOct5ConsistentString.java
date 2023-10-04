package mandatoryHomeWork.octWeek1Algo;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct5ConsistentString {
	//ip: String, String[]
	//op: int
	//Logic  : init HashSet fa Char
	//1. take the len of String[]
	//2. Iterate the allowed string & add to set
	//3. Iterate the str array
	//4. iterate all the chars in each word, check if the char in the word is not present in the allowed string, if yes reduce result and break 
	// return result
	//O[N3] -- TC ; SC:O[N]

	 public int countConsistentStrings(String allowed, String[] words) {
	       HashSet<Character> set = new HashSet<>();
	       int result=words.length;
	       for(char ch :allowed.toCharArray()){
	           set.add(ch);
	       }

	       for(String word: words){
	           for(int i=0;i<word.length();i++){
	               if(!set.contains(word.charAt(i))){
	                    result--;
	                    break;
	               } 
	           }
	       
	       }

	 return result;      

	    }
	 
		@Test
		public void test1() {
			Assert.assertEquals(3, countConsistentStrings("va", new String[] {"ava","av","va","q","qav"}));
		}
		@Test
		public void test2() {
			Assert.assertEquals(4, countConsistentStrings("zip", new String[] {"zzz","iiiieee","pip","pzz","piz"}));
		}

		@Test
		public void test3() {
			Assert.assertEquals(0, countConsistentStrings("no", new String[] {"yup","yes","va","nay","yay"}));
		}
		@Test
		public void test4() {
			Assert.assertEquals(3, countConsistentStrings("ba", new String[] {"aba","a","ba","q","qav"}));
		}

}
