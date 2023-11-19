package mandatoryHomeWork.weekendCrash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ArrayIntersectWeekend {
	@Test
	public void intersectTest() {
		Assert.assertEquals(Arrays.asList(6),intersect(new int[] {1,3,4,6,7},new int[] {-3,5,6,8,9}));
	}
	
	@Test
	public void intersectTest1() {
		Assert.assertEquals(Arrays.asList(),intersect(new int[] {1,3,4,6,7},new int[] {-3,5,8,9,10}));
	}
	@Test
	public void intersectTest2() {
		Assert.assertEquals(Arrays.asList(-1,4),intersect(new int[] {-1,4,5,6,7},new int[] {-3,-1,1,2,4}));
	}
	public List<Integer> intersect(int[] num1, int[] num2) {
		int p1=0, p2=0;
		List<Integer> al = new ArrayList<>();
		while(p1<num1.length&&p2<num2.length) {
			if(num1[p1]==num2[p2]) {
				al.add(num1[p1]);
				p1++;
				p2++;
			}
			else if(num1[p1]<num2[p2]) {
				p1++;
			}
			else {
				p2++;
			}
		}
		return al;
		
	}
}
