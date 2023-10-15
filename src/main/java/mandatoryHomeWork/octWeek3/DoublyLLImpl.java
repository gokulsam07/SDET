package mandatoryHomeWork.octWeek3;


public class DoublyLLImpl {
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode prev;
		
		public ListNode(int val) {
			this.val=val;
			this.next=null;
			this.prev=null;
		}
	}
	
	private ListNode head;
	private ListNode tail;
	private int size;
	
	public DoublyLLImpl() {
		head = null;
		tail = null;
		size=0;
	}
	
	public void addLast(int val) {
		 ListNode newNode = new ListNode(val);
	        if (tail == null) {
	            head = tail = newNode;
	        } else {  
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
		size++;
	}
	
	public void addFirst(int val) {
		 ListNode newNode = new ListNode(val);
	        if (head == null) {
	            head = tail = newNode;
	        } else {  
	        	newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
		size++;
	}
	
	
	public void removeFirst() {
		if(head==null) return;
		if(head==tail) {
			head=tail=null;
		}
		else {
			head=head.next;
			head.prev=null;
		}
		size--;
	}
	
	public void removeLast() {
		if(tail==null) return;
		if(head==tail) {
			head=tail=null;
		}
		else {
			tail=tail.prev;
			tail.next = null;
		}
		size--;
	}

	public void display() {
	    ListNode current = head;
	    while (current != null) {
	        System.out.print(current.val + " ");
	        current = current.next;
	    }
	    System.out.println(); 
	}

}
