package mandatoryHomeWork.postfoundationDailyHW;
import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Aug25HW_AssignCookies {

	//Input: int[] , int[]
	//Output: int
	//Logic: 
	//1. Sort the given arrays
	//Initialize var to store satisfied children, index for greedy int[]
	// In a for loop, run the loop till the length of both the arrays 
	// check if the available cookie size is grater than or equal to greed of the child in place
	//if yes, increment the satisfied child and increment the greed counter by 1
	//return satsified child

	//Time complexity =O[N]

	public int assignCookies(int[] g,int[] s) {
		Arrays.sort(g); 
		Arrays.sort(s); 

		int satisfied = 0;
		int i=0;

		for (int j = 0; i < g.length&& j < s.length; j++) {
			if(s[j]>=g[i]) {
				satisfied++;
				i++;
			}
		}
		return satisfied;
	}


	@Test
	public void test1() {
		Assert.assertEquals(1, assignCookies(new int[] {1,2,3},new int[] {1,1}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(2, assignCookies(new int[] {1,2},new int[] {1,2,3}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(0, assignCookies(new int[] {1,2,3},new int[] {}));
	}

	@Test
	public void test4() {
		Assert.assertEquals(1, assignCookies(new int[] {1,2,3},new int[] {3}));
	}


}
