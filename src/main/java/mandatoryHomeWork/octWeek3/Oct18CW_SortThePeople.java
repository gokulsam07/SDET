package mandatoryHomeWork.octWeek3;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;

public class Oct18CW_SortThePeople {
	
	//ip: int[] string[]
	//op: string[]
	//Logic : inti TreeMap for Inte, Strin
	//1. Iterate all the elements and add to map
	//2. Init res[] str arr of len equls ip
	//3. Iterate the map and add the res from end of res arr
	//return res
	//TC & SC :O[N]

	public String[] sortPeople(String[] names, int[] heights) {  
		Map<Integer,String> hm = new TreeMap<>();

		for(int i=0;i<names.length;i++){
			hm.put(heights[i],names[i]);
		}

		String[] res = new String[names.length];
		int n=names.length-1;
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			res[n--] = entry.getValue();

		}
		return res;
	}
	
	 @Test
		public void test() {
			Assert.assertArrayEquals(new String[] {"c","b","a"}, sortPeople(new String[] {"a","b","c"}, new int[] {1,2,4}));
		}
		@Test
		public void test1() {
			Assert.assertArrayEquals(new String[] {"d","b","c"}, sortPeople(new String[] {"b","c","d"},new int[] {4,2,6}));
		}
		@Test
		public void test2() {
			Assert.assertArrayEquals(new String[] {"d"}, sortPeople(new String[] {"d"},new int[] {0}));
		}

}
