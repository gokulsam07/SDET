package mandatoryHomeWork.weekendCrash4;

import org.junit.Test;

public class LinkedListImp {

    @Test
    public void testReverse() {
        LinkedListImp ll = new LinkedListImp();
        ll.addNode(10);
        ll.addNode(11);
        ll.addNode(12);
        ll.addNode(13);
    //    ll.print();
        ll.head = ll.reverse(ll.head);
        ll.print();
    }

    public class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            next = null;
        }
    }

    private Node head;
    private Node tail;

    public LinkedListImp() {
        head = null;
        tail = null;
    }

    public void addNode(Object data) {
        if (head == null) {
            head = tail = new Node(data);
        } else {
            tail.next = new Node(data);
            tail = tail.next;
        }
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head; //10 -- 11 12 13
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; 
    }
}
