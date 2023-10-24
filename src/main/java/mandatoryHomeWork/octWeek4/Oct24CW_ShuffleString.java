package mandatoryHomeWork.octWeek4;

import org.junit.Test;
import org.testng.Assert;

public class Oct24CW_ShuffleString {
	
	//ip: string,int[]
	//op: string
	//Logic: init char[] 
	//1. Iterate all elements of arr
	//2. put charAt(i) in arr[indices[i]]
	//return as string
	//TC & SC:O[N]
	
	public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for(int i=0;i<indices.length;i++){
            arr[indices[i]]=s.charAt(i);
        }
        return new String(arr);
    }
	
	 @Test
	 public void test()
	 {
		Assert.assertEquals("leetcode", restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
	 }
	 @Test
	 public void test1()
	 {
		 Assert.assertEquals("banveek", restoreString("vanbeek", new int[]{3,1,2,0,4,5,6}));
	 }
	 @Test
	 public void test3()
	 {
		 Assert.assertEquals("abc", restoreString("abc", new int[]{0,1,2}));
	 }

}
