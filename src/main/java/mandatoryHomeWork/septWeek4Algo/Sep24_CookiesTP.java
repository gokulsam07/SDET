package mandatoryHomeWork.septWeek4Algo;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Sep24_CookiesTP {
	//ip: int[], int[]
	//op : int
	//Logic Sort both the arrays, init p1, p1, satified
	//1. while the pointers are less than the respective arrays run the while loop
	//2. if the value in s >= s increase both the pointers & satisfied
	//3. if the value in s <g increase pointer p2 by 1 
	//return satisfied

	//Time complexity -O[N log N]  Space complexity O[log n]

	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int satisfied=0;
		int p1=0;
		int p2=0;
		while(p1<g.length&&p2<s.length){
			if(s[p2]>=g[p1]){
				satisfied++;
				p1++;
				p2++;
			}
			else if(s[p2]<g[p1]){
				p2++;
			}
		}
		return satisfied;
	}
	
	@Test
	public void test(){
		Assert.assertEquals(1, findContentChildren(new int[] {1,2,3}, new int[] {1,1}));
	}
	@Test
	public void test1(){
		Assert.assertEquals(2, findContentChildren(new int[] {1,2}, new int[] {1,2,3}));
	}

	@Test
	public void test2(){
		Assert.assertEquals(0, findContentChildren(new int[] {1,2,3}, new int[] {}));
	}
	
	@Test
	public void test3(){
		Assert.assertEquals(3, findContentChildren(new int[] {11,8,2,20}, new int[] {9,5,20,1}));
	}
	
}
