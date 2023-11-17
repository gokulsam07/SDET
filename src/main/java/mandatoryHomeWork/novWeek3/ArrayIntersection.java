package mandatoryHomeWork.novWeek3;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class ArrayIntersection {
//ip: int[], int[]
	//op: int[]
	//Logic: init hm of <int,int> & al of <int>
	//1. Store freq of all nums1 in hm
	//2. Iteratre all ele in nums2
	//3. Check if the value is present in hm & the freq is > 0
	//4. reduce the freq and add to al
	// add the elements to res arr
	//TC & SC:O[N]
	 public int[] intersect(int[] nums1, int[] nums2) {
	        HashMap<Integer, Integer> hm = new HashMap<>();
	        ArrayList<Integer> al = new ArrayList<>();
	        for(int i : nums1){
	            hm.put(i, hm.getOrDefault(i, 0)+1);
	        }
	        for(int i : nums2){
	            if(hm.get(i) != null && hm.get(i) > 0){
	                hm.put(i, hm.get(i)-1);
	                al.add(i);
	            }
	        }
	        int[] arr = new int[al.size()]; 
	        for(int i = 0; i < al.size();i++){
	            arr[i] = al.get(i);
	        }
	        return arr;
	    }
	 
	 @Test
	 public void test()
	 {
		Assert.assertArrayEquals(new int[] {2,2}, intersect( new int[]{1,2,2,1},new int[]{2,2,2}));
	 }
	 @Test
	 public void test1()
	 {
		 Assert.assertArrayEquals(new int[] {1,3,2}, intersect( new int[]{1,2,3,5},new int[]{1,4,3,2}));
	 }
	 @Test
	 public void test3()
	 {
		 Assert.assertArrayEquals(new int[] {10,7,9}, intersect( new int[]{6,8,7,9,10},new int[]{10,7,9}));
	 }
}
