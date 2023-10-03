package mandatoryHomeWork.octWeek1Algo;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct3JewelRedo {
	//ip: string, string
	//op: int
	//Logic init set, count
	//1. Iterate all elements of string j & add to set
	//2. Iterate all elements of stone & add to set
	//3. when the set contains char inc counter
	//return count
	//TC: O[N2], SC:O[N]
	
	public int jewelStone(String j, String s) {
		int count=0;
		
		HashSet<Character> set = new HashSet<>();
		for(char ch: j.toCharArray()) {
			set.add(ch);
		}
		for(char ch: s.toCharArray()) {
			if(set.contains(ch))count++;
		}
		return count;
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(3, jewelStone("aA", "zumbAAa"));
	}
	@Test
	public void test2() {
		Assert.assertEquals(0, jewelStone("A", "booomma"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(0, jewelStone("zupp", "ZUPP"));
	}
	@Test
	public void test4() {
		Assert.assertEquals(7, jewelStone("zZ", "ZZZZzzz"));
	}
}
