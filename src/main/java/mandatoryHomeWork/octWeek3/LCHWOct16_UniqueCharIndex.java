package mandatoryHomeWork.octWeek3;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

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
	//ip : String, op: int
		//Logic Init HM of char , int
		//Iterate all elements and add to queue and inc the freq of char
		// Run a while loop to remove head until the char becomes unique using freq
		// if dq empty -1, else take the head & find index of head
		//SC:O[N]; TC: O[N]
	
	
	public int firstUniqChar(String s) {
        int freq[] = new int[26];
       Queue<Character> dq = new ArrayDeque<>();
       for(int i=0;i<s.length();i++){
           char ch =s.charAt(i);
           freq[ch-'a']++;
           dq.offer(ch);
          while (!dq.isEmpty()&&freq[dq.peek()-'a']>1){
               dq.poll();
           }
       }
      return (dq.isEmpty())? -1:s.indexOf(dq.poll());
   }
	@Test
	public void test() {
		Assert.assertEquals(0, firstUniqChar("baaapu"));
	}
	@Test
	public void test1() {
		Assert.assertEquals(4, firstUniqChar("aappkiimaan"));
	}
	@Test
	public void test2() {
		Assert.assertEquals(-1, firstUniqChar("dimmid"));
	}
	@Test
	public void test3() {
		Assert.assertEquals(0, firstUniqChar("dimwit"));
	}

}
