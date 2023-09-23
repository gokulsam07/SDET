package mandatoryHoweWork.septWeek3Algos;

import org.junit.Test;
import org.testng.Assert;

public class Sep19LCHW_SmallestPalindrome {

	//ip: String
	//op: String
	//Logic
	//1. Convert string to char[]
	//2. init i=0;j=arr.length-1
	//3. when i<j run a while loop
	//4. If arr[i]<arr[j] -- set the value of arr[i] to arr[j] and inc i by 1 , dec j by 1
	//5. else set arr[j] to arr[i] and dec j by1 and inc i by1
	//return arr as string

	//Time complexity -- o[N]
	public String makeSmallestPalindrome(String s) {
		char arr[] = s.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] < arr[j]) {
				arr[j--] = arr[i++];
			} else {
				arr[i++] = arr[j--];
			}
		}
		return new String(arr);
	}

	@Test
	public void test1() {
		Assert.assertEquals("abba", makeSmallestPalindrome("abba"));
	}

	@Test
	public void test2() {
		Assert.assertEquals("aba", makeSmallestPalindrome("abc"));
	}

	@Test
	public void test3() {
		Assert.assertEquals("neven", makeSmallestPalindrome("seven"));
	}

}
