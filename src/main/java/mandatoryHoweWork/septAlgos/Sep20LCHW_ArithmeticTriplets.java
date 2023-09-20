package mandatoryHoweWork.septAlgos;
import org.junit.Test;
import org.testng.Assert;

public class Sep20LCHW_ArithmeticTriplets {


	//ip: int[], int
	//op: int
	//Logic : init count
	//1. Run three for loops (nested) with the successive for loop index > previous one by 1
	// if nums[j] - nums[i] == diff && nums[k] - nums[j] == diff true, inc count by 1
	// return count

	//Time complexity - O[N3]

	public int arithmeticTriplets(int[] nums, int diff) {
		int count=0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				for(int k = j + 1; k < nums.length; k++) {
					if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
						count++;
					}
				}
			}
		}
		return count;
	}


	@Test
	public void test1() {

		Assert.assertEquals(2, arithmeticTriplets(new int[] {0,1,4,6,7,10},3));
	}

	@Test
	public void test2() {
		Assert.assertEquals(2, arithmeticTriplets(new int[] {4,5,6,7,8,9},2));
	}

}
