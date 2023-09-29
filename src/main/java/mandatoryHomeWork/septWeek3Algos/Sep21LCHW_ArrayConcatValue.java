package mandatoryHomeWork.septWeek3Algos;

import org.junit.Test;
import org.testng.Assert;

public class Sep21LCHW_ArrayConcatValue {

	//ip: int[]
	//op: long
	//Logic
	//1. Init two pointers i=0;j=nums.length-1, sum to store long
	//2. run a while loop till i<j
	//3. String temp=nums[i++]+""+nums[j--];
	//4. parse the temp num as int and add to sum
	// if length of arr%2!=2, return sum+middle array value, else just return sum

	//Time complexity - O[N2]

	public long findTheArrayConcVal(int[] nums) {
		int i=0;int j=nums.length-1;long concatSum=0;
		while(i<j){
			String temp=nums[i++]+""+nums[j--];
			concatSum+=Integer.parseInt(temp);
		}
		return (nums.length%2!=0)?concatSum+nums[nums.length/2]:concatSum;
	}

	@Test
	public void test1() {

		Assert.assertEquals(596, findTheArrayConcVal(new int[] {7,52,2,4}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(673, findTheArrayConcVal(new int[] {5,14,13,8,12}));
	}


}
