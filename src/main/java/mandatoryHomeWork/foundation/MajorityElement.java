package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;



public class MajorityElement {

	/*
	 * input: array of numbers of size n 
	 * output: majority element satisfying (size of array)/2
	 * Logic: Iterate the array to map the elements occurrences in the value of the key. if they key is non existent create it with value 1
	 * if already present increase by 1
	 * Iterate the map to compare the  value in map to be greater than size of array /2
	 * return the key of the value which satisfies the condition
	 */ 


	//Logic1
	public int maxEle(int[] num) {

		Map<Integer,Integer> map = new HashMap<>();
		for (int i : num) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if(entry.getValue()>(num.length/2)) {
				return entry.getKey();
			}

		}
		return 0;
	}


	@Test
	public void test1() {
		Assert.assertEquals(2, maxEle(new int[] {2,2,1,1,1,2,2}));
	}
	@Test
	public void test2() {
		Assert.assertEquals(3, maxEle(new int[] {3,2,3}));
	}

}
