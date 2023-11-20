package mandatoryHomeWork.weekendCrash;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SquareArray {
	
	//ip & op: nums[]
	//Logic -- init res int[] of same size of nums[]
	//1. Iterate thru the elements and multiply the ele by itself and assign back to same index
	// 2. Sort the array
	//return res
	//TC : O(N log N); SC: O(1)
	
	@Test
	public void sqrTest() {
		Assert.assertArrayEquals(new int[] {0,1,9,16,100}, sqr(new int[] {-4,-1,0,3,10}));
	}
	@Test
	public void sqrTest1() {
		Assert.assertArrayEquals(new int[] {4,9,9,49,121}, sqr(new int[] {-7,-3,2,3,11}));
	}
	public int[] sqr1(int[] nums) {
		//int[] res = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[i]*nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
	//Optimized
	
	//ip & op: int[]
	//logic -- init two pointers, res idx tracker
	//1. Run loop till left<=right
	//2. if the abs of left idx ele is > abs right e=idx ele -> square left idx ele and put in res & reduce idx tracker by 1
	//3. inc left by 1
	//4. else sqr ele in right idx and put in res & dec right idx by 1
	//return res
	//TC & SC: O(n)
	public int[] sqr(int[] nums) {
		int[] res = new int[nums.length];
		int left=0,right=nums.length-1,count=nums.length-1;
		while(left<=right) {
			if(Math.abs(nums[left])>Math.abs(nums[right])) {
				res[count--]=nums[left]*nums[left];
				left++;
			}
			else {
				res[count--]=nums[right]*nums[right];
				right--;
			}
		}
		return res;
	}
}
