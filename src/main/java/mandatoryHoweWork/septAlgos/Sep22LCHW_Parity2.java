package mandatoryHoweWork.septAlgos;

import org.junit.Test;
import org.testng.Assert;

public class Sep22LCHW_Parity2 {
	//ip : int[]
	//op : int[]
	//Logic
	//1. Init pointer i=0; k=nums.length-1
	//2. Run a for loop for all elements, if the element and index is even, assign the element to nums[j] and inc j by 2
	//3. else if, the num is odd & i+1<num.length, swap i and i+1
	//return nums

	//Time complexity - O[N]

	public int[] sortArrayByParity(int[] nums) {
		int j=0;
		int k=nums.length-1;
		for(int i=0;i<nums.length;i++){
			if(nums[i]%2==0&&i%2==0){
				nums[j]=nums[i];
				j=j+2;
			}
			else if (i+1<nums.length&&i%2!=0 ||i+1<nums.length&&nums[i]%2!=0 ){
				int temp=nums[i];
				nums[i]=nums[i+1];
				nums[i+1]=temp;
			}
		}
		return nums;
	}

	@Test
	public void test1() {
		Assert.assertEquals(new int[] {4,1,2,3}, sortArrayByParity(new int[] {4,2,1,3}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(new int[] {0,1}, sortArrayByParity(new int[] {0,1}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(new int[] {4,5,2,7}, sortArrayByParity(new int[] {4,2,5,7}));
	}
}
