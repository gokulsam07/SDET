package mandatoryHomeWork.novWeek1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LCHWNov3_AllAnagram {
	
	//ip: String, String
	//op: List<Integer>
	//Logic -> Init - ArrayList<Integer>
	//1. If string len is gte of s string, return list directly 
	//2. Init two char[]  to store char value of s and p
	//3. Run a for loop till last element of p and store the frequency in sChar & pCha
		//If the arrays are equal add the index 0 to list
	//4. Start one more for loop from the len of p till last index of s and increment the frequency of the sChar at next index and reduce the frequency of pChar at first index
		// if the arrays are eqaul add the index to list
	//return list
	
	 public List<Integer> findAnagrams(String s, String p) {
		    List<Integer> al =new ArrayList<>();
		    if(s.length()<p.length()) return al;
		    int[] sArr = new int[26];
		    int[] pArr =new int[26];
		    int i=0;
		    while(i<p.length()){
		        sArr[s.charAt(i)-'a']++;
		        pArr[p.charAt(i)-'a']++;
		        i++;
		    }
		    if(Arrays.equals(sArr,pArr))al.add(i-p.length());
		    for(i=p.length();i<s.length();i++){
		        sArr[s.charAt(i-p.length())-'a']--;
		        sArr[s.charAt(i)-'a']++;
		         if(Arrays.equals(sArr,pArr))al.add(i-p.length()+1);
		    }
		    return al;
		    }
	 
	 @Test
		public void test1() {
			Assert.assertEquals(Arrays.asList(0,1,2,3), findAnagrams("abcabc", "abc"));
		}

		@Test
		public void test2() {
			Assert.assertEquals(Arrays.asList(), findAnagrams("abc", "abcabc"));
		}

		@Test
		public void test3() {
			Assert.assertEquals(Arrays.asList(4), findAnagrams("roosevelt", "eve"));
		}
		
		@Test
		public void test4() {
			Assert.assertEquals(Arrays.asList(6), findAnagrams("xanthippe", "pep"));
		}

}
