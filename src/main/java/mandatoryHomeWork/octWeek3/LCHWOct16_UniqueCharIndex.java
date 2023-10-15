package mandatoryHomeWork.octWeek3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class LCHWOct16_UniqueCharIndex {


	//ip : String, op: int
	//Logic : Convert to char arr & iterate all 
	// If the index and last index of a char is equal, it means,  no rep
	// if the above satisfied, return that index
	// return -1
	//SC:O[k]; TC: O[N2]
	
	//Method 1 
	public int firstUniqChar1(String s) {
		for(char ch : s.toCharArray()){
			if(s.indexOf(ch)==s.lastIndexOf(ch)) return s.indexOf(ch);
		}
		return -1;
	}

	//Method2
	
	//ip : String, op: int
	//Logic Init HM of char , int
	//Iterate all elements and add to hm
	// Iterate the HM, when the value equals 1, get its corresponding key, and store in a char var
	// if the char var is != ' ', return the index of c, else -1
	//SC:O[N]; TC: O[N]
	public int firstUniqChar2(String s) {
	      Map<Character,Integer> hm = new LinkedHashMap<>();
			for(int i=0;i<s.length();i++) {
				hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
			}
			char c=' ';
			for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
				if(entry.getValue()==1){
	                c = entry.getKey();
	                break;
	            } 
			}
			return (c!=' ')?s.indexOf(c):-1;
	    }
	
	
//https://leetcode.com/problems/first-unique-character-in-a-string/solutions/3926582/java-sol-n-using-1-queue/
	@Test
	public void test() {
		Assert.assertEquals(0, firstUniqChar2("baaapu"));
	}
	@Test
	public void test1() {
		Assert.assertEquals(4, firstUniqChar2("aappkiimaan"));
	}
	@Test
	public void test2() {
		Assert.assertEquals(-1, firstUniqChar2("dimmid"));
	}
	@Test
	public void test3() {
		Assert.assertEquals(0, firstUniqChar2("dimwit"));
	}

}
