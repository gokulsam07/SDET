package mandatoryHomeWork.postfoundationDailyHW;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Sep11LCHW_HeightChecker {
	
	//input: int[]
	//Output: int
	//Logic
	//1. Save all the elements in heights to sec using a for loop
	//2. Sort the heights array
	//3. In a for loop, check where the elements in heights and sec are not equal and increment counter
	//return counter
	
	//Time complexity --O[n log n]
	
	  public int heightChecker(int[] heights) {
	        int[] sec = new int[heights.length];
	        for(int i=0;i<sec.length;i++){
	            sec[i]=heights[i];
	        }
	        Arrays.sort(heights);
	        int count =0;
	        for(int i=0;i<heights.length;i++){
	            if(sec[i]!=heights[i]) count++;
	        }
	        return count;
	    }
	  
	  @Test
		public void test1() {
			Assert.assertEquals(3, heightChecker(new int[] {5,2,3,1,4}));
		}
	  
		@Test
		public void test2() {
			Assert.assertEquals(3, heightChecker(new int[] {1,1,4,2,1,3}));
		}

		@Test
		public void test3() {
			Assert.assertEquals(5, heightChecker(new int[] {5,1,2,3,4}));
		}

		@Test
		public void test4() {
			Assert.assertEquals(0, heightChecker(new int[] {1,2,3,4,5}));
		}


}
