package mandatoryHomeWork.novWeek1;

import org.junit.Assert;
import org.junit.Test;

public class LCHWNov3_RevString3 {
	
	//ip & op: String
	//Logic -- split the string to string[]
	//1, Iterate thru, convert the individual string to charArr
	//2. Init two pointers i=0;j=string.length-1
	//3. Reverse it, append to sb along with " "
	//4. Return sb as string & trim at last

	 public String reverseString(String s) {
	        String[] splits = s.split(" ");
	        StringBuilder sb = new StringBuilder();
	        for(String str:splits){
	            char[] charArr = str.toCharArray();
	            int i=0;int j=charArr.length-1;
	            while(i<j){
	                char temp = charArr[i];
	                charArr[i]=charArr[j];
	                charArr[j]=temp;
	                i++;
	                j--;
	            }
	            sb.append(charArr);
	            sb.append(" ");

	        }
	      return new String(sb).trim();  
	    }
	 
	 @Test
		public void test1() {
			Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", reverseString("Let's take LeetCode contest"));
		}

		@Test
		public void test2() {
			Assert.assertEquals("doG gniD", reverseString("God Ding"));
		}

		@Test
		public void test3() {
			Assert.assertEquals("sihT si malayalam", reverseString("This is malayalam"));
		}

}
