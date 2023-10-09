package mandatoryHomeWork.octWeek2.LinkedList;

import org.junit.Test;
import org.testng.Assert;

public class Oct9CW_SeniorCitizens {
	//ip: String[]
	//op: int
	//Logic : init countet
	//Extract the age using index  11 & 13 for substring, convert to Integer
	//Check if it's gte 60, if yes inc counter
	//return counter
	//TC: O[N*M] : SC : O[k]
	
public int countSeniors1(String[] details) {
	int count =0;
	for(String s :details) {
		if((Integer.parseInt(s.substring(11,13))>60)) count++;
	}
	return count;    
    }


public int countSeniors(String[] details) {
	int count = 0;
	for (String s : details) {
	        char char1 = s.charAt(11);
	        char char2 = s.charAt(12);

	        if (char1 == '6' && char2 > '0') {
	            count++;
	        }
	        else if(char1>'6'&&char2>='0') {
	        	count++;
	        }
	}
	return count;  
    }


@Test
public void test1() {
	Assert.assertEquals(2, countSeniors(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
}
@Test
public void test2() {
	Assert.assertEquals(0, countSeniors(new String[] {}));
}

@Test
public void test3() {
	Assert.assertEquals(0, countSeniors(new String[] {"1313579440F2036","2921522980M5644"}));
}

@Test
public void test4() {
	Assert.assertEquals(2, countSeniors(new String[] {"1313579440F7636","2921522980M6444"}));
}

}
