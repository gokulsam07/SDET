package mandatoryHomeWork.octWeek4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct24_Partition {
	//ip: String
	//op: List<Int>
	//Logic: init find and shift var - int
	//1. Iterate all elements, if the last index of current char is gte find assign the index to find
	//2. when the iteration index equals find, add the diff of find-shift +1 to al
	//3. chnage shift to find+1 index
	//4. chnage fnd to current iteration i
	//return al
	
	//TC  & SC :O[N]
	   public List<Integer> partitionLabels(String s) {
	        int find = 0;
	        int shift = 0;
	        List<Integer> al = new ArrayList<>();
	    for(int i = 0; i<s.length(); i++){
	        if(s.lastIndexOf(s.charAt(i)) > find){
	            find = s.lastIndexOf(s.charAt(i));
	        } if(i == find){
	            al.add(find+1-shift);
	            shift=find+1;
	            find=i;
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
