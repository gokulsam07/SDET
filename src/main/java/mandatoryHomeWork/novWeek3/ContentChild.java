package mandatoryHomeWork.novWeek3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ContentChild {
	//ip: int[]
	//op ;int
	//logic - sort both the arr, init counter
	//1. Loop thru all element'in s[] and check if the child is satidfied, if yes inc count and inc pointer of greed by 1
	//return count
	//TC:O[n log n], SC: o[k]
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int contentCount = 0;
		for (int i = 0, j = 0; i < g.length && j < s.length; j++) {
			if (s[j] >= g[i]) {
				contentCount++;
				i++;
			}
		}
		return contentCount;
	}
		
		@Test
		 public void test()
		 {
			Assert.assertEquals(2, findContentChildren( new int[]{5,4,3,2},new int[]{4,1,3}));
		 }
		 @Test
		 public void test1()
		 {
			 Assert.assertEquals(0, findContentChildren( new int[]{7,8,6,9},new int[]{1,4,3,2}));
		 }
		 @Test
		 public void test3()
		 {
			 Assert.assertEquals(3, findContentChildren( new int[]{6,8,7,9,10},new int[]{10,7,9}));
		 }
	
	
	

}
