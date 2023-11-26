package mandatoryHomeWork.weekendCrash1;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class RansomNoteConstruction {
	
	//ip: String, String
	//op: bool
	// Logic -- init freq []
	//1. Add freq of mag to freq[]
	//2. Check if the char of rans is present in freq[], if not return false
	//3. reduce the freq[] using char of rans
	//return true
	//TC & SC :O(n) & O(1)
	
	@Test
	public void test1() {
		Assert.assertEquals(true, canConstruct("john","johanna"));
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, canConstruct("johannna","johanna"));
	}
	@Test
	public void test3() {
		Assert.assertEquals(true, canConstruct("b","ab"));
	}
	
	public boolean canConstruct1(String rans, String mag) {
		if(rans.length()>mag.length()) return false;
		int[] freq = new int[26];
		for(int i=0;i<mag.length();i++) {
			freq[mag.charAt(i)-'a']++;
		}
		for(int i=0;i<rans.length();i++) {
			if(freq[rans.charAt(i)-'a']==0) return false;
			freq[rans.charAt(i)-'a']--;
		}
		return true;
	}
	
	public boolean canConstruct(String rans, String mag) {
		if(rans.length()>mag.length()) return false;
		HashMap<Character,Integer> hm = new HashMap<>();
		for(char ch: mag.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		for(char ch: rans.toCharArray()) {
			if(hm.get(ch)==null||hm.get(ch)<1) return false;
			hm.put(ch, hm.getOrDefault(ch, 0)-1);
		}
		return true;
	}

}
