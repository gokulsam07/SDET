package mandatoryHomeWork.foundation;

import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class EachCharOccur {

	//ip:String
	//op: int
	//Logic : init HM 
	//1. Run till the last element
	//2. If the char is already present inc count 
	//3. else set it to 1
	// return map

	public String eachOccur(String s) {
		HashMap<Character,Integer> hm = new HashMap<>();

		for(int i=0;i<s.length();i++) {
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
		}
		return hm.toString();

	}

	@Test
	public void test1() {
		Assert.assertEquals("{a=2, s=2, c=1, e=2, v=1, g=1, h=1, n=1}", eachOccur("savechanges"));
	}

	@Test
	public void test2() {
		Assert.assertEquals("{r=1, d=1, e=1, w=1, h=1, l=3, o=2}", eachOccur("helloworld"));
	}

	@Test
	public void test3() {
		Assert.assertEquals("{p=1, a=2, b=1, t=2, g=1, i=3, z=1, n=1}", eachOccur("zipitnitabag"));
	}
}
