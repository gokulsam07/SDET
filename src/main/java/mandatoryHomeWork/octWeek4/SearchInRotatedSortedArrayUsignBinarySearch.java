package mandatoryHomeWork.octWeek4;
import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedSortedArrayUsignBinarySearch {
	//ip: int[], int
	//op int
	//Logic init left 0, right len-1 of int[]
	//1. Run while loop till left<=right
		//find mid by left+right/2
		// if mid has target value in nums[], return mid
	//2. if left index val is lte mid index value
		// check left index value is lte target and target lt mid of nums --> shift right to mid-1
		//else shift left to mid +1
	//3. All other cases, check if target lte nums of right and nums of mid lt target --> shift left to mid+1
	//else shift right to mid-1
	
	//return -1
	//TC : O[N]; SC:O[k]
	public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
	
	@Test
	public void test() {
		Assert.assertEquals(4, search(new int[] {4,5,6,7,0,1,2},0));
	}

	@Test
	public void test1() {
		Assert.assertEquals(-1, search(new int[] { 4,5,6,7,0,1,2 },3));
	}

	@Test
	public void test2() {
		Assert.assertEquals(-1, search(new int[] { 1, },0));
	}
}
