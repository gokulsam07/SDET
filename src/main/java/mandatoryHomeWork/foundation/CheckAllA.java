package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class CheckAllA {

	//Input: string with a & b or a or b
	//Output: true of false
	//Logic:
	//1. if the index of b ==-1 return true since there is no b
	//2. if the lastIndexOf a is less than indexOf b, return true else false

	public boolean isTrue(String s) {
		if(s.indexOf('b')==-1) {
			return true;
		}
		return (s.lastIndexOf('a')<s.indexOf('b'))?true:false;
	}


	@Test
	public void tst1() {
		Assert.assertEquals(true, isTrue("aabb"));
	}

	@Test
	public void tst2() {
		Assert.assertEquals(false, isTrue("abab"));
	}
	@Test
	public void tst3() {
		Assert.assertEquals(true, isTrue("bbb"));
	}

	@Test
	public void tst4() {
		Assert.assertEquals(true, isTrue("a"));
	}
}
