package mandatoryHomeWork.novWeek2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class Nov7CW_StringPartition {
	//ip: String: op: ArrayList
	//Logic
	//1. init two pointers p1 & p2 as 0 & ArrayList
	//2. Loop thru the string till last element and check the last index of the char > p1
	//if yes assign the last index to p1
	//3. If the index and p1 equals, 
	//add p1-p2+1 to al
	//move p2 to p1+1 ans set i as p1
	//return al
	//TC & SC: O[N]
	
	public List<Integer> partitionLabels(String s) {
		int p1=0;
		int p2=0;
		List<Integer> al = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(s.lastIndexOf(s.charAt(i))>p1) {
				p1=s.lastIndexOf(s.charAt(i));
			}
			if(i==p1) {
				al.add(p1+1-p2);
				p2=p1+1;
				p1=i;
			}
		}
return al;
    }
	
	 @Test
	 public void test()
	 {
		Assert.assertEquals(Arrays.asList(9,7,8), partitionLabels( "ababcbacadefegdehijhklij"));
	 }
	 @Test
	 public void test1()
	 {
		 Assert.assertEquals(Arrays.asList(10), partitionLabels("eccbbbbdec"));
	 }

}
