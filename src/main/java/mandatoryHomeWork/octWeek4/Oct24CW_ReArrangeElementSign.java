package mandatoryHomeWork.octWeek4;

import org.junit.Test;
import org.testng.Assert;

public class Oct24CW_ReArrangeElementSign {
	//ip  & op: int[]
	//Logic get size, init two int[] for pos & neg
	//1. Iterate all elements in nums,if >0 put in pos else in neg
	//2. Keep a pointer j=0; run a for loop till size from 0, add elements 
	//respective pos and neg to nums
	//return nums
	///TC & SC :O[N]
	public int[] rearrangeArray(int[] nums) {
        int size = nums.length/2;
        int[] pos =new int[size];
        int[] neg =new int[size];
        int i=0; int j=0;
        for(int num:nums){
            if(num>0){ pos[i]=num;   i++;}
         
            else{ neg[j]=num; j++;}
            
        }
         j=0;
        for(i=0;i<size;i++){
            nums[j]=pos[i];
            j++;
            nums[j]=neg[i];
            j++;
        }
        return nums;
    }
	
	
	 @Test
	 public void test()
	 {
		Assert.assertEquals(new int[] {5,-1,4,-5,6,-9}, rearrangeArray( new int[]{-1,5,4,-5,6,-9}));
	 }
	 @Test
	 public void test1()
	 {
		 Assert.assertEquals(new int[] {121,-100}, rearrangeArray( new int[]{-100,121}));
	 }
	 @Test
	 public void test3()
	 {
		 Assert.assertEquals(new int[] {6027,-7000,286,-2,282,-8}, rearrangeArray(new int[]{-7000,6027,-2,286,282,-8}));
	 }
}
