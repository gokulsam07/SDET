package mandatoryHoweWork.septAlgos;

import org.junit.Test;
import org.testng.Assert;

public class Sep20CW_MarryAlgo {

	//ip: String, String
	//op: String
	//Logic
	//1. Init flag=false, sb for man and woman, length of man & woman

	//2. if the lengths are equal the content of string should be equal, if yes, set flag as true

	//3. if m<w, run a for loop for the woman length, remove the charAt(i), check if the string contains man after removal, if yes flag=true
	//4. else insert the removed char in same place and run till the last char

	//5. repeat the same by reversing man with woman & vice versa when w<m

	//return flag?"YES":"NO";

	//Time complexity -- O[N] -- N - larger length string length

	public String isEligible(String man, String woman) {
		boolean flag = false;
		StringBuilder sbm = new StringBuilder(man);
		StringBuilder sbw = new StringBuilder(woman);
		int m =man.length();
		int w =woman.length();
		if(m==w) {
			if(man.equals(woman)) {
				flag=true;
			}
		}

		if(m<w) {
			for (int i = 0; i < w; i++) {
				sbw.deleteCharAt(i);
				if(sbw.toString().contains(man)) {
					flag=true;
					break;
				}
				else {
					sbw.insert(i,woman.charAt(i));
				}
				
			}
		}
		
		
		if(w<m) {
			for (int i = 0; i < m; i++) {
				sbm.deleteCharAt(i);
				if(sbm.toString().contains(woman)) {
					flag=true;
					break;
				}
				else {
					sbm.insert(i,man.charAt(i));
				}
				
			}
		}
		return (flag)? "YES":"NO";
	}
	
	
	
	@Test
	public void test1() {
		Assert.assertEquals("YES", isEligible("john","johanna"));
	}

	@Test
	public void test2() {
		Assert.assertEquals("YES", isEligible("ira","ira"));
	}

	@Test
	public void test3() {
		Assert.assertEquals("NO", isEligible("kayla","jayla"));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals("YES", isEligible("meiyan","yan"));
	}
	
	@Test
	public void test5() {
		Assert.assertEquals("YES", isEligible("priyan","priya"));
	}


}
