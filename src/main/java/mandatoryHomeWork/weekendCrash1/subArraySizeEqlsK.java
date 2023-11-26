package mandatoryHomeWork.weekendCrash1;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class subArraySizeEqlsK {

	@Test
	public void test() {
		Assert.assertEquals(3, subarraySum(new int[] { 1, 1, 1 }, 1));
	}

	@Test
	public void test1() {
		Assert.assertEquals(4, subarraySum(new int[] { 0, 4, -1, 3, 0 }, 3));
	}
//this wont work
	public int subarraySum1(int[] nums, int k) {
		int left=0,right=0,result=0,sum=nums[0];
		while(left<nums.length&&right<nums.length) {
			if(sum==k) {
				result++;
				left++;right++;
			}
			else if(sum<k) {
				right++;
				sum+=nums[right];
			}
			else {
				left++;
			}
		}
		return result;
	}
	
	 public int subarraySum(int[] nums, int k) {
	        int sum = 0, result = 0;
	        HashMap<Integer,Integer> hp = new HashMap<>();
	        hp.put(0, 1);
	        
	        for (int i = 0; i < nums.length; i++) {
	            sum += nums[i];
	            if (hp.containsKey(sum - k)) {
	                result += hp.get(sum - k);
	            }
	            hp.put(sum, hp.getOrDefault(sum, 0) + 1);
	        }
	        return result;
	    }

}
