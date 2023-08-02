package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTargetElement {

	//	Input: array and element to remove
	//	Output: target removed array
	//	Logic:
	//		1.initialize x=0 & a new array of size original array(also will work for array with non removable elements)
	//		2. Iterate the loop and if the target element is not matched with the array value, store in the new array 
	//		3. increment the index of new array
	//		4. return a copy of array with the size incremented using x

	public int[] removeTarget(int[] arr, int tar) {
		int x=0;
		int[] fin = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=tar) {
				fin[x]=arr[i];
				x++;
			}
		}
		return Arrays.copyOf(fin, x);
	}

	//Method2
	public int[] removeTarget1(int[] arr, int tar) {
		int x=0;
		for (int i : arr) {
			if(i!=tar) {
				x++;
			}
		}

		int[] cop = new int[x];
		int k=0;
		for (int i : arr) {
			if(i!=tar) {
				cop[k]=i;
				k++;
			}
		}
		return cop;
	}

	@Test
	public void tst1() {
		int[] expected = {2, 4, 5};
		int[] actual = removeTarget1(new int[]{2, 3, 3, 4, 5}, 3);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tst2() {
		int[] expected = {};
		int[] actual = removeTarget1(new int[]{2, 2}, 2);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tst3() {
		int[] expected = {2, 2, 5};
		int[] actual = removeTarget1(new int[]{2, 2, 5}, 3);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void tst4() {
		int[] expected = {};
		int[] actual = removeTarget1(new int[]{}, 3);
		Assert.assertArrayEquals(expected, actual);
	}
}
