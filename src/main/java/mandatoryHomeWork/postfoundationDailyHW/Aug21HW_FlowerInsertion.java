package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Aug21HW_FlowerInsertion {
	//Input: int[] & int
	//Output: boolean
	//Logic:
	//1. Iterate the array till last element
	//2. Check if the element is zero
	//3. If yes take the n-1 element in previous and n+1 element in next
	//4. to include last and first element(they don't have next and previous element respectively so, assuming them to be zero is fine)
	// use ternary operator to set 0 to the previous element of 1st & next element of last 
	//5. Check if previous and next equals to 0
	//6. if yes, plant 1 in the index and increment count
	//7. return count==n

	public boolean isFlowerInsertionPossible(int[] a,int n){
		int count=0;

		for (int i = 0; i < a.length&& count < n; i++) {
			if(a[i]==0) {
				int next = (i==a.length-1)?0:a[i+1];
				int previous = (i==0)?0:a[i-1];
				if(previous==0&&next==0) {
					a[i]=1;
					count++;
				}
			}

		}

		return count==n;

	}

	@Test
	public void test1() {
		Assert.assertEquals(true, isFlowerInsertionPossible(new int[] {1,0,0,0,1},1));
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, isFlowerInsertionPossible(new int[] {1,0,0,0,0,1},2));
	}

	@Test
	public void test3() {
		Assert.assertEquals(true, isFlowerInsertionPossible(new int[] {0,0,1,0,1},1));
	}
	@Test
	public void test4() {
		Assert.assertEquals(true, isFlowerInsertionPossible(new int[] {0,0,0,0,0},3));
	}
	@Test
	public void test5() {
		Assert.assertEquals(true, isFlowerInsertionPossible(new int[] {1,0,1,0,0},1));
	}

}
