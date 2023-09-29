package mandatoryHomeWork.septWeek3Algos;

import org.junit.Test;
import org.testng.Assert;

public class Sep16TwoSumTwoPointers {
	//ip : int[] ,int
	//op : int[]
	//Logic
	//1. set i=0;j=a.length-1
	//2. Run a while loop till i<j
	//3. Check if a[i]+a[j] ==tar, if yes return index of i & j as int[]
	//4. if sum < tar, inc i by 1
	//5. else dec j by 1
	//return empty int[] outside loop, if no match

	//Time complexity -  O[N]
	
	public int[] twoSum(int[] a, int tar) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int sum=a[i]+a[j];
			if(tar==sum) {
				return new int[] {i,j};
			}
			else if (sum < tar) {
				i++;
			} else {
				j--;
			}
		}
		return new int[] {0,0};
	}


	@Test
	public void test1() {
		Assert.assertEquals(new int[] {0,3}, twoSum(new int[] {2,3,4,7},9));
	}

	@Test
	public void test2() {
		Assert.assertEquals(new int[] {0,0}, twoSum(new int[] {2,3,4,7},12));
	}

	@Test
	public void test3() {
		Assert.assertEquals(new int[] {0,4}, twoSum(new int[] {1,1,1,1,1},2));
	}

	@Test
	public void test4() {
		Assert.assertEquals(new int[] {0,0}, twoSum(new int[] {},2));
	}


	@Test
	public void test5() {
		Assert.assertEquals(new int[] {0,3}, twoSum(new int[] {-1,0,2,3,4},2));
	}

	@Test
	public void test6() {
		Assert.assertEquals(new int[] {0,3}, twoSum(new int[] {0,1,2,3,8},3));
	}



}
