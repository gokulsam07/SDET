package mandatoryHomeWork.foundation;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CandyType {

	//Input: Array of candy type & candies
	//Output: return the suggested 
//	Logic:
//		1. Initialize a set
//		2. Iteratrate the array in for loop and add the value in set (it will remove duplicates)
//		3.if set siz is greater than arr.length/2 return arr.length/2
//		else return set.size()
		
		
	public int candyType(int[] carr){
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < carr.length; i++) {
			set.add(carr[i]);
		}
		if(set.size()>carr.length/2) {
			return carr.length/2;
		}
		else return  set.size();

	}
	
	
	//Method2
	

	public int candyType1(int[] candyType){
		int n,i,c=1;
		n=candyType.length/2;
		for(i=0;i<candyType.length-1;i++){ //1,1,2,2,3,3
			if(candyType[i]!=candyType[i+1]) c++;
		}
		if(c<=n) return c;
		else return n;

	}
	@Test
	public void tst1() {
		Assert.assertEquals(3, candyType(new int[]{1,1,2,2,3,3}));
		Assert.assertEquals(3, candyType1(new int[]{1,1,2,2,3,3}));
	}

	@Test
	public void tst2() {
		Assert.assertEquals(2, candyType(new int[]{1,1,2,3}));
		Assert.assertEquals(2, candyType1(new int[]{1,1,2,3}));
	}


	@Test
	public void tst3() {
		Assert.assertEquals(1, candyType(new int[]{6,6,6,6}));
		Assert.assertEquals(1, candyType1(new int[]{6,6,6,6}));
	}
	
	@Test
	public void tst4() {
		Assert.assertEquals(3, candyType1(new int[]{1,2,2,3,5,6}));
	}
	
	@Test
	public void tst5() {
		Assert.assertEquals(7, candyType1(new int[]{1,2,3,4,4,4,4,4,5,7,7,7,9,9}));
	}


}
