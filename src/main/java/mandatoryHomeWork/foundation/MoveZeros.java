package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;


//Input: int array
//Outuput: array with zero moved to last if any
//Logic:
//1. initialize temp=0
//2. Iterate the array in for loop
//3. Iterate the array with i+1 index
//4. If the element of index i==0, use below logic to move it to index of position i+1
//temp=arr[j]; 
//arr[j]=arr[i];
//arr[i]=temp;
//return the array

public class MoveZeros {
	public int[] moveZero(int[] arr) {
		int temp=0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==0) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return arr;

	}

	@Test
	public void tst1() {
		int[] actual= {0,1,0,3,12};
		int[] expected = {1,3,12,0,0};
		Assert.assertArrayEquals(expected,moveZero(actual));
	}

	@Test
	public void tst2() {
		int[] actual= {1,3,5,6,7};
		int[] expected = {1,3,5,6,7};
		Assert.assertArrayEquals(expected,moveZero(actual));
	}

}
