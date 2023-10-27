package mandatoryHomeWork.octWeek4;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct27_BinarySearch {
	//ip: int[], int
	//op: int
	//Logic : init left (left end) and right (right end) -- index
	//1. Run a while loop till left<=right
	//2. Find mid, if the mid has the tar element, return the mid index
	//3. if the ele in mid < tar, assign mid+1 as left
	//4. else assign right as mid-1
	//return -1
	
	//TC:O[N]; SC:O[k]
	public int binarySearch(int[] a,int find) {
		int left = 0;
		int right =a.length-1;
		while (left <= right) {
	        int mid = left + (right - left) / 2;
	        if (a[mid] == find)
	            return mid;
	        if (a[mid] < find)
	            left = mid + 1;
	        else
	            right = mid- 1;
	    }
	    return -1;
	}
		@Test
		public void test() {
			Assert.assertEquals(4, binarySearch(new int[]{5,7,9,11,14,65},14));
		}
		
		@Test
		public void test1() {
			Assert.assertEquals(-1, binarySearch(new int[]{5,7,9,11,14,65},12));
		}
		@Test
		public void test2() {
			Assert.assertEquals(6, binarySearch(new int[]{-5,-3,0,1,5,6,8,8,9},8));
		}
		@Test
		public void test3() {
			Assert.assertEquals(-1, binarySearch(new int[]{-5},8));
		}
		@Test
		public void test4() {
			Assert.assertEquals(2, binarySearch(new int[]{5,7,9,11,14,65},9));
		}

}
