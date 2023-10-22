package mandatoryHomeWork.octWeek3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class LCHWOct20_FolderReturn {
	
	//ip: String[]; op:int
	//Logic : init size
	//Iterate all the elements in str[]
	//1. if it equls ./ -- no ops
	//2. if it equls ../ and size gte 0, reduce size
	//3. inc size in all other case
	// return size
	//TC O[N], SC O[k]
	public int minOperations(String[] logs) {
	      int size=0;
	        for (String s : logs) {
	            if (s.equals("./")) {
	            } else if (s.equals("../")) {
	                if (size>0){
	                    size--;
	                }
	            } else {
	                size++;
	            }
	        }
	        return size;
	    }
	
	@Test
	public void test() {
		Assert.assertEquals(2, minOperations(new String[] { "d1/","d2/","../","d21/","./" }));
	}

	@Test
	public void test1() {
		Assert.assertEquals(3, minOperations(new String[] { "d1/","d2/","./","d3/","../","d31/" }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(0, minOperations(new String[] { "d1/","../","../","../" }));
	}
}
