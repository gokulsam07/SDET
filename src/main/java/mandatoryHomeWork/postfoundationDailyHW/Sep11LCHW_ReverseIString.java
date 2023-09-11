package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Sep11LCHW_ReverseIString {
	
	//input : string
	//Output : string
	//Logic
	//1. Init StringBuilder
	//2. In a for loop, iterate till last element of s
	//3. If the charAt(i) == 'i' -- do sb.reverse();
	//4. else append the charAt(i) to sb
	//return the sb as String
	
	//Time complexity -- O[N]
	
	 public String reverseString(String s) {
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0; i < s.length(); i++){
	            if(s.charAt(i) == 'i'){
	                sb.reverse();
	            } else {
	                sb.append(s.charAt(i)); 
	            }
	        }
	        return new String(sb); 
	    }
	 
	 

		@Test
		public void test1() {
			Assert.assertEquals("rtSng", reverseString("String"));
		}

		@Test
		public void test2() {
			Assert.assertEquals("ponter", reverseString("poiinter"));
		}

		@Test
		public void test3() {
			Assert.assertEquals("oVLA", reverseString("VoiLA"));
		}

	 
	 
}
