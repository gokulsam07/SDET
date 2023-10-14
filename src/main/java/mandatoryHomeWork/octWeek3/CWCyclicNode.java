package mandatoryHomeWork.octWeek3;
import java.util.HashSet;


public class CWCyclicNode {
	
	//ip: LL
	//op: boolean
	//Logic : init hashset for ListNode
	//1. Add all the elements to hs
	//2. check if the add returns false anywhere, if yes retur true else false
	// TC: O[N]; SC :O[N]
	
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
	 public boolean hasCycle(ListNode head) {
	        if(head==null||head.next==null){
	            return false;
	        }
	        HashSet<ListNode> hs = new HashSet<>();
	        ListNode curr= head;
	        while(curr.next!=null){
	            if(!hs.add(curr)){
	                return true;
	            }
	            curr=curr.next;
	        }
	        return false;
	    }
	 

}
