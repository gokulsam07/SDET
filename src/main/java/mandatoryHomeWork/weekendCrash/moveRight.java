package mandatoryHomeWork.weekendCrash;

import org.junit.Assert;
import org.junit.Test;

public class moveRight {
	//ip: & op :int[]
	//Logic
	//1. Init i=0;
	//2. iterate all elements using for each, if the num is non zero assign to nums in index i
	//3. inc i by 1
	//4. use another for loop starting from the index i till last element & assign zero to it
	//return num
	//SC -O(n) & TC:O(n)
	
	@Test
	public void testMoveToRight() {
		Assert.assertArrayEquals(new int[] {-3,1,2,0,0,0}, moveZero(new int[] {0,-3,1,0,2,0}));
	}
	
	@Test
	public void testMoveToRight1() {
		Assert.assertArrayEquals(new int[] {0,0,0}, moveZero(new int[] {0,0,0}));
	}
	@Test
	public void testMoveToRight2() {
		Assert.assertArrayEquals(new int[] {1,4,3}, moveZero(new int[] {1,4,3}));
	}
	
	public int[] move(int[] nums) {
		 int i=0;
	        for(int num: nums){
	            if(num!=0){
	                nums[i]=num;
	                i++;
	            }
	        }
	        for( i=i;i<nums.length;i++){
	            nums[i]=0;
	        }
	        return nums;
	}
	
	public int[] moveZero(int[] num) {
		int j=0;
		for (int i = 0; i < num.length; i++) {//0,-3,1,0,2,0
			if(num[i]!=0) {
				num[j]=num[i];
				if (j != i) {
					num[i] = 0; 
				}
				j++;
			}
		}
		return num;
	}

}
