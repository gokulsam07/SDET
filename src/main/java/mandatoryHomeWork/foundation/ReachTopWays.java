package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class ReachTopWays {


	//Input : Get the number of steps
	//Output : Gt the number of way to get to top
	//Logic: 
	//Implement fibonacci logic
	// How did I arrive at implementing fibonacci logic?
	//Implemted logic for 2, 3 ,4 ,5 steps
	//found that the answer follows fibonacci after submitting in leetcode, so modified it later

	/*
	 * Fibonacci logic 
	 * if n == 0 or 1 return the same else initialize n1,n2,sum=0;
	 * In a for loop, starting from 2, till n, increment index by 1 do the following
	 * add n1, n2 and store in sum swap n2 to n1 and sum to n2 
	 * return the sum of last iteration's n1 &n2 outside the for loop
	 */
			public int reachTop(int n) {
		if (n ==0 ||n==1) {
			return n;
		}

		int n1 = 0;
		int n2 = 1;
		int sum = 0;

		for (int i = 2; i <= n; i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}

		return n2+n1;
	}


	@Test
	public void tst1() {
		Assert.assertEquals(0, reachTop(0));
	}

	@Test
	public void tst2() {
		Assert.assertEquals(3, reachTop(3));
	}

	@Test
	public void tst3() {
		Assert.assertEquals(5, reachTop(4));
	}

	@Test
	public void tst4() {
		Assert.assertEquals(8, reachTop(5));
	}
}
