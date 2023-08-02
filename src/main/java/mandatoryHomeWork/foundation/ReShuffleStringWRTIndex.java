package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class ReShuffleStringWRTIndex {

	//Input: String, int []
	//Output:, Reshuffled String
	//Logic: 
	// 1. Creat a char[] of size s.length()
	//3. Iterate in a for loop till the size of int[]
	//4. store the charAt(i) in fin[index[i]]
	//5. return string

	public String shuffle(String s, int[] index) {

		char[] fin = new char[s.length()];

		for (int i = 0; i < index.length; i++) {
			fin[index[i]]=s.charAt(i);
		}

		return new String(fin);
	}

	@Test
	public void tst1() {

		Assert.assertEquals("leetcode", shuffle("codeleet",new int[] {4,5,6,7,0,2,1,3}));
	}

	@Test
	public void tst2() {

		Assert.assertEquals("abc", shuffle("abc",new int[] {0,1,2}));
	}
}
