package mandatoryHomeWork.weekendCrash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ArrayDifference {
	
	//ip: int[]. int[]
	//op: List<List<int>>
	//Logic -- init two hashset and two arraylist and one resultant array
	//1. Add nums1 to hs1, nums2 to hs2
	//2. Iterate hs1 and check if elements which aren't present in hs2, add to al1
	//3. vice versa for hs2 & al2
	//4. Add the al1 & al2 to result
	//return result
	//TC&SC :O(n)
	
	@Test
	public void differenceTest() {
		Assert.assertEquals(Arrays.asList(Arrays.asList(1,3),Arrays.asList(4,6)), findDifference(new int[] {1,2,3}, new int[] {2,4,6}));
	}
	@Test
	public void differenceTest1() {
		Assert.assertEquals(Arrays.asList(Arrays.asList(3),Arrays.asList()), findDifference(new int[] {1,2,3,3}, new int[] {1,1,2,2}));
	}
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        for(int num:nums1){
            hs1.add(num);
        }
        for(int num:nums2){
            hs2.add(num);
        }
        for(int hs:hs1){
            if(!hs2.contains(hs)){
                al1.add(hs);
            }
        }
        for(int hs:hs2){
            if(!hs1.contains(hs)){
                al2.add(hs);
            }
        }
        result.add(al1);
        result.add(al2);
        return result;
    }

}
