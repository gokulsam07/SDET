package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Sep5HW_MaxWordSentence {
	
	//input: string[]
	//output: int
	//logic
	//1. Run a for each loop and convert each sentence to String array using split operator and add the length of it to a var
	//2. check if it is greater than max, if yes assign length to max
	//return max
	public int maxWord(String[] arr) {
		int max=Integer.MIN_VALUE;
		for (String s : arr) {
			String[] sp = s.split(" ");
			if(sp.length>max) {
				max=sp.length;
			}
		}
		return max;
	}



	@Test
	public void test1() {
		Assert.assertEquals(6, maxWord(new String[] {"hey this is me", "poda panni", "vanakkam di mapla theni la irundhu"}));
	}

	@Test
	public void test2() {

		Assert.assertEquals(3, maxWord(new String[] {"en peru annamala","enaku innoru peru","adhuvum annamala dhaan"}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(1, maxWord(new String[] {"mmm","iruken"}));
	}

}
