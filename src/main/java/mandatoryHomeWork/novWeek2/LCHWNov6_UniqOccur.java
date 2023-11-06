package mandatoryHomeWork.novWeek2;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class LCHWNov6_UniqOccur {
	//ip: int[]; op: bool
	//Logic init HashMap and HashSet
	//1. Add freq to hashmap
	//2. pass valuesof hm to hs and if any duplictae return false
	//all other return true
	//TC & SC :O[N]
	
	 public boolean isUnique(int[] arr) {
	        HashMap<Integer,Integer> hm = new HashMap<>();
	        HashSet<Integer> dup = new HashSet<>();
	        for(int num:arr){
	            hm.put(num,hm.getOrDefault(num,0)+1);
	        }
	    for(Integer i:hm.values()){
	        if(!dup.add(i)) return false;
	    }
	        return true;
	    }
	 
	 @Test
		public void tst1() {
			Assert.assertEquals(true, isUnique(new int[] {1,2,2,1,1,3}));
		}

		@Test
		public void tst2() {
			Assert.assertEquals(false, isUnique(new int[] {1,2}));
		}

		@Test
		public void tst3() {
			Assert.assertEquals(true, isUnique(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
		}

		@Test
		public void tst4() {
			Assert.assertEquals(false, isUnique(new int[] {3,5,-2,-3,-6,-6}));
		}

}
