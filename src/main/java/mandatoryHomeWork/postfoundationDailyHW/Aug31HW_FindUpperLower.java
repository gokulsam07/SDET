package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Aug31HW_FindUpperLower {
	
	//Input: char
	//Output : int
	//Logic
	//1. initialize num=-1. check if the char is upper or lower, if upper assign 1 to num, else assign 0 to num
	//2. return num
	
	
	public int checkCasing(char c) {
		int num=-1;
		if(Character.isUpperCase(c)) {
			num=1;
		}
		else if(Character.isLowerCase(c)) {
			num=0;
		}
		return num;
	}

	
	
	@Test
	public void test1() {
		Assert.assertEquals(1, checkCasing('A'));
	}

	@Test
	public void test2() {
		Assert.assertEquals(0, checkCasing('a'));
	}

	@Test
	public void test3() {
		Assert.assertEquals(-1, checkCasing('#'));
	}

}
