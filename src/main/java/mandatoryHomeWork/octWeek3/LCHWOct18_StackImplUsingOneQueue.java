package mandatoryHomeWork.octWeek3;

import java.util.LinkedList;
import java.util.Queue;

public class LCHWOct18_StackImplUsingOneQueue {
	class MyStack {
	    Queue<Integer> q;
	    public MyStack() {
	        q= new LinkedList<>();
	    }
	    
	    public void push(int x) {
	        int n = q.size();
	        q.offer(x);
	        for (int i = 0; i < n; i++) {
	            q.offer(q.poll());
	    }
	}
	    public int pop(){
	        return q.poll();
	    }
	    
	    public int top() {
	        return q.peek();
	    }
	    
	    public boolean empty() {
	        return q.isEmpty();
	    }
	}
}
