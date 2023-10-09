package mandatoryHomeWork.octWeek2.LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;
import org.testng.Assert;

public class Oct9CW_Tallest {

	//ip: string, int
	//op: String[]
	//Logic : init TreeMap with Int and name as K,V
	// add in the TreeMap, return the values as String[] by adding values from last to first in array
	//TC : O[N] : SC: O[N]


	public String[] sortPeople1(String[] names, int[] heights) {

		Map<Integer, String> tm = new TreeMap<>();
		String[] result = new String[names.length];

		for(int i=0;i<heights.length;i++) {
			tm.put(heights[i], names[i]);
		}
		int i=names.length-1;
		for (Map.Entry<Integer, String> entry : tm.entrySet()) {
			result[i--] = entry.getValue();

		}
		return result;

	}
	
	//brute force
	public String[] sortPeople(String[] names, int[] heights) {

		int n = names.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = i+1; j < n; j++) {
	            if (heights[j] > heights[i]) {
	                int tempHeight = heights[j];
	                heights[j] = heights[i];
	                heights[i] = tempHeight;
	                
	                String tempName = names[j];
	                names[j] = names[i];
	                names[i] = tempName;
	            }
	        }
	    }

	    return names;

	}

	@Test
	public void test1() {
		Assert.assertEquals(new String[] {"Gokul","Vignesh","Praga"}, sortPeople(new String[] {"Gokul","Vignesh","Praga"},new int[] {178,170,168}));
	}
	@Test
	public void test2() {
		Assert.assertEquals(new String[] {"Raji","Poorani","Nazreen"}, sortPeople(new String[] {"Raji","Nazreen","Poorani"},new int[] {178,170,172}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(new String[] {"Gokul"}, sortPeople(new String[] {"Gokul"},new int[] {178}));
	}

	@Test
	public void test4() {
		Assert.assertEquals(new String[] {"Gokul","Govind","Edison"}, sortPeople(new String[] {"Govind","Edison","Gokul"},new int[] {174,164,178}));
	}


}
