package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;



public class NextBiggestChar {

	
// input : char array in sorted way and char to check
// output : next largest char for the mentioned char in the array
// logic : loop through the char array and in if condition check all the elements in the array is greater than the given element
// if yes return the value of the element

	public char nextBiggest(char[] arr, char ele) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>ele) 
				return arr[i];
		}
		return ele;
	}

	@Test
	public void test1()
	{
		Assert.assertEquals('h', nextBiggest(new char[]{'b','d','h','o'},'d'));
	}

	@Test
	public void test2()
	{
		Assert.assertEquals('h', nextBiggest(new char[]{},'h'));
	}

	@Test
	public void test3()
	{
		Assert.assertEquals('z', nextBiggest(new char[]{'a','b','z'},'c'));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals('c', nextBiggest(new char[]{'a','b','c'},'c'));
	}
	
	
}
