package mandatoryHomeWork.octWeek2.LinkedList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LCHWOct12_RotateLL {
	
	//ip & op :LL
	//Logic - if head, head next is null or no rotation needed return the LL as is
	//1.Take the head as current and previous and null;
	//2. Run a while loop till k>0
		//3. Run nested while till current.next!=null; assign current to previous and current.next to current
		//4. Once inner loop completes, assign head to temp, current to head and build relation b/w temp and next head
		//5. set previous's next as null (tail null to avoid circular looping in successive iterations), reduce k by 1
	//return head
	
//SC: O[k], TC : O[N*K] -- k rotations, N - traversing each LL 
	
	public class ListNode{
		ListNode next;
		int val;
		public ListNode() {
			
		}
		public ListNode(int data) {
			this.val=data;
			this.next=null;
		}
	}
	
	 public ListNode rotateRight(ListNode head, int k) {
         if (head == null || k == 0 || head.next ==null) {
        return head;
    }
        ListNode current = head;
        ListNode previous = null;
        ListNode temp=null;
        while(k>0){
           while(current.next!=null){
               previous=current;
               current=current.next;    
           } 
            temp = head;
           head=current;
           head.next=temp;
           previous.next=null;
           k--;
        }
        return head;
    }
	 
	 //efficient solution
	 public ListNode rotateRight1(ListNode head, int k) {
         if (head == null || k == 0 || head.next ==null) {
        return head;
    }
    int length = 1;
    ListNode current = head;
    while (current.next != null) {
        current = current.next;
        length++;
    }
    k = k % length;
     if (k == 0) {
        return head; 
    }
   
    ListNode tail = head;
    for (int i = 1; i < length - k; i++) {
        tail = tail.next;
    }

    ListNode newHead = tail.next;
    tail.next = null;
    current.next = head; 

    return newHead;
}
	 
	 
	 @Test
	    public void testRotateRight_EmptyList() {
	        ListNode head = null;
	        int k = 3;
	        ListNode rotated = rotateRight(head, k);
	        assertEquals(null, rotated);
	    }

	    @Test
	    public void testRotateRight_SingleNodeList() {
	        ListNode head = new ListNode(1);
	        int k = 2;
	        ListNode rotated = rotateRight(head, k);
	        assertEquals(1, rotated.val);
	        assertEquals(null, rotated.next);
	    }

	    @Test
	    public void testRotateRight_KEqualToListLength() {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        int k = 3;
	        ListNode rotated = rotateRight(head, k);
	        assertEquals(1, rotated.val);
	        assertEquals(2, rotated.next.val);
	        assertEquals(3, rotated.next.next.val);
	        assertEquals(null, rotated.next.next.next);
	    }

	    @Test
	    public void testRotateRight_RotateOnce() {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        int k = 1;
	        ListNode rotated = rotateRight(head, k);
	        assertEquals(3, rotated.val);
	        assertEquals(1, rotated.next.val);
	        assertEquals(2, rotated.next.next.val);
	        assertEquals(null, rotated.next.next.next);
	    }

	    @Test
	    public void testRotateRight_RotateMultipleTimes() {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        int k = 2;
	        ListNode rotated = rotateRight(head, k);
	        assertEquals(3, rotated.val);
	        assertEquals(4, rotated.next.val);
	        assertEquals(1, rotated.next.next.val);
	        assertEquals(2, rotated.next.next.next.val);
	        assertEquals(null, rotated.next.next.next.next);
	    }
}
