package mandatoryHomeWork.octWeek4;

import org.junit.Assert;
import org.junit.Test;

public class Sorting {
	//Bubble sort  --multiple swaps
	//ip & op : int[]
	//Logic
	//Run nested for loop from first to last element-1, nested loop starts from next element of outer loop
	// if element in index j is smaller than i, swap the elements
	// return a[]
	//SC:O[k]; TC: O[N2]
	
	public int[] sortArr1(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					int temp = a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		return a;
	}
	
	//Selection sort  -- one swap per loop
	//ip & op : int[]
	//logic
	//1. Outer loop runs from first to second last element, store the loop's index as pivot
	//2. Inner loop runs from next index of outer loop to last element 
	//3.if any element in inner loop is smaller than pivot index element, assign the index of that index to pivot
	//swap pivot index ele & current outer loop index element
	// return a[]
	//SC:O[k]; TC: O[N2]
	
	public int[] sortArr2(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int pivot=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[pivot]) {
					pivot=j;
				}
			}
			int temp =a[i];
			a[i]=a[pivot];
			a[pivot]=temp;
		}
		return a;
	}
	
	public int[] sortArr(int[] a) {
		for(int i=1;i<a.length;i++) {
			int pivot=a[i];
			 int j = i - 1;
	            while (j >= 0 && a[j] > pivot) {
	                a[j + 1] = a[j];
	               j--;
	            }
	            a[j + 1] = pivot;
		}
		return a;
	}
	
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {3,4,5,6,7}, sortArr(new int[] {7,4,5,3,6}));
	}
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {-5,-1,0,0,4}, sortArr(new int[] {0,4,0,-1,-5}));
	}
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] {1,2,3,4,5}, sortArr(new int[] {5,4,3,2,1}));
	}

}
