package mandatoryHoweWork.septWeek3Algos;

import org.junit.Test;
import org.testng.Assert;

public class Sep20CW_CheckFreq {
	//ip: String
	//op: boolean
	//Logic
	//1. init int[] of size 10
	//2. Run for loop to calculate the frequency of the digit & store in int[] using  freq[num.charAt(i)-48]++;
	//3. Run one more for loop for num.length to check if element at freq[i] and element at charAt(i)-48 are not equal
	//if yes return false
	
	//return true 

	//Time complexity - O[N] - length of num

	public boolean digitCount(String num) {
		int[] freq = new int[10];
		for(int i=0;i<num.length();i++){
			freq[num.charAt(i)-48]++;
		}

		for(int i=0;i<num.length();i++){
			if(freq[i]!=num.charAt(i)-48){
				return false;
			}
		}
		return true;
	}

	@Test
	public void test1() {

		Assert.assertEquals(true, digitCount("1210"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, digitCount("030"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(true, digitCount("2020"));
	}

	@Test
	public void test4() {
		Assert.assertEquals(false, digitCount("1"));
	}

	

}
