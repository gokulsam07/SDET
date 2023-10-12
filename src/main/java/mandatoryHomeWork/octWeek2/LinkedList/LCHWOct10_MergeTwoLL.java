package mandatoryHomeWork.octWeek2.LinkedList;

public class LCHWOct10_MergeTwoLL {
	
	//ip :LL ,LL
//op :LL
	//Logic - assign list1 to current1 & same for two
	//init a new LL with zero for result and assign result to current 
	//1. Run a while loop till either current1 or current2 is not null
	// if the current1 equals null assign current2.next to current and same for current2
	
	//main logic
		//if the current1.val<=current2.val assign current1.val to current & set current1.next as current 
	// else do the same for current2.next=current2
	// modify current.next as current
	//return result.next (first node will have zero, so start from the next node
	//TC: O[N], SC: O[n]
	public class ListNode{
		ListNode next;
		int val;
		
		public ListNode(int data) {
			this.val=data;
			this.next=null;
		}
	}
	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode current1 = list1;
	    ListNode current2 = list2;
	    ListNode result = new ListNode(0); 
	    ListNode current = result;

	    while (current1 != null || current2 != null) {
	        if (current1 == null) {
	            current.next = current2;
	            break;
	        } else if (current2 == null) {
	            current.next = current1;
	            break;
	        }

	        if (current1.val <= current2.val) {
	            current.next = current1;
	            current1 = current1.next;
	        } else {
	            current.next = current2;
	            current2 = current2.next;
	        }

	        current = current.next;
	    }

	    return result.next; 
	    }
	

}
