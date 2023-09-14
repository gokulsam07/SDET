package mandatoryHomeWork.postfoundationDailyHW;
import org.junit.Test;
import org.testng.Assert;

public class Sep14CW_CamelCaseWordCount {

	public static int camelcase(String s) {
		//ip: String
		//op: int
		//Logic:
		//1. Init a counter
		//2. Run a for loop, increment the couter when ever the char is upper case
		//return count+1
		//Time complexity -- O[N] n- length of string

		int count =0;
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))){
				count++;
			}
		}
		return count+1;
		
	}


	@Test
	public void test1() {
		Assert.assertEquals(5, camelcase("saveChangesInTheEditor"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(1, camelcase("save"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(3, camelcase("isThisA"));
	}


}


