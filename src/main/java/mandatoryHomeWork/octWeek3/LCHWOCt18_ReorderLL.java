package mandatoryHomeWork.octWeek3;

import java.util.Stack;

public class LCHWOCt18_ReorderLL {
	public class ListNode{
		int val;
		ListNode next;
	}
	public void reorderList(ListNode head) {
        Stack<ListNode> nodeStack = new Stack<>();
        ListNode current = head;
        while(current != null) {
            nodeStack.push(current);
            current = current.next;
        }
        ListNode first = head;
        ListNode second = head.next; 
  
        if(second == null || second.next == null){
            return;
        }
        for(int i = 0; i < nodeStack.size()-1; i++){
            if(second!=null){
                if(second.next == null){
                    break;
                }
                ListNode last = nodeStack.pop();
                first.next = last;
                last.next = second; 
                nodeStack.peek().next = null; 
                first = second; 
                second = second.next; 
            } 
        }
    }
}
