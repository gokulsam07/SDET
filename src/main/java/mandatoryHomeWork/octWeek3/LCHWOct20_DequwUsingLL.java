package mandatoryHomeWork.octWeek3;

public class LCHWOct20_DequwUsingLL {

    private class Node {
       int val;
       Node next, prev;
       Node(int val) {
           this.val = val;
       }
   }

      private int max, actual;
   private Node head, tail;

   public LCHWOct20_DequwUsingLL(int k) {
       this.max = k;
       this.actual = 0;
       head = tail = new Node(-1);
       head.next = tail;
       tail.prev = head;
   }
   
   public boolean insertFront(int val) {
       if (actual == max) {
           return false;
       }

       Node newNode = new Node(val);
       newNode.next = head.next;
       head.next = newNode;
       newNode.prev = head;
       newNode.next.prev = newNode;
       actual++;
       return true;
   }
   
   public boolean insertLast(int val) {
       if (actual == max) {
           return false;
       }

       Node newNode = new Node(val);
       tail.prev.next = newNode;
       newNode.next = tail;
       newNode.prev = tail.prev;
       tail.prev = newNode;
       actual++;
       return true;
   }
   
   public boolean deleteFront() {
       if (actual == 0) {
           return false;
       }

       Node node = head.next;
       head.next = node.next;
       node.next.prev = node.prev;
       actual--;
       return true;
   }
   
   public boolean deleteLast() {
       if (actual == 0) {
           return false;
       }

       Node node = tail.prev;
       tail.prev = node.prev;
       node.prev.next = node.next;
       actual--;
       return true;
   }
   
   public int getFront() {
       return isEmpty()? -1 : head.next.val;
   }
   
   public int getRear() {
       return isEmpty()? -1 : tail.prev.val;
   }
   
   public boolean isEmpty() {
       return actual == 0;
   }
   
   public boolean isFull() {
       return actual == max;
   }
}
