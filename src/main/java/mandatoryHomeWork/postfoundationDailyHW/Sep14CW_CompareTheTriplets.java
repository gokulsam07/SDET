package mandatoryHomeWork.postfoundationDailyHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Sep14CW_CompareTheTriplets {
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		//ip: List, List
		//op: List
		//Logic
		//Init int[] of size 2
		//1. Run a for loop to compare the i element of a & b
		//2. If a>b inc 1 point to op[0]
		//3. else inc 1 to op[1]
		//return Arrays as List
		
		//Time complexity -- O[N] -- N - size of ArrayList
		List<Integer> al = new ArrayList<>();

		int[] op = new int[2];
		for(int i=0;i<a.size();i++){
			if(a.get(i)>b.get(i)){
				op[0]++;
			}
			if(a.get(i)<b.get(i)){
				op[1]++;
			}
		}
		for (int value : op) {
			al.add(value);
		}

		return al;
	}
	
	@Test
	public void test1() {
	
		Assert.assertEquals(Arrays.asList(1,1), compareTriplets(Arrays.asList(5,6,7),Arrays.asList(3,6,10)));
	}

	@Test
	public void test2() {
		Assert.assertEquals(Arrays.asList(0,0), compareTriplets(Arrays.asList(5,6,7),Arrays.asList(5,6,7)));
	}

	@Test
	public void test3() {
		Assert.assertEquals(Arrays.asList(2,0), compareTriplets(Arrays.asList(5,6,7),Arrays.asList(3,6,1)));
	}


}
