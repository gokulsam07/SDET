package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class Sep25LCHW_MinRecolors {

	//ip: String, int
	//op: int
	//Logic init p1,p2 current & minCount (as Max)
	//1. Run a while loop till last element
	//2. if the current char is W inc currentCount
	//3. Whenever the window size equals check which is min of current and min and set to min
	//4. if the p1 is W reduce currentCount
	//inc p1 by 1
	// inc p2 by 1

	//return min 

	//Time complexity -O[N], space Complexity - O[k]

	public int minimumRecolors(String blocks, int k) {
		int p1 = 0;
		int p2 = 0;
		int currentCount = 0;
		int minCount = Integer.MAX_VALUE;

		while (p2 < blocks.length()) {
			if (blocks.charAt(p2) == 'W') {
				currentCount++;
			}

			if (p2 - p1 == k - 1) {
				minCount = Math.min(minCount, currentCount);
				if (blocks.charAt(p1) == 'W') {
					currentCount--;
				}
				p1++;
			}

			p2++;
		}

		return minCount;
	}


	@Test
	public void test(){
		Assert.assertEquals(3, minimumRecolors("WBBWWBBWBW", 7));
	}
	@Test
	public void test1(){
		Assert.assertEquals(0, minimumRecolors("WBWBBBW", 2));
	}

	@Test
	public void test2(){
		Assert.assertEquals(2, minimumRecolors("WWWWWWB", 3));
	}


}
