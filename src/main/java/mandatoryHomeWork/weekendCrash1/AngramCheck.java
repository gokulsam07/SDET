package mandatoryHomeWork.weekendCrash1;
import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class AngramCheck {
	
	//ip: String, String
	//op: bool
	//logic - init hm <char, int>
	// Iterate and add all the char to hm 
	// In second loop, reduce the count if already present, if count is zero, remove the char from map
	//check if hm is empty
	//TC & SC :O(n)
	@Test
	public void anaCheckTest1() {
		Assert.assertEquals(false, checkAnagram("silent","listeN"));
	}@Test
	public void anaCheckTest2() {
		Assert.assertEquals(false, checkAnagram("anagram","nagaram"));
	}@Test
	public void anaCheckTest3() {
		Assert.assertEquals(false, checkAnagram("rooob","boor"));
	}
	public boolean checkAnagram(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		HashMap<Character,Integer> hm = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			hm.put(s1.charAt(i), hm.getOrDefault(hm, 0)+1);
		}
		for (int i = 0; i < s2.length(); i++) {
			hm.put(s2.charAt(i), hm.getOrDefault(hm, 0)-1);
			if (hm.get(s2.charAt(i))==0) {
				hm.remove(s2.charAt(i));
            }
		}
		return hm.isEmpty();
	}

}
