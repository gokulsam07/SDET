package mandatoryHomeWork.novWeek1;

import org.junit.Assert;
import org.junit.Test;

public class LCHWNov2_StringRevSlideWindow {
	
	//ip: String, int
	//op: String
	//logic convert s to charArr
	//1. Run thru the charArr hopping 2*k every iteration
	//2. Pass char[], start and end index (min of i+k-1 and arr.length-1 -- to stop swap at last char) for swap in separate function
	// return charArr as String
	//TC & SC :O[N]
	 public String reverseStr(String s, int k) {
	        char[] arr = s.toCharArray();
	        for(int i=0;i< arr.length;i+=2*k) {
	            rev(arr,i,Math.min(i+k-1,arr.length-1));
	        }
	          return new String(arr);
	    }
	    private static char[] rev(char[] a,int i,int j){
	        while(i<j){
	            char temp = a[i];
	            a[i]=a[j];
	            a[j]=temp;
	            i++;
	            j--;
	        }
	        return a;
	    }
	    

		@Test
		public void test1() {
			Assert.assertEquals("bacacb", reverseStr("abcabc", 2));
		}

		@Test
		public void test2() {
			Assert.assertEquals("cbaab", reverseStr("abcab", 3));
		}

		@Test
		public void test3() {
			Assert.assertEquals("cbadefhg", reverseStr("abcdefgh", 3));
		}
}
