package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class UniqueOccurrences {

	//Input : int[] with repeating/non-repeating numbers
	//Output: true of false
	//Logic:
	//1. sort the array & initialize one more array of size arr.length to store count of elements in array & initialize counter and k =0 (for count storage in array)
	//2. In a for loop, until arr.length-1(last element will be verified in the last but one element's iteration), 
	//check if arr[i] ==arr[i+1], if yes increment count by 1
	//3. else size[k++]=count; count=1; (to set the count of previous repeating element's count, then reset count =1 for next iteration
	//4. set arr[k] =count outside for loop, to store the count value of non repeating last element (if any)
	//5. check if there's any repeating values in the stored size[] using for loops and only when the element !=0 (count will not be 0, 
	// but due to dynamic nature of element count and array size, resultant size counter will have 0, that has to be ignored)

	public boolean isUnique(int[] arr) {
		Arrays.sort(arr);
		int[] size = new int[arr.length];
		int count=1, k=0; 
		for (int i = 0; i < arr.length-1; i++) {

			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				size[k++]=count;
				count=1;
			}

		}
		size[k]=count;

		for (int i = 0; i < size.length; i++) {
			for (int j = i+1; j < size.length; j++) {
				if(size[i]!=0) {
					if(size[i]==size[j]) {
						return false;
					}
				}
			}
		}
		return true;
	}

	@Test
	public void tst1() {
		Assert.assertEquals(true, isUnique(new int[] {1,2,2,1,1,3}));
	}

	@Test
	public void tst2() {
		Assert.assertEquals(false, isUnique(new int[] {1,2}));
	}

	@Test
	public void tst3() {
		Assert.assertEquals(true, isUnique(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
	}

	@Test
	public void tst4() {
		Assert.assertEquals(false, isUnique(new int[] {3,5,-2,-3,-6,-6}));
	}

	@Test
	public void tst5() {
		Assert.assertEquals(true, isUnique(new int[] {1,2,2,1,1,3}));
	}



}
