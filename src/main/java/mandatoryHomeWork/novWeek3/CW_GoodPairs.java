package mandatoryHomeWork.novWeek3;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class CW_GoodPairs {
	//ip: int[]; op: int
	//Logic : init count
	// Loop thru all elements using two for loops with inner for loop starting from next index of first for loop
	// when the nums[i]==nums[j] inc count
	//return count
	//TC:O[N2], SC:O[k]
	 public int numIdenticalPairs(int[] nums) {
         int count=0;
     for(int i=0;i<nums.length;i++){
         for(int j=i+1;j<nums.length;j++){
                 if(nums[i]==nums[j]){
                     count++;
                 }
         }
     }
     return count;
 }
	 //using hashMap
	 //Logic init count & hm <int,int>
	 //Loop thru the int[] and if the hm cotains the arr ele as key, add the val of key to count & inc the freq
	 // else add the freq to the map
	 //return count
	 //TC & SC :O[N]
	 public int numIdenticalPairs1(int[] nums) {
	        int count = 0;
	        HashMap<Integer, Integer> hm = new HashMap<>();
	        for (int num : nums) {
	            if (hm.containsKey(num)) {
	                count += hm.get(num);
	                hm.put(num, hm.get(num) + 1);
	            } else {
	                hm.put(num, 1);
	            }
	        }
	        return count;
	    }
	 @Test
	 public void test()
	 {
		Assert.assertEquals(4, numIdenticalPairs1( new int[]{1,2,3,1,1,3}));
	 }
	 @Test
	 public void test1()
	 {
		 Assert.assertEquals(0, numIdenticalPairs1( new int[]{ 1,2,3,4,5,6}));
	 }
	 @Test
	 public void test3()
	 {
		 Assert.assertEquals(6, numIdenticalPairs1( new int[]{2,2,2,2}));
	 }
}
