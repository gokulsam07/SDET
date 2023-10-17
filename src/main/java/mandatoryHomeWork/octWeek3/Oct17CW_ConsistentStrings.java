package mandatoryHomeWork.octWeek3;

import org.junit.Assert;
import org.junit.Test;

public class Oct17CW_ConsistentStrings {
	
	//ip: str[],str[]
	//op: int
	//Take length of words[]
	//Logic : Init freq array to store the char freq of allowed
	//1. Iterate the words array, convert each string to charArr 
	//2. if the char is not present in alArr, reduce the length of words & break
	//return len
	//TC:O[N*M] --> N -leng of words[], M--> len of each word
	//SC:O[N]
	
	  public int countConsistentStrings(String allowed, String[] words) {  
	        int len = words.length;
		    int[] alArr = new int[26];
		for (char ch : allowed.toCharArray()){
			alArr[ch-'a']++;
	    }
		for (String word : words) {	
			for (char ch : word.toCharArray()) {
				if (alArr[ch-'a'] == 0){
					len--;
					break;
				}
			}
		}
		return len;  
	    }	
	  @Test
		public void test() {
			Assert.assertEquals(2, countConsistentStrings("ba",new String[] {"baaba","abba","dab"}));
		}
		@Test
		public void test1() {
			Assert.assertEquals(5, countConsistentStrings("bac",new String[] {"a","b","c","cab","abc"}));
		}
		@Test
		public void test2() {
			Assert.assertEquals(0, countConsistentStrings("a",new String[] {"d","o","b"}));
		}
		

}
