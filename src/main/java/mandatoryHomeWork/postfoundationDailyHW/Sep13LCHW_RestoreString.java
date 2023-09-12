package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Sep13LCHW_RestoreString {
	
	//ip: String, int[]
	//op: String
	//Logic
	//1. Initialize char[] of len == index.length
	//2. Run a for loop till last element
	//3. Add charAt(i) to char[] in index -> index[i]  i.e op[index[i]]
	//return char[] as String
	
	//Time complexity -- O[N]
	
	 public String restoreString(String s, int[] index) {
	      char[] op = new char[index.length];
				for(int i=0;i<index.length;i++){
					op[index[i]]=s.charAt(i);
				}
				return new String(op);
	    }
	 @Test
		public void test1() {
			Assert.assertEquals("leetcode", restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
		}

		@Test
		public void test2() {
			Assert.assertEquals("abc", restoreString("abc", new int[] {0,1,2}));
		}

		@Test
		public void test3() {
			Assert.assertEquals("c", restoreString("c", new int[] {0}));
		}
		
		@Test
		public void test4() {
			Assert.assertEquals("malayalam", restoreString("malayalam", new int[] {8,7,6,5,4,3,2,1,0}));
		}
		
		@Test
		public void test5() {
			Assert.assertEquals("word", restoreString("rodw", new int[] {2,1,3,0}));
		}


}
