package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class SplitStringAlike {

	//Input: String of even length
	//Output: true or false
	//Logic
	//1. Use substring to split the given string into first half and second half and store in char[]  a & b
	//2. Iterate the for loop till the length of any one of the array(same size for both since they are equal size)
	//3. check if a[i] contains vowels in both lower & upper case and do the same for b char[] too (since same size, no need for another loop)
	//4. If there's a vowel increment the counter
	//5. return count1==count2

	public boolean splitStr(String s) {
		int count1=0,count2=0;
		char[] a = 	s.substring(0, (s.length()/2)).toCharArray();
		char[] b = s.substring((s.length()/2)).toCharArray();


		for (int i = 0; i < a.length; i++) {
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U') {
				count1++;
			}
			if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'||b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U') {
				count2++;
			}
		}

		return count1==count2;
	}

	@Test
	public void tst1() {
		Assert.assertEquals(true, splitStr("BoOk"));
	}

	@Test
	public void tst2() {
		Assert.assertEquals(false, splitStr("textbook"));
	}

}
