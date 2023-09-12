package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Sep13LCHW_NoOfLinesOfString {

	//ip : int[], string
	//op :int[] 
	//Logic - inti int[] of size 2
	//1. Run a for each loop for s.toCharArray()
	//2. Take the given width value for the char by using width[ch-'a'];
	//3. If the width+sum>100, reset the sum & inc lineCounter 
	//4. add the value of char width in sum in all other cases
	// assign op[1] = lineCount and op[2] = last line width
	//return op
	
	 public int[] numberOfLines(int[] widths, String s) {
	      int sum=0; 
	      int lineCount=1;
	      int[] op = new int[2];
	      for(char ch:s.toCharArray()){
	          int charW = widths[ch - 'a'];
	          if(charW + sum > 100){
	                lineCount++;
	                sum = 0;
	            }
	            sum += charW;            
	      }

	        op[0] = lineCount;
	        op[1] = sum;
	        return op;
	    }
	 
	 
		@Test
		public void test1() {
			int[] width = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
			String s="abcdefghijklmnopqrstuvwxyz";
			int[] op =  {3,60};
			Assert.assertEquals(op, numberOfLines(width, s));
		}

		@Test
		public void test2() {
			int[] width = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
			String s="bbbcccdddaaa";
			int[] op =  {2,4};
			Assert.assertEquals(op, numberOfLines(width, s));
		}

		@Test
		public void test3() {
			int[] width = {2,4,6,8,2,4,6,10,2,4,6,8,2,4,6,8,10,10,10,10,10,10,10,10,10,10};
			String s="heyhowareyou";
			int[] op =  {1,88};
			Assert.assertEquals(op, numberOfLines(width, s));
		}
		
		@Test
		public void test4() {
			int[] width = {2,4,6,8,2,4,6,10,2,4,6,8,2,4,6,8,10,10,10,10,10,10,10,10,10,10};
			String s="l";
			int[] op =  {1,8};
			Assert.assertEquals(op, numberOfLines(width, s));
		}

		
}
