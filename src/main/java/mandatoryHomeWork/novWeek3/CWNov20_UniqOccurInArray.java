package mandatoryHomeWork.novWeek3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class CWNov20_UniqOccurInArray {
	
	/* DP WORLD QUESTION
	 * Given an array of integers arr, return true if the number of occurrences of
	 * each value in the array is unique or false otherwise. Input: arr =
	 * [1,2,2,1,1,3] Output: true
	 */
	
	//ip: int[], op: bool
	//Logic- init hm and hs
	//1. Add freq to hs 
	//2. Iterate map and add freq to hs, if freq repeats, return false
	// return true
	//TC & SC :O(n)
	
	@Test
	public void uniqTest() {
		Assert.assertEquals(true, checkUniq(new int[] {1,2,2,1,1,3}));
		}
	@Test
	public void uniqTest1() {
		Assert.assertEquals(true, checkUniq(new int[] {-3,-3,-3,-3,1,2,2,1,1,3}));
		}
	@Test
	public void uniqTest2() {
		Assert.assertEquals(false, checkUniq(new int[] {-3,-3,-3,1,2,2,1,1,3}));
		}
	@Test
	public void uniqTest3() {
		Assert.assertEquals(false, checkUniq(new int[] {1,2,2,2,-3}));
		}
	
	public boolean checkUniq(int[] nums) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		HashSet <Integer> hs = new HashSet<>();
		for(int num: nums) {
			hm.put(num, hm.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
			if(!hs.add(entry.getValue())) return false;
		}
		return true;
	}

}
