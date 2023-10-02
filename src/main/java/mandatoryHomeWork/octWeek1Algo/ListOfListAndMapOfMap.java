package mandatoryHomeWork.octWeek1Algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.common.collect.Multiset.Entry;

public class ListOfListAndMapOfMap {

	@Test
	public void test1() {

		List<List<String>> lol = new ArrayList<>();
		List<String> li2 =  new ArrayList<>();
		List<String> li1 =  new ArrayList<>();
		li1.add("This"); li2.add("This");
		li1.add("is"); li2.add("is");
		li1.add("List1"); 	li2.add("List2");
		li1.add("example"); li2.add("example");

		lol.add(li1); lol.add(li2);

		for(List<String> s :lol) {
			System.out.println(s);
		}
	}

	@Test
	public void test2() {

		Map<Integer,Map<Integer,String>> mom =  new HashMap<>();
		Map<Integer,String> hm1 = new HashMap<>();
		Map<Integer,String> hm2 = new HashMap<>();
		hm1.put(0, "Gokul"); hm2.put(0, "Nazreen");
		hm1.put(1, "Vignesh");hm2.put(1, "Raji");
		hm1.put(2, "Praga");hm2.put(2, "Poorani");
		hm1.put(3, "Govindh");hm2.put(3, "Anand");

		mom.put(1, hm1); mom.put(2, hm2);
		for (Map.Entry<Integer, Map<Integer,String>> entry : mom.entrySet()) {
			System.out.println(entry.getValue().get(2));
			//	System.out.println(entry);  -- Just iterate the map entires as a single entity
		}

	}
}
