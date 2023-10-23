package mandatoryHomeWork.octWeek4;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct23_EggAndFloor {
	
	//ip & op : int
	//logic : init count =0, x=1;
	//run while loop till n gte 0
	// inc count by 1
	// sub x from n & set to n
	// inc x by 1
	// return count
	// SC : O[k]; TC : O[N]
	 public int twoEggDrop(int n) {
	        int count=0;
	        int x=1;
	        while(n>0)
	        {
	            count++;
	            n=n-x;
	            x++;
	        }
	        return count;
	    }
	 
	 @Test
	 public void test()
	 {
		Assert.assertEquals(2, twoEggDrop(2));
	 }
	 @Test
	 public void test1()
	 {
		 Assert.assertEquals(14, twoEggDrop(100));
	 }
	 @Test
	 public void test3()
	 {
		 Assert.assertEquals(1, twoEggDrop(1));
	 }
}
