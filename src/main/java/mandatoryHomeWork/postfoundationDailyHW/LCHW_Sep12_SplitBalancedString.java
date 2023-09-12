package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class LCHW_Sep12_SplitBalancedString {

	//Input: String
	//Ouput: int
	//Logic
	//1. Initialize three var countR, countL, count to 0
	//2. Run a for loop till the last index of s and if the charAt a particular index equals R, do countR++, else countL++
	//3. if the countR == countL, increment count by 1
	//4. return count

	//Time complexity -- O[N]

	public int balancedStringSplit(String s) {
		int count=0;
		int countR=0;
		int countL=0;
		for(int i=0;i<s.length();i++){

			if(s.charAt(i)=='R'){
				countR++;
			}
			else{
				countL++;
			}

			if(countR==countL){
				count++;
			}
		}
		return count;
	}


	@Test
	public void test1() {
		Assert.assertEquals(3, balancedStringSplit("LRLRRL"));
	}

	@Test
	public void test2() {

		Assert.assertEquals(0, balancedStringSplit("LLLLL"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(1, balancedStringSplit("LLLRRLRR"));
	}
}


