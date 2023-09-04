package mandatoryHomeWork.postfoundationDailyHW;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import org.testng.Assert;

public class Sept4CW_FindDuplicate {
	//Input: int[] 
	//Output: duplicate
	//Logic:
	//1. Create an array of size n+1
	//2. run a for loop of given to set the frequency of the num in the array
	//3. Check which element has frequqency greater than 2 using for loop and return it
	public static int findDuplicate(ArrayList<Integer> arr, int n){
		// Write your code here.

		int[] arr2 = new int[arr.size()+1];

		for(Integer i : arr){
			arr2[i]++;
		}

		for(int i=0;i<arr2.length;i++){
			if(arr2[i]>1){
				return i;
			}
		}
		return 0;

	}




	@Test
	public void test1() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(4);
		al.add(5);
		al.add(2);
		al.add(1);
		Assert.assertEquals(4, findDuplicate(al, 0));
	}

	@Test
	public void test2() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(1);
		al.add(1);
		Assert.assertEquals(1, findDuplicate(al, 0));
	}

	@Test
	public void test3() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(4);
		Assert.assertEquals(4, findDuplicate(al, 0));
	}


}