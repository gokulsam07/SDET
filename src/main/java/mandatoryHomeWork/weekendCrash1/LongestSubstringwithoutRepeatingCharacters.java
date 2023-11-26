package mandatoryHomeWork.weekendCrash1;

import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class LongestSubstringwithoutRepeatingCharacters {
	//ip: String
	//op: int
	//Logic -- init two pointers, hm<char,int> & result =1
	//1. Loop thru till last element using right pointer
	//Whenever there's a duplicate key & the value of current key is >= left index, move left index to next idx of first occurance of duplicate
	//2. put char & its index in hm 
	//3. find the max of result and right-left+1 to find the max len
	//return len
	
	@Test
	public void longSSTest() {
		Assert.assertEquals(3, lenOfLongSS("abcabcbb"));
	}
	@Test
	public void longSSTest1() {
		Assert.assertEquals(8, lenOfLongSS("abaxytucutrbevy"));
	}
	@Test
	public void longSSTest2() {
		Assert.assertEquals(1, lenOfLongSS("aaaaaaa"));
	}
	
	public int lenOfLongSS(String s) {
		int left=0,right=0,result=0;
		HashMap<Character,Integer> hm = new HashMap<>();
		while(right<s.length()) {
			if(hm.containsKey(s.charAt(right))&& hm.get(s.charAt(right))>=left) {
				left=hm.get(s.charAt(right))+1;
			}
			hm.put(s.charAt(right), right);//abcabcbb
			result=Math.max(result, right-left+1);
			right++;
		}
		return result;
	}

}
