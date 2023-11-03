package mandatoryHomeWork.novWeek1;

import org.junit.Assert;
import org.junit.Test;

public class CWNov3_SecondMax {
	//ip: int[]
	//op: int
	//Logic init two vars max & secMax
	//1. Loop thru in a single for loop, if the ele is > max assign max to secMax ; curr to max
	//2. else if the ele is > max but not equls max, assign ele to secMax
	//return secMax
	//TC: O[N]; SC: O[k]
	public int secondMax(int[] a) {
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secMax=max;
				max=a[i];
			}
			else if (a[i] > secMax&&a[i]!=max) {
	                secMax = a[i];
			}
		}
		return secMax;
	}

	
	@Test
	public void test1() {
		Assert.assertEquals(2, secondMax(new int[] {5,2,-3,2,0}));
	}
	@Test
	public void test2() {
		Assert.assertEquals(-1, secondMax(new int[] {-3,-2,-5,0,-1}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(5, secondMax(new int[] {1,5,3,2,0,10}));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(5, secondMax(new int[] {4,2,3,4,7,5,7,2}));
	}

}
