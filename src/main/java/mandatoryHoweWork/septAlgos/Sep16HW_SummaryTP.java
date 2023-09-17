package mandatoryHoweWork.septAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Sep16HW_SummaryTP {

	public List<String> summaryRange(int[] nums) {
		List<String> list = new ArrayList<>();
		int i=0;
		while(i<nums.length){
			int j =nums[i];

			while(i+1<nums.length&&nums[i]+1==nums[i+1]){
				i++;
			}

			if(j!=nums[i]){
				list.add(""+j+"->"+nums[i]);
			}

			else{
				list.add(""+j);
			}
			i++;
		}
		return list;

	}


	@Test
	public void test1() {
		List<String> al = Arrays.asList("0->2","4->5","7");
		Assert.assertEquals(al, summaryRange(new int[] {0,1,2,4,5,7}));
	}

	@Test
	public void test2() {
		List<String> al = Arrays.asList("0","2->4","6","8->9");
		Assert.assertEquals(al, summaryRange(new int[] {0,2,3,4,6,8,9}));
	}

	@Test
	public void test3() {
		List<String> al = Arrays.asList("-2","0->2","4","6");
		Assert.assertEquals(al, summaryRange(new int[] {-2,0,1,2,4,6}));
	}
}
