package mandatoryHomeWork.octWeek3;

public class RunnerDLL {

	public static void main(String[] args) {
		DoublyLLImpl obj = new DoublyLLImpl();
//		obj.addFirst(0);
//		obj.addLast(1);
//		obj.addFirst(3);
//		obj.display();
//		
//		System.out.println("---------------------");
//		
//		DoublyLLImpl obj1 = new DoublyLLImpl();
//		obj1.addFirst(0);
//		obj1.addFirst(2);
//		obj1.removeFirst();
//		obj1.display();
//		obj1.removeFirst();
//		obj1.display();
//		obj1.removeFirst();
//		obj1.removeLast();
//		System.out.println("---------------------");
//		
//		
//		obj1.display();
		System.out.println("---------------------");
		
		
		obj.addFirst(3);
		obj.display();
		obj.addFirst(2);
		obj.display();
		
		obj.addLast(5);
		obj.display();
		
		obj.removeFirst();
		obj.display();
		obj.removeLast();
		obj.display();
	}
}
