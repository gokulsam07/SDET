package mandatoryHomeWork.octWeek4;

import org.junit.Assert;
import org.junit.Test;

public class LCHWOct25_FlowerBEd {
//ip: int[], int
	//op: boolean
	//Logic: inti ins=0;
	//1. iterate all the elements in int[]
	//2. if the element is 0, check if insertion can be done,if yes insert (end the loop if more no of insertion than given can be done)
		// take prev & next element (for first and last element previ & next is assumed to be zero)
		// if the prev & next is zero, inc ins, put flower in the iteration
	//3. return ins==count
	//TC ; O[N]: SC:O[k]
	   public boolean isFlowerInsertionPossible(int[] flowerbed, int n) {
	        int ins =0;
	        for(int i=0;i<flowerbed.length&&ins<n;i++){
	                if(flowerbed[i]==0){
	                    int prev = (i==0)?0:flowerbed[i-1];
	                    int next = (i==flowerbed.length-1)?0:flowerbed[i+1];
	                    if(next==0&&prev==0){
	                        ins++;
	                        flowerbed[i]=1;
	                    }
	                }
	        }
	        return ins==n;
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
