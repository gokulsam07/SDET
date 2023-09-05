package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Sep5CW_LeftRotate {
	
	//Input: int[], int
	//Output: int[]
	//Logic
	//1. Run a while loop till k>0
	//2. Run a for loop inside while loop till the last index -1
	//3. Shift all the elements in array by 1 index, decrement k by 1 after for loop 
	//4. return the array
	
	public int[] rotate(int[] given, int k) {
		while(k>0){
			for(int i=0;i<given.length-1;i++){
					int temp = given[i];
					given[i]=given[i+1];
					given[i+1]=temp;
			}
			k--;
	}
		return given;

	}
	
	
	@Test
	public void test1() {
		Assert.assertEquals(new int[] {1,2,3,4,5}, rotate(new int[] {1,2,3,4,5}, 0));
	}

	@Test
	public void test2() {
	
		Assert.assertEquals(new int[] {3,4,5,1,2}, rotate(new int[] {1,2,3,4,5}, 2));
	}

	@Test
	public void test3() {
		Assert.assertEquals(new int[] {1}, rotate(new int[] {1}, 2));
	}

}
