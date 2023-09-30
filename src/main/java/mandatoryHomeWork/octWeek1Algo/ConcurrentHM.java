package mandatoryHomeWork.octWeek1Algo;

import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;
import org.testng.Assert;

public class ConcurrentHM {

	public boolean isAnagram(String s, String t) {
		//ip: String, String
		//op: boolean
		//Logic init HM <C,I>
		//1. If len of both str <> return false
		//2. Run a for loop till last element, take char for s & t
		//3. if the char is not available already add to existing else add 1 --> for char in s 
		//4. Check if the char in t is already available in map, if yes sub -1
		//check if all the values in map equals zero using stream
		//TC: O[N] SC: O[N[
		ConcurrentHashMap<Character, Integer> cMap = new ConcurrentHashMap<Character, Integer>();
		if(t.length()!=s.length())return false;
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			cMap.put(c1, cMap.getOrDefault(c1, 0) + 1);
			cMap.put(c2, cMap.getOrDefault(c2, 0) - 1);
		}
		return cMap.values().stream().allMatch(count->count==0);
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
