package mandatoryHomeWork.postfoundationDailyHW;

import java.util.ArrayList;

import org.junit.Test;
import org.testng.Assert;

public class Sep13CW_BaseballGame {

	//ip: String[]
	//op: int
	//Logic
	//1. If there is a num, add it to ArrayList
	//2. If there is D, double the last digit added, if there is C invalidate the last digit added
	// whenever an element is added to al, increment the alCounter, and reduce it whenever it is removed
	//3. For + add the last two digits 
	//Return the total sum
	
	//Time complexity -- O[N]
	public int calPoints(String[] operations) {
		int total=0;
		int alCounter=-1;
		ArrayList<Integer> al = new ArrayList<>();

		for(int i=0;i<operations.length;i++) {
			if(operations[i]=="D") {
				al.add(al.get(alCounter)*2);
				alCounter++;
			}
			else if(operations[i]=="C") {
				al.remove(alCounter);
				alCounter--;
			}
			else if(operations[i]=="+") {
				al.add(al.get(alCounter)+al.get(alCounter-1));
				alCounter++;
			}
			else {
				al.add(Integer.parseInt(operations[i]));
				alCounter++;


			}
		}

		for(Integer i : al) {
			total+=i;
		}

		return total;

	}

	@Test
	public void test1() {
		Assert.assertEquals(13, calPoints(new String[] {"5","2","6"}));
	}

	@Test
	public void test2() {

		Assert.assertEquals(30, calPoints(new String[] {"5","2","C","D","+"}));
	}

	@Test
	public void test3() {

		Assert.assertEquals(0, calPoints(new String[] {"1","C"}));
	}

	@Test
	public void test4() {

		Assert.assertEquals(27, calPoints(new String[] {"5","-2","4","C","D","9","+","+"}));
	}
}
