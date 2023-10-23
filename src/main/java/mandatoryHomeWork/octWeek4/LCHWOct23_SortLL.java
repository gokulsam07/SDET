package mandatoryHomeWork.octWeek4;

import java.util.Arrays;

public class LCHWOct23_SortLL {
	
	//ip & op: LL
	//logic: count no of LL nodes using var count
	//init int[] of size count
	// assign all values to int[] by iterating the LL
	// sort int[]
	// assign back values to LL
	//TC & SC : O[N]
	
	public class ListNode{
		int val;
		ListNode next;
	}
	
	  public ListNode sortList(ListNode head) {
	        ListNode current =head;
	        int count =0;
	        while(current!=null){
	            count++;
	            current=current.next;
	        }

	        int[] arr = new int[count];
	        int i=0;
	        current=head;
	        while(current!=null){
	            arr[i++]=current.val;
	            current=current.next;
	        }
	        Arrays.sort(arr);
	        int j=0;
	        current=head;
	        while(current!=null){
	            current.val=arr[j];
	            j++;
	            current=current.next;
	        }
	        return head;
	    }

}
