package mandatoryHomeWork.octWeek3;

import java.util.ArrayDeque;
import java.util.Queue;

public class LCHWOct17_Ping {
	  Queue<Integer> q;
	    public LCHWOct17_Ping() {
	        q= new ArrayDeque<>();
	    }
	    public int ping(int t) {
	        q.add(t);
	        while(q.peek()<t-3000){
	            q.poll();
	        }
	        return q.size();
	    }
	    
	    //https://leetcode.com/problems/number-of-recent-calls/description/
}
