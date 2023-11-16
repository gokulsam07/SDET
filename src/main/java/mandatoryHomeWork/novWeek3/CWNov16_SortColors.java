package mandatoryHomeWork.novWeek3;

import org.junit.Assert;
import org.junit.Test;

public class CWNov16_SortColors {
	
	//ip & op: int[]
	//Logic : init three var for red, white and blue
	// 1. Loop thru all the elements and find the count of each color
	//2, Using for loops and the same nums[] fill the array with values specific to colors by iterating till the color's length
	// for successive colors, add the previous color's length
	//TC:O[N]; SC:O[k]
	
	public int[] sortColors(int[] nums) {
	     int red=0;
	     int white=0;
	     int blue=0;
	     for(int i=0;i<nums.length;i++){
	         if(nums[i]==0)red++;
	         else if(nums[i]==1)white++;
	         else blue++;
	     }
	     int i=0;
	     for(i=0;i<red;i++){
	         nums[i]=0;
	     }
	     for(i=i;i<red+white;i++){
	         nums[i]=1;
	     }
	     for(i=i;i<red+white+blue;i++){
	         nums[i]=2;
	     }
	     return nums;

	    }
	

	 @Test
	 public void test()
	 {
		Assert.assertArrayEquals(new int[]{0,0,1,1,1}, sortColors( new int[]{0,1,0,1,1}));
	 }
	 @Test
	 public void test1()
	 {
		 Assert.assertArrayEquals(new int[]{0,0,1,1,1,2,2}, sortColors( new int[]{ 2,1,0,2,1,0,1}));
	 }
	 @Test
	 public void test3()
	 {
		 Assert.assertArrayEquals(new int[]{2,2,2,2}, sortColors( new int[]{2,2,2,2}));
	 }
	 
	 public void test4()
	 {
		 Assert.assertArrayEquals(new int[]{0,0,1,1,1}, sortColors( new int[]{0,1,2,0,0,1}));
	 }

}
