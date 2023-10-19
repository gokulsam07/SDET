package mandatoryHomeWork.octWeek3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CWOct19_FindMissed {

	// ip: int[];op List<Int>
	// Logic : Init ArrayList and HashSet
	// 1. Iterate all the int[] nums & add to HashSet
	// 2. Run a for loop from 1 to n add what ever is missed add to al
	// return al
	// TC & SC :O[N]
	public List<Integer> findDisappearedNumbers1(int[] nums) {
		List<Integer> al = new ArrayList<>();
		HashSet<Integer> ts = new HashSet<>();
		for (Integer i : nums) {
			ts.add(i);
		}
		for (int i = 1; i <= nums.length; i++) {
			if (ts.add(i))al.add(i);
		}
		return al;
	}
	// ip: int[];op List<Int>
	// Logic : Init ArrayList and HashMap
	//add nums[] val to hashMap with freq
	// Run a for loop from 1 to n, check if the hashMap has the key of i, if not add the i to al
	//return al;
	//TC & SC :O[N]
	public List<Integer> findDisappearedNumbers(int[] nums) {
	    List<Integer> al = new ArrayList<>();
	    HashMap<Integer, Integer> hm = new HashMap<>();
	    for (int num : nums) {
	        hm.put(num, hm.getOrDefault(num, 0) + 1);
	    }
	    for (int i = 1; i <= nums.length; i++) {
	        if (!hm.containsKey(i)) {
	            al.add(i);
	        }
	    }
	    return al;
	}

	@Test
	public void test() {
		Assert.assertEquals(Arrays.asList(1, 2), findDisappearedNumbers(new int[] { 3, 3, 3, 4, 5, 6 }));
	}

	@Test
	public void test1() {
		Assert.assertEquals(Arrays.asList(), findDisappearedNumbers(new int[] { 1, 2, 3, 4, 5 }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(Arrays.asList(8), findDisappearedNumbers(new int[] { 1, 2, 3, 4, 4, 5, 6, 7 }));
	}

}
