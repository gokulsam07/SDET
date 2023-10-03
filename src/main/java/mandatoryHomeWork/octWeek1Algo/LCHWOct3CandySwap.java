package mandatoryHomeWork.octWeek1Algo;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct3CandySwap {
	//ip: int[],int[]
	//op: int[]
	//Logic
	//1. Add all values in both array and store in sep variables
	//2. Run a nested for loop from start to end of each array
	//3. for aSwap sub alice value and add bob value do vice versa for bSwap
	//4. Check if the swaps has same value, if yes return the value in aliceSize and bobSize
	//SC : O[1], TC: O[N2]
	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		int aSum=0; int bSum=0;
		int a=aliceSizes.length;int b = bobSizes.length;
		for(int x : aliceSizes ){
			aSum+=x;
		}
		for(int x : bobSizes ){
			bSum+=x;
		}

		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				int aSwap = aSum - aliceSizes[i]+bobSizes[j];
				int bSwap = bSum +aliceSizes[i]-bobSizes[j];
				if(aSwap==bSwap) return new int[] {aliceSizes[i],bobSizes[j]};
			}
		}
		return new int[] {0,0};
	}
	@Test
	public void test1() {
		Assert.assertEquals(new int[] {4,5}, fairCandySwap(new int[] {3,2,4},new int[] {1,5,5}));
	}
	@Test
	public void test2() {
		Assert.assertEquals(new int[] {4,2}, fairCandySwap(new int[] {4,2},new int[] {2}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(new int[] {2,4}, fairCandySwap(new int[] {2},new int[] {2,4}));
	}

	@Test
	public void test4() {
		Assert.assertEquals(new int[] {5,4}, fairCandySwap(new int[] {1,5,4,6,7},new int[] {7,8,4,2}));
	}
}
