package mandatoryHomeWork.octWeek2.LinkedList;


public class LCHWOct12_Intersection {
	
	//ip: LL
	//op :LL
	//Logic
	//1. if either of the heads are null return null
		//Assign headA to curr1 and same for headB to curr2
	//2. iterate the LL till they are not equal
	//3. if curr1 is null set curr1 as headA; else set curr1.next to curr1
	//do the same with curr2 and headB
	
	//return curr1
	//SC:O[N]; TC:O[M+N]
	
	
	public class ListNode{
		int val;
		ListNode next;
		public ListNode(int data) {
			this.val=data;
			this.next=null;
		}
	}
	
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        if(headA == null || headB == null) return null;
	        ListNode curr1 = headA;
	        ListNode curr2 = headB;
	        while(curr1!=curr2){
	            if(curr1==null){
	                curr1=headA;
	            }
	            else{
	                curr1=curr1.next;
	            }
	            if(curr2==null){
	                curr2=headB;
	            }
	            else{
	                curr2=curr2.next;
	            }
	        }
	        return curr1;
	    }
	 
	 //Leetcode efficient solution
	 
	 public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
		    //boundary check
		    if(headA == null || headB == null) return null;
		    
		    ListNode a = headA;
		    ListNode b = headB;
		    
		    //if a & b have different len, then we will stop the loop after second iteration
		    while( a != b){
		    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
		        a = a == null? headB : a.next;
		        b = b == null? headA : b.next;    
		    }
		    
		    return a;
		}
}
