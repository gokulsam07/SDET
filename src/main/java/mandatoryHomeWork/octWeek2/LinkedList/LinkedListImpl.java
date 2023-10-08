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
	public void remove(int index) {
		if (index < 0 || index >= size) return;

		else if (index == 0) head = head.next;
		else {
			int currentIndex = 0;
			Node currentNode = head;
			Node previousNode = head;

			while (currentNode != null) {
				if (currentIndex++ == index) {
					previousNode.next = currentNode.next;
					break;
				}
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
		}
		size--;
	}
	
	public void removeAll() {
		head=tail=null;
		size=0;
	}
	
	public LinkedListImpl clone() {
		LinkedListImpl clone = new LinkedListImpl();
		Node currentNode = head;
		while (currentNode != null) {
			clone.add(currentNode.data);
			currentNode = currentNode.next;
		}
		return clone;
	}
	
	
	
	 public void addAllElements(int[] arr) {
	        for (int num : arr) {
	           add(num);
	        }
	    }
	 
	 public void display() {
			Node currentNode = head;
			while (currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
			System.out.println();
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
//		sll.add(0);
//		sll.add(1);
//		sll.add(2);
//
//		System.out.println(sll.size());
		
		
		
		sll.addAllElements(new int[] {5,6,7,8,9,1});
		sll.remove(1);
		sll.display();
		//System.out.println(sll.size());
		LinkedListImpl clone = sll.clone();
		System.out.println(clone.size());
		sll.removeAll();
		System.out.println(sll.size());

	}

}
