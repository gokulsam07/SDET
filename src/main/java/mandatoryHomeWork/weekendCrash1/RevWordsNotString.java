package mandatoryHomeWork.weekendCrash1;

import org.junit.Test;
import org.testng.Assert;

public class RevWordsNotString {
	
	//ip & op: String
	//Logic -- split string using " "
	//1. Iterate the String[] -- reverse and store in the same index --i.e rev use tp & sep method
	//2. Join and return the split String[]
	//TC & SC :O(n* m)
	
	@Test
	public void revTest() {
		Assert.assertEquals("I ma yppah  reenigne", reverseWords("I am happy  engineer"));
	}
	
	@Test
	public void revTest1() {
		Assert.assertEquals("Siht   si  Ymmuy", reverseWords("thiS   is  yummY"));
	}
	
	public String rev(String s) {
		String[] split = s.split(" ");
		for(int i=0;i<split.length;i++) {
			split[i]=revWord(split[i]);
		}
		return String.join(" ", split);
	}
	
	private String revWord(String s) {
		char[] arr = s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<j) {
			char temp = arr[i];
			arr[i]= arr[j];
			arr[j]=temp;
			i++;j--;
		}
		return new String(arr);
	}
	
	
	//Inspace
	 public String reverseWords(String s) { //thiS   is  yummY
	     int len = s.length();
	     int start = 0;
	     char[] arr = s.toCharArray();
	        for (int end = 0; end < len; end++) {
	            if (arr[end] == ' ' || end == len - 1) {
	                int left = start;
	                int right = (end == len - 1) ? end : end - 1;
	                revWords(arr,left,right);
	                start = end + 1;
	            }
	        }
	        return new String(arr);
	    }
	 
	 private void revWords(char[] arr, int left, int right) {
		 while (left < right) {
             char temp = arr[left];
             arr[left] = arr[right];
             arr[right] = temp;
             left++;
             right--;
         }
		 return;
	 }

}
