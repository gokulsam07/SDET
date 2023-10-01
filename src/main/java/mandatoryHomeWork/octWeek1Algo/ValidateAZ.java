package mandatoryHomeWork.octWeek1Algo;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class ValidateAZ {
	
	public boolean validate1(String s) {
		int[] freq = new int[26];
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
		    if (c >= 'a' && c <= 'z')
			freq[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]<1) {
				return false;
			}
		}
		return true;
	}
	
	public boolean validate(String s) {
		HashSet<Character> hs = new HashSet<>();
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
		    if (c != ' ') {
		        hs.add(c);
		    }
		}
			
		return hs.size() == 26;
	}
	@Test
	public void test1() {
		Assert.assertEquals(true, validate("abcdefghi jklmnopq r stuvwxyz"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, validate("hellowwordthissimydrama"));
	}

	
}
