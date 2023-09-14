package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Sep14LCHW_MaxNumOfStringPairs {

	//ip : String[]
	//op : count
	//Logic
	//1. Run a nested for loop (top index from o, nested loop index from i+1)
	//2. Init sb in nested for loop, and pass words[j]
	//3. Check if words[i] and reversed sb are equals, if yes inc count
	// return count
	//Time complexity - O[m*n] -- m - length of top array, n - length of nested loop
	public int maximumNumberOfStringPairs(String[] words) {
		int count=0;
		for(int i=0;i<words.length;i++){
			for(int j=i+1;j<words.length;j++){
				StringBuilder sb = new StringBuilder(words[j]);
				if(words[i].equals(sb.reverse().toString())){
					count++;
				}
			}
		}
		return count;
	}

	@Test
	public void test1() {

		Assert.assertEquals(2, maximumNumberOfStringPairs(new String[] {"cd","ac","dc","ca","zz"}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(1, maximumNumberOfStringPairs(new String[] {"ab","ba","cc"}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(0, maximumNumberOfStringPairs(new String[] {"aa","ab"}));
	}
}
