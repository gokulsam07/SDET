package mandatoryHomeWork.octWeek2.LinkedList;

public class LCHWOct12_DecimalAdd {
	//ip: LL
	//op: int
	//Logic : check the length of the node using length var
	//1. Assign current node as head
	//2. Iterate till last node, add current value * 2 power length
	// decrement length
	// return result
	//TC: O[N], SC: O[1]
	
	public class ListNode{
		int val;
		ListNode next;
		public ListNode(int data) {
			this.val=data;
			this.next=null;
		}
	}
	
	
	 public int getDecimalValue(ListNode head) {
	       int length = 0;
	       int result = 0;
	        ListNode current = head;
	        while(current!=null){
	            length++;
	            current = current.next;
	        }
	        length--;
	        current=head;
	        while(current!=null){
	            result += current.val * Math.pow(2, length--);
	            current = current.next;
	        }
	        return result;
	    }

}
