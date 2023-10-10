package mandatoryHomeWork.octWeek2.LinkedList;


public class LCHWOct9_removeAllValue {
	
	//ip: LinkedList
	//op: LinkedList
	//Logic : if the LL is empty return it -- for no value in LL
	//1. If head is null and next equals val , assign next node to head -- for value in head of LL
	// assign head to current & null to previous
	//2. Iterate till current ele is !=null
	//3. if the current value equals value and previous is not null, link next and previous reference
	//4. if the current value is not equal,set current to previous and move the next to current
//return head
	
	//TC: O[N]; SC: O[1]
	
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
	public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        while(head!=null&&head.val==val) head= head.next;
        ListNode current = head;
        ListNode previous =null;
        while(current!=null){
            if(current.val==val){
                if (previous != null) {
                     previous.next = current.next;
                }
            }
            else{
                previous=current;
            }
            current=current.next;
        }
        return head;
    }
	

}
