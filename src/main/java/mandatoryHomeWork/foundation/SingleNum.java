package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class SingleNum {
	
//	Input : non zero array of elements
//	Output : Non recurring element
//	Logic: 
//		Initialize a map for Integer, Integer KV pair
//		Iterate the array in for each 
//		if the map contains the value in array increment the count 
//		else set count to 1
//		Iterate the map to find if any of the map value has value 1 in it (non repeated) & return it

	public int singleNum(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i,1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}

		}
		return 0;

	}


	@Test
	public void tst1() {
		Assert.assertEquals(1, singleNum(new int[] {2,2,1}));
	}
	@Test
	public void tst2() {
		Assert.assertEquals(4, singleNum(new int[] {4,1,2,1,2}));
	}
	@Test
	public void tst3() {
		Assert.assertEquals(1, singleNum(new int[] {1}));
	}
}
