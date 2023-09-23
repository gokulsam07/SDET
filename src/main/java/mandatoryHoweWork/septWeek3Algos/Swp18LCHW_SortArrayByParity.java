package mandatoryHoweWork.septWeek3Algos;

import org.junit.Test;
import org.testng.Assert;

public class Swp18LCHW_SortArrayByParity {
	//ip : int[]
	//op : int[]
	//Logic
	//1. Init pointer i=0; k=nums.length-1
	//2. Run a for loop for all elements, if the element is div by 2, assign the element to op[j++]
	//3. else assign it to op[k--]
	//return op

	//Time complexity - O[N]

	public int[] sortArrayByParity(int[] nums) {
		int[] op = new int[nums.length];
		int j=0;
		int k=nums.length-1;
		for(int i=0;i<nums.length;i++){
			if(nums[i]%2==0){
				op[j++]=nums[i];
			}
			else{
				op[k--]=nums[i];
			}
		}
		return op;
	}

	@Test
	public void test1() {
		Assert.assertEquals(new int[] {4,2,0,1}, sortArrayByParity(new int[] {4,2,1,0}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(new int[] {6,5,3,1}, sortArrayByParity(new int[] {1,3,5,6}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(new int[] {0,2,4,6}, sortArrayByParity(new int[] {0,2,4,6}));
	}
}
