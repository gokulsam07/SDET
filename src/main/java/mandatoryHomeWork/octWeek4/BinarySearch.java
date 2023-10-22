package mandatoryHomeWork.octWeek4;

import org.junit.Test;
import org.testng.Assert;

public class BinarySearch {
	
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
