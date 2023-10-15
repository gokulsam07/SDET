package mandatoryHomeWork.octWeek3;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.Assert;
import org.junit.Test;


public class LCHWOct16_Baseball {
	
	//ip: String[] 
	//op : int
	//Logic ; init Int Queue
	//Iterate all the elements in Str[]
	// if the str equals C, pop dq, equals D double the peek value and push to dq
	//if equals +, pop and store the val, peek and store the val, add both, push the popped val and the added one (in that order)
	// in all other conditions, it will be int ,so parse and add to dq
	//Till the dq becomes empty, pop the values & add to sum
	//return sum
	//SC:O[N]; TC:O[N]
	public int calPoints(String[] operations) {
	      Deque<Integer> dq = new ArrayDeque<>();
	        for (String s : operations) {
	            if (s.equals("C")) {
	                 dq.pop();
	            } else if (s.equals("D")) {
	                    dq.push(2 * dq.peek());
	            } else if (s.equals("+")) {
	                    int prev = dq.pop();
	                    int prev2 = dq.peek();
	                    int add = prev + prev2;
	                    dq.push(prev);
	                    dq.push(add);
	            } else {
	                dq.push(Integer.parseInt(s));
	            }
	        }

	        int sum = 0;
	        while (!dq.isEmpty()) {
	            sum += dq.pop();
	        }
	        
	        return sum;
	    }
	
	@Test
	public void test1() {
		Assert.assertEquals(13, calPoints(new String[] {"5","2","6"}));
	}

	@Test
	public void test2() {

		Assert.assertEquals(30, calPoints(new String[] {"5","2","C","D","+"}));
	}

	@Test
	public void test3() {

		Assert.assertEquals(0, calPoints(new String[] {"1","C"}));
	}

	@Test
	public void test4() {

		Assert.assertEquals(27, calPoints(new String[] {"5","-2","4","C","D","9","+","+"}));
	}

}
