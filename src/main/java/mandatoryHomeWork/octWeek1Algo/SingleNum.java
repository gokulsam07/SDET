package mandatoryHomeWork.octWeek1Algo;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class SingleNum {
	
	public int singleNumber(int[] arr) {
		HashSet<Integer> s=new HashSet<Integer>();
	      for(int i: arr){
	           if(!s.add(i)){
	                 s.remove(i);
	             }
	             else{
	                 s.add(i);
	             }
	         }
	       return s.iterator().next();
		}
	@Test
	public void test1() {
		Assert.assertEquals(1, singleNumber(new int[] {2,2,1}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(4, singleNumber(new int[] {2,2,1,1,4}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(1, singleNumber(new int[] {1}));
	}
}
