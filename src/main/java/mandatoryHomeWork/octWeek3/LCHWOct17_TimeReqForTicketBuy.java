package mandatoryHomeWork.octWeek3;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Assert;
import org.junit.Test;

public class LCHWOct17_TimeReqForTicketBuy {

	//ip: int[] , int
	//op:int
	//Logic : init time;
	// Iterate all the elements of int[] till ticket[k] becomes zero
	//reduce the value of each element by 1 , when the k element becomes zero, break
	// if other elements become ,0, skip it
	// add time in all other cases
	// return time+1
	//TC: o[N2]; SC;O[k]
	  public int timeRequiredToBuy1(int[] tickets, int k) {
	        int time=0;
	        while(tickets[k]!=0){
	             for(int i=0;i<tickets.length;i++){
	                tickets[i]--;
	                if(tickets[k]==0)break;
	                if(tickets[i]<0)continue;
	                time++;
	            }
	        }
	        return time+1;
	    }
	  //ip: int[], int 
	  //op: int
	  //Logic : init Int queue
	  //1. add the index of int[] to q
	  // Run the below till q is not empty
	  	//2. remove the value in queue, reduce the value in the index by 1 
	  //3. add time
	  //4. if the ticket's index is zero and the index equals k, return the time
	  //5. if the ticket value at polled index is gt 0, offer to q again
	  
	  //TC & SC :O[N]
	  
	public int timeRequiredToBuy(int[] tickets, int k) {
		 Queue<Integer> q = new ArrayDeque<>();
	        for(int i=0;i<tickets.length;i++){
	            q.offer(i);
	        }
	        int time=0;
	       while(!q.isEmpty()){
	           int index = q.poll();
	           tickets[index]--;
	           time++;
	        if(tickets[index]==0&&index==k){
	             return time;
	        }
	        if(tickets[index]>0){
	            q.offer(index);
	        }
	       }
	        return time;
	}
	@Test
	public void test() {
		Assert.assertEquals(3, timeRequiredToBuy(new int[] {1,1,1},2));
	}
	@Test
	public void test1() {
		Assert.assertEquals(20, timeRequiredToBuy(new int[] {7,4,3,6},0));
	}
	@Test
	public void test2() {
		Assert.assertEquals(8, timeRequiredToBuy(new int[] {5,1,1,1},0));
	}
	@Test
	public void test3() {
		Assert.assertEquals(18, timeRequiredToBuy(new int[] {3,2,7,8},2));
	}
}
