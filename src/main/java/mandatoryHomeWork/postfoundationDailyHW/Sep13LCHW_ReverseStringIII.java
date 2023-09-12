package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Sep13LCHW_ReverseStringIII {

	//ip: String 
	//op: String
	//Logic
	//1. Split string using " " and store in array
	//2. reverse the word using string builder reverse
	//3. join and return they String using String.join(arr," " )

//Time complexity -- O[N]
	public String reverseString(String s) {
		String[] arr = s.split(" ");
		int i=0;
		for(String word :arr) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			arr[i++]=sb.toString();
		}
		return String.join(" ", arr);   
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
