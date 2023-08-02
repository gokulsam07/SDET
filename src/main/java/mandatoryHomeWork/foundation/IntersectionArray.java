package mandatoryHomeWork.foundation;


import java.util.HashSet;
import org.junit.Assert;
import org.junit.Test;

public class IntersectionArray {

	//Input: two int []
	//Output: int[] of intersection of arr1 & arr2
	//Logic:
	//1. Create two hashset h1 & h2
	//2. Iterate the array1 to set the value in arr1 to hs1
	//3. Iterate the arr2 to check if the value of int in arr2 is already present in hs1. If yes add to hs2
	//4. Create int[] of size hs2.size() -- because it will have only intersected value
	//5. Add the values in set to arr using for loop, return array

	public int[] arrayIntersect(int[] arr1, int[] arr2) {
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		for (int integer : arr1) {
			hs1.add(integer);
		}

		for (int integer : arr2) {
			if(hs1.contains(integer)) {
				hs2.add(integer);
			}
		}

		int[] fin = new int[hs2.size()];
		int k=0;
		for (int i : hs2) {
			fin[k++]=i;
		}
		return fin;
	}

	
	@Test
	public void tst1() {
		Assert.assertArrayEquals(new int[] {2}, arrayIntersect(new int[] {1,2,2,1},new int[] {2,2}));
	}

	@Test
	public void tst2() {
		Assert.assertArrayEquals(new int[] {4,9}, arrayIntersect(new int[] {4,9,5},new int[] {9,4,9,8,4}));
	}
}
