package mandatoryHomeWork.octWeek1Algo;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct4PangramRedo {
	
	//ip: String
	//op: boolean
	//Logic: init hash set
	//1. Run a for loop to add all elements in set
	//return if size of set is 26
	//TC: O[N] ; SC : O[N]
	
	public boolean checkIfPangram(String sentence) {
        Set<Character> s = new HashSet<>();
        for(char ch: sentence.toCharArray()){
            s.add(ch);
        }
     return s.size()==26;   
    }
	
	@Test
	public void test1() {
		Assert.assertEquals(false, checkIfPangram("qwertyuioplkjhgfdsazxvvbnm"));
	}
	@Test
	public void test2() {
		Assert.assertEquals(true, checkIfPangram("qwertyuiopasdfghjklmmnbvcxzzyjdsttwxyc"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(true, checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}

	@Test
	public void test4() {
		Assert.assertEquals(false, checkIfPangram("zoomcarzumbabumba"));
	}

}
