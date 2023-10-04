package mandatoryHomeWork.octWeek1Algo;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct5UniqueOccurAdd {
	//ip: int[]
	//op: int
	//Logic : init HM, int result=0;
	//1. Run through all elements in int[] and find frequency using HM
	//2.Iterate the map, whenever the freq is 1, get the key and add to result
	// return result
	//TC: O[N]; SC:O[N]
	public int sumOfUnique(int[] nums) {
		Map<Integer,Integer> s = new HashMap<>();
		int result=0;
		for(int i=0;i<nums.length;i++){
			s.put(nums[i], s.getOrDefault(nums[i],0)+1);
		}

		for(Map.Entry<Integer,Integer> entry :s.entrySet()){
			if(entry.getValue()==1){
				result+=entry.getKey();
			}
		}
		return result;
	}

	
	
	@Test
	public void test1() {
		Assert.assertEquals(10, sumOfUnique(new int[] {0,1,2,3,4}));
	}
	@Test
	public void test2() {
		Assert.assertEquals(0, sumOfUnique(new int[] {0,1,1,1,2,2}));
	}

}
