package mandatoryHomeWork.postfoundationDailyHW;


import org.junit.Test;
import org.testng.Assert;

public class Sep11CW_Sort {

	//Input: int[]
	//Output: int[]
	//Logic:
	//Initialize variable for 1, 2 & 0 as 0
	//1. Count all the 0,1,2 in respective variables using for loop and conditionals
	//2. Do three separate while loops to count against the total array size increment & add 0s,1s &2s based on comparison b/w original counter and new counter in while loop
	//return ouput 
	//Time complexity -- O[N]


	public int[] sort(int[]a) {
		int[] op = new int[a.length];
		int zero=0, one=0, two =0;

		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				zero++;
			}
			else if(a[i]==1) {
				one++;
			}
			else if(a[i]==2) {
				two++;
			}
		}
		int zero1=0, one1=0, two1 =0, i=0;
			while(zero1<zero&&i<op.length) {
				op[i++]=0;
				zero1++;
			}
			while(one1<one&&i<op.length) {
				op[i++]=1;
				one1++;
			}
			while(two1<two&&i<op.length) {
				op[i++]=2;
				two1++;
			}
			


		return op;
	}


	@Test
	public void test1() {
		Assert.assertEquals(new int[] {0,0,0,1,1,1,2,2}, sort(new int[] {1,0,0,1,2,0,1,2}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(new int[] {0,0,1,1,1,2,2,2}, sort(new int[] {1,1,1,2,2,2,0,0}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(new int[] {1,1,1,2,2}, sort(new int[] {2,2,1,1,1}));
	}

	@Test
	public void test4() {
		Assert.assertEquals(new int[] {0,0,2,2,2}, sort(new int[] {2,2,2,0,0}));
	}

}

