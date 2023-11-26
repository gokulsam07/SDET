package mandatoryHomeWork.weekendCrash1;

import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class MinWindowSubstring {
	//ip: String, String
	//op:String
	//Logic -- init two pointers at 0, result String="", hm for string t & one more hm2 for checking window<char,int>
	
	//1. add the freq of string t to hm
	//take tarLen using t.len & set curLen as 0
	//2. Iterate all elements in string s using while (inc right by1 by end of while)
	//3. put right idx char to hm2 and check if the hm contains it and the value is equal in both 
	//4. if yes, inc currLen by1 
	//5. while currLen == tarLen, take the window size by right-left+1 and add the subString to result whenever result is empty or it's len < result.length()
	//6. reduce the freq of left idx char in hm2 and check if the value is present in hm and if yes check if both's value are equal, if yes, reduce currLen by 1 and increment the left pointer
	
//return result
	//TC:O(n); SC: O(n)
	@Test
	public void ssTest() {
		Assert.assertEquals("BANC", checkMinWindow("ADOBECODEBANC", "ABC"));
	}

	public String checkMinWindow(String s, String t) {
		int left=0,right=0;
		String result="";
		HashMap<Character,Integer> hm=new HashMap<>();
		for (char ch:t.toCharArray()) {
			hm.put(ch,hm.getOrDefault(ch,0)+1);
		}
		int resLen = t.length();
		int currLen = 0;
		HashMap<Character,Integer> hm2=new HashMap<>();
		while (right<s.length()) {
			char currCh = s.charAt(right);
			hm2.put(currCh,hm2.getOrDefault(currCh,0)+1);
			if (hm.containsKey(currCh)&&hm2.get(currCh).equals(hm.get(currCh))) {
				currLen++;
			}
			while(currLen==resLen){
				int windowSize =right-left+1;
				if (result.equals("")||windowSize<result.length()) {
					result =s.substring(left,right+1);
				}
				char lpChar=s.charAt(left);
				hm2.put(lpChar,hm2.get(lpChar)-1);
				if (hm.containsKey(lpChar)&&hm2.get(lpChar)<hm.get(lpChar)){
					currLen--;
				}
				left++;
			}
			right++;
		}
		return result;
	}
}
