package mandatoryHomeWork.postfoundationDailyHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.testng.Assert;


public class SelfDividingAug18CW1 {
	//Pseduocode
	//Input : int, int 
	// Output : List<Int>
	//Constraint : int >=1
	//Logic
	//1. Run a for loop from left to right
	//2. call a method inside the loop to check if it is a self dividing num
	//3. If yes, add to list 
	//4. return the list

	//TC [1,8],[1,22],[47,85],[90,100],[99,111].[100,110]

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list =  new ArrayList<Integer>();
		for(int i=left;i<=right;i++) {
			if(i<10) {
				list.add(i);
			}
			else if(isSelfDividing(i)) {
				list.add(i);
			}
		}

		return list;
	}
	private boolean isSelfDividing(int num) {
		int temp=num;
		int count1=0;
		int count2=0;
		while(num>0) {
			count2++;
			int rem=num%10;
			if(rem==0)return false;
			else if(temp%rem==0) {
				count1++;
			}
			num=num/10;
		}
		return count1==count2;
	}

	@Test
	public void test1() {
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22);
		Assert.assertEquals(l1, selfDividingNumbers(1,22));
	}

	@Test
	public void test2() {
		List<Integer> l1 = Arrays.asList(48,55,66,77);
		Assert.assertEquals(l1, selfDividingNumbers(47,85));
	}

	@Test
	public void test3() {
		List<Integer> l1 = Arrays.asList(99);
		Assert.assertEquals(l1, selfDividingNumbers(90,100));
	}

	@Test
	public void test4() {
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8);
		Assert.assertEquals(l1, selfDividingNumbers(1,8));
	}

	@Test
	public void test5() {
		List<Integer> l1 = Arrays.asList(99,111);
		Assert.assertEquals(l1, selfDividingNumbers(99,111));
	}
	
	@Test
	public void test6() {
		List<Integer> l1 = Arrays.asList();
		Assert.assertEquals(l1, selfDividingNumbers(100,110));
	}

}
