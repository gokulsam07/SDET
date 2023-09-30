package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz {
	
	 //ip: int
    //op: List<String>
    //Logic : init AL
    //1. Run a for loop till last element
    //2. check if the num is div by 5 & 3 and store result in separate boolean
    //3 In if else ladder, check if it is div by 3, div by 5 and by both and nothing - add string as per rule
    //return list
    //TC: O[n] , SC: o{n}
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        for (int num = 1; num <= n; num++) {
            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            if (divisibleBy3 && divisibleBy5) {
                ans.add("FizzBuzz");
            } else if (divisibleBy3) {
                ans.add("Fizz");
            } else if (divisibleBy5) {
                ans.add("Buzz");
            } else {
                ans.add(Integer.toString(num));
            }
        }
        return ans;
    }
	@Test
	public void tst1() {
		Assert.assertEquals(Arrays.asList("1","2","Fizz"), fizzBuzz(3));
	}
	@Test
	public void tst2() {
		Assert.assertEquals(Arrays.asList("1","2","Fizz","4","Buzz"), fizzBuzz(5));
	}
	@Test
	public void tst3() {
		Assert.assertEquals(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"), fizzBuzz(15));
	}
    

}
