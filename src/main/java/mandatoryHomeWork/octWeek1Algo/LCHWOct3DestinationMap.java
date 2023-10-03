package mandatoryHomeWork.octWeek1Algo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct3DestinationMap {

	//ip: List<List<String>>
	//op : String
	//Logic : init set
	//1. Add all the start to  set
	//2. add the dest to the same set, which value returns bool true is the dest, return that
	//return ""
	//TC : O[N], SC: O[2N]

	public String findDestination(List<List<String>> paths) {
		Set<String> keys = new HashSet<>(); 
		for (List<String> path : paths) {
			keys.add(path.get(0)); 
		}

		for (List<String> path : paths) {
			if (keys.add(path.get(1))) {
				return path.get(1); 
			}
		}
		return "";
	}

	@Test
	public void test1() {
		List<List<String>> al = new ArrayList<>();
		al.add(Arrays.asList("London","New York"));
		al.add(Arrays.asList("New York","Lima"));
		al.add(Arrays.asList("Lima","San Jose"));
		Assert.assertEquals("San Jose", findDestination(al));
	}
	@Test
	public void test2() {
		List<List<String>> al = new ArrayList<>();
		al.add(Arrays.asList("LN","NY"));
		al.add(Arrays.asList("NY","L"));
		al.add(Arrays.asList("L","SJ"));
		Assert.assertEquals("SJ", findDestination(al));
	}

	@Test
	public void test3() {
		List<List<String>> al = new ArrayList<>();
		al.add(Arrays.asList("A","B"));
		al.add(Arrays.asList("C","D"));
		al.add(Arrays.asList("B","C"));
		Assert.assertEquals("D", findDestination(al));
	}

	@Test
	public void test4() {
		List<List<String>> al = new ArrayList<>();
		al.add(Arrays.asList("Tiruppur","Bengaluru"));
		Assert.assertEquals("Bengaluru", findDestination(al));
	}
}
