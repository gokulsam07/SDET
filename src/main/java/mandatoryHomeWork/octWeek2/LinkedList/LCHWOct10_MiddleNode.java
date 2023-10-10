package mandatoryHomeWork.octWeek2.LinkedList;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct10_MiddleNode {
	
	//ip: LL
	//op : LL
	//Logic
	//1. if the head is null, return as is
	//2. Check the number of elements in LL by using index init as 0
	//3. Using ternary op, set the middle index for odd or even len
	//4. Iterate LL till the iteration meets the resIndex , till then set the next head as head
	// when it meets return the head
	//TC: O[N], SC: O[1]
	
	public class ListNode{
		ListNode next;
		int data;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	  public ListNode middleNode(ListNode head) {
	        if (head == null) {
	        return null; 
	    }
	        int index=0;
	        ListNode current =head;
	        while(current.next!=null){
	            index++;
	            current = current.next;
	        }
	        int resIndex = (index%2==0) ? index/2 : (index/2) +1;

	        int counter=0;
	        while(head.next!=null){
	           head = head.next;
	            counter++;
	            if(counter==resIndex){
	                return head;
	            }
	        }
	        return head;
	    }
	  
	  
	  @Test
		 public void test1() {
		  ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);
	        head.next.next.next.next.next = new ListNode(6);
	        Assert.assertEquals(head.next.next.next, middleNode(head));
		 }
		 @Test
		 public void test2() {
			 ListNode head = new ListNode(1);
		        head.next = new ListNode(2);
		        head.next.next = new ListNode(3);
		        head.next.next.next = new ListNode(4);
		        head.next.next.next.next = new ListNode(5);

		        Assert.assertEquals(head.next.next, middleNode(head));
		 }

		 @Test
		 public void test3() {
			 ListNode head =null;
		     Assert.assertEquals(null, middleNode(head));
		 }

}
