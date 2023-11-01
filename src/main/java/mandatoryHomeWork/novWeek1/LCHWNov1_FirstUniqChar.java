package mandatoryHomeWork.novWeek1;

import org.junit.Assert;
import org.junit.Test;

public class LCHWNov1_FirstUniqChar {
//ip: String
	//op: int
	//Logic
	//1. Convert str to charArray and lopp thru
	//2. Check if the index & last index of the char is same, if yes return the index
	//return -1 
	//TC :O[N], SC:O[k]
	
	public int firstUniqChar(String s) {
        for(char ch: s.toCharArray()){
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                return s.indexOf(ch);
            }
        }
      return -1;
   }
	@Test
	public void test() {
		Assert.assertEquals(0, firstUniqChar("baaapu"));
	}
	@Test
	public void test1() {
		Assert.assertEquals(4, firstUniqChar("aappkiimaan"));
	}
	@Test
	public void test2() {
		Assert.assertEquals(-1, firstUniqChar("dimmid"));
	}
	@Test
	public void test3() {
		Assert.assertEquals(0, firstUniqChar("dimwit"));
	}

}
