package mandatoryHomeWork.novWeek1;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.Assert;
import org.junit.Test;

public class LCHWOct1_isLongPressed {
	//ip: String, String
	//op: int
	//Logic Init ArrayDeque char and pass all char in name to it
	//init char check = ' '
	//1. Run a for loop till len of typed
	//2. If the dq is not empty AND charAt(i) of typed eqls value in head of dq, poll the dq and store in check
	//3. else if check if check != ' ' AND check eqls  charAt(i) of typed, continue the loop
	//4. all other return false
	// return dq.isEmpty();
	
	//TC & SC: O[N]
	 public boolean isLongPressedName(String name, String typed) {
	       Queue<Character> dq = new ArrayDeque<>();
	    for(char ch: name.toCharArray()) {
	      dq.offer(ch);
	    }
	    
	    char check = ' ';
	    for(int i = 0; i < typed.length(); i++) {
	      if (!dq.isEmpty() && typed.charAt(i) == dq.peek()) {
	        check = dq.poll();
	      } else if (check != ' ' && check == typed.charAt(i)) {
	        continue;
	      } else {
	        return false;
	      }
	    }
	    return dq.isEmpty();
	    }
	 
	 @Test
		public void test() {
			Assert.assertEquals(true, isLongPressedName("alex","aaleex"));
		}
		@Test
		public void test1() {
			Assert.assertEquals(false, isLongPressedName("saeed","ssaaedd"));
		}
}
