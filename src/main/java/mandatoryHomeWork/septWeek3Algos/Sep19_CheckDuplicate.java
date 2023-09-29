package mandatoryHomeWork.septWeek3Algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.junit.Test;
import org.testng.Assert;

public class Sep19_CheckDuplicate {

	//ip: int[], int
	//op : List<Integer>
	//Logic
	//1. Run two for loops, 1st loop till a.length, 2 loop from i+1 to i+k and length <a.length
	//2. Check if a[i]==a[j], if yes, add to list
	//3. return list
	//Time complexity -- O[m*n]

	public List<Integer> checkDup1(int[] a, int k) {
		List<Integer> al =new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j <= i+k && j<a.length; j++) {
				if(a[i]==a[j]) {
					al.add(a[i]);
				}
			}
		}
		return al;
	}

	//ip: int[], int
	//op: List
	//Logic -- inti Set and list
	//1. Run a for loop, 
	//2. Check if the set contains the element, if yes add to list
	//3. add the element to set
	//4. Check if i>=k, if yes remove the i-k element
	// return al
	//Time complexity - o[N]

	public List<Integer> checkDup(int[] nums, int k) {
		HashSet<Integer> window = new HashSet<>();
		HashSet<Integer> op = new HashSet<>();

		for (int i = 0; i < nums.length; i++)
		{
			if (window.contains(nums[i])) { 
				op.add(nums[i]);
			}
			window.add(nums[i]);
			if (i >= k) {
				window.remove(nums[i - k]);
			}
		}
		return new ArrayList<Integer>(op);
	}

	@Test
	public void test1() {
		Assert.assertEquals(Arrays.asList(6), checkDup(new int[]{ 5, 6, 8, 2, 4, 6, 9 },4));
	}

	@Test
	public void test2() {
		Assert.assertEquals(Arrays.asList(), checkDup(new int[]{ 5, 7, 8, 2, 4, 1, 9 },2));
	}

	@Test
	public void test3() {
		Assert.assertEquals(Arrays.asList(5), checkDup(new int[]{ 5, 6, 8, 2, 4, 9,5 },8));
	}

	@Test
	public void test4() {
		Assert.assertEquals(Arrays.asList(), checkDup(new int[]{ 5, 6, 8, 2, 6, 9,5 },2));
	}

	@Test
	public void test5() {
		Assert.assertEquals(Arrays.asList(2,5), checkDup(new int[]{ 5, 2, 5, 2, 6, 9,5 },2));
	}

	@Test
	public void test6() {
		Assert.assertEquals(Arrays.asList(1,2), checkDup(new int[]{1,2,2,1,1,1},2));
	}
}
