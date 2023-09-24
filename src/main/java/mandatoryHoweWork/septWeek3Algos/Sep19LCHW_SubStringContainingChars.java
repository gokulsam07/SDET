package mandatoryHoweWork.septWeek3Algos;

import org.junit.Test;
import org.testng.Assert;

public class Sep19LCHW_SubStringContainingChars {

	//ip: String
	//op: int
	//Logic : init int[] to hold freq of a,b,c, count to return substring, left pointer
	//1. Run a for loop till last element, count the freq of each char
	//2. RUn a while loop inside for to run when all the three char's freq is >0
	//3. add s.length()-i to count
	//4. reduce the frequency of the calculated chat and move the left pointer to next char -- to take further substrings
	//Time complexity -- O[N]

	public int subString(String s) {
		int[] freq = new int[3];
		int count=0;
		int left=0;
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)-'a']++;
			while(freq[0]>0&&freq[1]>0&&freq[2]>0) {
				count+=s.length()-i;
				freq[s.charAt(left)-'a']--;
				left++;
			}
		}
		return count;
	}

	@Test
	public void test1() {

		Assert.assertEquals(10, subString("abcabc"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(3, subString("aaabc"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(0, subString("ab"));
	}
}
