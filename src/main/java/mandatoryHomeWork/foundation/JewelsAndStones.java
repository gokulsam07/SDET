package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStones {

	//Input: Get stone and jewels (case sensitive)
	//Output: count of stones in jewel
	//Logic: 
	//1.Initialize a counter
	//2. In a for each loop, iterate the ch in stone by turning it to char[]
	//3. In a nested index based for loop, run the loop till index<length of jewel array 
	//4.  check if the char in the jewel array contains the char in stone
	//5. increment count if yes and return it outside loop

	public int findJewel(String s, String j) {
		int count =0;
		for (char stone : s.toCharArray()) {
			for (int i = 0; i < j.length(); i++) {
				if(j.charAt(i)==stone) {
					count++;
				}
			}
		}
		return count;
	}

	@Test
	public void tst1() {
		Assert.assertEquals(3, findJewel("aA","aAAbbbb"));
	}

	@Test
	public void tst2() {
		Assert.assertEquals(0, findJewel("z","ZZ"));
	}

}
