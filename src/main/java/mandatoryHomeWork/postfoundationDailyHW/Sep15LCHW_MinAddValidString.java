package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Sep15LCHW_MinAddValidString {
	
	//ip : String
	//op: int
	//Logic
	//1. Init ans=0;
	//2. Run a for loop till length of word
	//3. If word.charAt(i) equals 'a', inc i by 1, else inc ans by 1
	//4. if i < word.length() && word.charAt(i)== 'b' inc i by 1, else inc ans by 1
	//5 .if i < word.length() && word.charAt(i)== 'c' inc i by 1, else inc ans by 1
	
	//return ans
	//Time complexity - O[N] - N ->length of string
	
	public int addMinimum(String word) {
		int ans=0;
		    for(int i=0; i<word.length();){
		        if(word.charAt(i)== 'a') i++; else ans++;         
		        if( i < word.length() && word.charAt(i)== 'b')i++; else ans++;
		        if(i < word.length() && word.charAt(i) == 'c')i++; else ans++;
		    }
		    return ans;
		        
		    }
	
	
	 @Test
		public void test1() {
			Assert.assertEquals(6, addMinimum("bbb"));
		}

		@Test
		public void test2() {
			Assert.assertEquals(0, addMinimum("abc"));
		}

		@Test
		public void test3() {
			Assert.assertEquals(2, addMinimum("c"));
		}
		@Test
		public void test4() {
			Assert.assertEquals(2, addMinimum("abca"));
		}

}
