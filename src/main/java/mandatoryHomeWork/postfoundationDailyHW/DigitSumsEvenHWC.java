package mandatoryHomeWork.postfoundationDailyHW;
import org.junit.Test;
import org.testng.Assert;

public class DigitSumsEvenHWC {
	//Pseudocode
	//Input: int
	//Output : int
	//Logic
	//1. Run a for loop from 1 to num
	//2. If num <10, check if num%2==0, if yes increment counter
	//3. if num >=10, add the place values and check if sum%2==0, if yes increment counter
	//4. return counter

	//TC 30, 4, 100, 99, 1000

	public int digitSum(int num) {
		int counter=0;
		for(int i=1;i<=num;i++) {
			if(i<10&&i%2==0) {
				counter++;
			}
			else {
				int sum=0;
				int temp=i;
				while(temp>0) {
					int rem = temp%10;
					sum=sum+rem;
					temp=temp/10;
				}
				if(sum%2==0) {
					counter++;
				}
			}
		}
		return counter;
	}



	@Test
	public void test1() {
		Assert.assertEquals(14, digitSum(30));
	}
	@Test
	public void test2() {
		Assert.assertEquals(49, digitSum(100));
	}
	@Test
	public void test3() {
		Assert.assertEquals(2, digitSum(4));
	}
	@Test
	public void test4() {
		Assert.assertEquals(499, digitSum(1000));
	}
	@Test
	public void test5() {
		Assert.assertEquals(49, digitSum(99));
	}
}
