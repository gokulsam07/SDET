package mandatoryHomeWork.weekendCrash;

import org.junit.Test;
import org.testng.Assert;

public class StringEquivalent {
	//ip: String[], String[]
	//op: boolean
	//Logic --> Init two string builder
	//1. Iterate and append to sb1 -> String[] first
	//2. Repeat the same for second 
	//Convert t0 String and check if both are equal
	//TC & SC:O(n)
	
	@Test
	public void strEqlsTest() {
		Assert.assertEquals(true, arrayStringsAreEqual(new String[] {"ab", "c"}, new String[] {"a","bc"}));
	}
	@Test
	public void strEqlsTest1() {
		Assert.assertEquals(false, arrayStringsAreEqual(new String[] {"ac", "b"}, new String[] {"a","bc"}));
	}
	@Test
	public void strEqlsTest2() {
		Assert.assertEquals(true, arrayStringsAreEqual(new String[] {"abc", "d", "defg"}, new String[] {"abcddefg"}));
	}
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 =new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String s:word1){
            sb1.append(s);
        }
        for(String s:word2){
            sb2.append(s);
        }
        return new String(sb1).equals(new String(sb2));
    }

}
