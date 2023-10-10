package mandatoryHomeWork.octWeek2.LinkedList;


public class LCHWOct11_RemoveDuplicates {
	
	//ip: LL
	//op :LL
	//Logic --init head to current node
	//Run the LL till current node and next node is not null
	//1. if the current value and next value are equal, assign next's next reference to next
	//2. else assign next reference to current
	//return head
	//TC: O[N];SC:O[1]
	
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
	
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode previous =null;
        while(current!=null&&current.next!=null){
                if(current.next.val==current.val){
                    current.next=current.next.next;
                }
                else{
                    current=current.next;
                }
                
        }
        return head;
    }

}
