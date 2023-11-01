package mandatoryHomeWork.novWeek1;

import org.junit.Assert;
import org.junit.Test;

public class Oct31LCHW_MoveZeros {
	//ip&op : int[]
	//Logic: 
	//1. Init i=0; Run the elements in the nums[] using for loop, if the num is non zero, set to nums starting from 0 and inc i by 1 
	//2. Run another loop to set the last elements as zero till length of nums[]
	//return nums[]
	//TC :O[N]; SC:O[K]
	public int[] moveZero(int[] nums) {
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
	
	@Test
	public void test1() {
		Assert.assertEquals(new int[] {1,3,12,0,0}, moveZero(new int[] {0,1,0,3,12}));
	}
	@Test
	public void test2() {
		Assert.assertEquals(new int[] {3,12,0,0}, moveZero(new int[] {0,0,3,12}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(new int[] {1,2,3,4,0,0,0}, moveZero(new int[] {1,0,2,0,3,0,4}));
	}

	@Test
	public void test4() {
		Assert.assertEquals(new int[] {-1,2,-3,4,0,0,0}, moveZero(new int[] {-1,0,2,0,-3,0,4}));
	}
	@Test
	public void test5() {
		Assert.assertEquals(new int[] {-1,2,-3,4,0}, moveZero(new int[] {-1,2,-3,0,4}));
	}
}
