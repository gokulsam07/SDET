package mandatoryHoweWork.twoPointerAlgo;

import org.junit.Test;
import org.testng.Assert;

public class Sep16_MoveZerosTwoPointers {

	//ip : int[]
	//op: int[]
	//Logic
	//1. init j=0;
	//2. Run a for loop till last value
	//3. if the value at index i !=0, set in a[j]
	// if i !=j, set a[i]=0
	//4. inc j by 1 inside loop
	//return a

	public int[] moveZero(int[] a) {
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				a[j]=a[i];
				if (j != i) {
					a[i] = 0; 
				}
				j++;
			}
		}
		return a;
	}


	@Test
	public void test1() {
		Assert.assertEquals(new int[] {1,3,12,0,0}, moveZero(new int[] {0,1,0,3,12}));
	}
	@Test
	public void test2() {
		Assert.assertEquals(new int[] {3,12,0,0}, moveZero(new int[] {0,0,3,12}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(new int[] {1,2,3,4,0,0,0}, moveZero(new int[] {1,0,2,0,3,0,4}));
	}

	@Test
	public void test4() {
		Assert.assertEquals(new int[] {-1,2,-3,4,0,0,0}, moveZero(new int[] {-1,0,2,0,-3,0,4}));
	}
	@Test
	public void test5() {
		Assert.assertEquals(new int[] {-1,2,-3,4,0}, moveZero(new int[] {-1,2,-3,0,4}));
	}


}
