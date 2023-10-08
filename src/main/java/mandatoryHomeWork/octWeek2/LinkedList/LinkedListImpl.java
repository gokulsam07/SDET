package mandatoryHomeWork.octWeek2.LinkedList;

public class LinkedListImpl {

	private Node head;
	private Node tail;
	private int size;
	public LinkedListImpl() {
		head = null;
		tail = null;
		size=0;
	}
	//add at tail - new node
	
	public void add(int data) {
		if (head == null) {
			head=tail=new Node(data);
		} else {
			tail.next = new Node(data);
			tail = tail.next;
		}
		size++;
	}
//return size of ll
	public int size() {
		return size;
	}
	//remove element in ll
	public void remove() {
		size--;
	}
	
	
	
	
	

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}





	public static void main(String[] args) {
		LinkedListImpl sll = new LinkedListImpl();
		sll.add(0);
		sll.add(1);
		sll.add(2);

		System.out.println(sll.size());


	}

}
