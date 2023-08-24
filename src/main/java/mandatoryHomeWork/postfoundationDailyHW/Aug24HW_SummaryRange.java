package mandatoryHomeWork.postfoundationDailyHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Aug24HW_SummaryRange {

	//Input : int[]
	//Output : List<String>
	//Logic
	//1. Iterate a while loop in a for loop to check arr[i]+1 equals arr[i+1],if yes increment i by 1
	//2. Assign start =arr[i] in the for loop above while
	//3. chekc if start and current value are !=, if yes, add the start and end to list 
	//4. if not add the start to list
	//return the value



	public List<String> summaryRange(int[] nums){
		List<String> list = new ArrayList<>();

		for(int i=0;i<nums.length;i++){
			int start =nums[i];

			while(i+1<nums.length&&nums[i]+1==nums[i+1]){
				i++;
			}

			if(start!=nums[i]){
				list.add(""+start+"->"+nums[i]);
			}

			else{
				list.add(""+start);
			}
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
