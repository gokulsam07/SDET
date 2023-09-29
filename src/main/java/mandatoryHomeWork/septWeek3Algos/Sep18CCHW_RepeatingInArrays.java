package mandatoryHomeWork.septWeek3Algos;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class Sep18CCHW_RepeatingInArrays {

	//bruteforce
	//ip: int[], int[]
	//op :int
	//Logic
	//1. Run two for loops to check where the elements of arr1 & 2 matches, inc count
	//return count

	//Time complexity -O[N2]

	public int rep1(int[] a, int[] b) {
		int count=0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					count++;
					break;
				}

			}

		}
		return count;
	}
	//ip: int[], int[]
	//op :int
	//Logic
	//1. Run a for loop using two pointers till the pointers are less than the size of arrays
	//2. if element at a and b are equal, count++, inc both pointers by 1
	//3. if ele at a[i]<b[j] inc i++
	//4. else j++;
	//return count

	//Time complexity - O[N log N]


	public int rep2(int[] a, int[] b) {
		int count=0;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0,j=0; i < a.length&&j<b.length;) {
			if(a[i]==b[j]) {
				count++;
				i++;
				j++;
			}
			else if(a[i]<b[j]) { //1234 //2345
				i++;
			}
			else {
				j++;
			}

		}
		return count;
	}



	//ip: int[], int[]
	//op :int
	//Logic
	//1. Add the arr1 to set
	//2. while adding the arr2 to set, check if the add returns false, if yes count++;
	//return count

	//Time complexity - O[N]
	public int rep3(int[] a, int[] b) {
		int count=0;
		HashSet<Integer> hs = new HashSet<>();
		for (int i : a) {
			hs.add(i);
		}
		for (int i : b) {
			if(!(hs.add(i))){
				count++;
			}
		}
		return count;
	}
	@Test
	public void test1() {
		Assert.assertEquals(3, rep1(new int[] {1,2,3,4},new int[] {1,2,3,5}));
		Assert.assertEquals(3, rep2(new int[] {1,2,3,4},new int[] {1,2,3,5}));
		Assert.assertEquals(3, rep3(new int[] {1,2,3,4},new int[] {1,2,3,5}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(3, rep1(new int[] {2,4,1},new int[] {1,4,2}));
		Assert.assertEquals(3, rep2(new int[] {2,4,1},new int[] {1,4,2}));
		Assert.assertEquals(3, rep3(new int[] {2,4,1},new int[] {1,4,2}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(0, rep1(new int[] {1},new int[] {2}));
		Assert.assertEquals(0, rep2(new int[] {1},new int[] {2}));
		Assert.assertEquals(0, rep3(new int[] {1},new int[] {2}));
	}

	@Test
	public void test4() {
		Assert.assertEquals(3, rep1(new int[] {1,3,4,2},new int[] {4,2,3,5})); 
		Assert.assertEquals(3, rep2(new int[] {1,3,4,2},new int[] {4,2,3,5}));
		Assert.assertEquals(3, rep3(new int[] {1,3,4,2},new int[] {4,2,3,5}));
	}
}
