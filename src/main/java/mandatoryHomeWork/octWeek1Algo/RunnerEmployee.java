package mandatoryHomeWork.octWeek1Algo;

import java.util.HashMap;
import java.util.Map;

public class RunnerEmployee {
	public static void main(String[] args) {
		HashMap<String,Employee> hm= new HashMap<>();
		hm.put("Gokul", new Employee(1000,24,"India"));
		hm.put("Vignesh", new Employee(1001,29,"California"));
		hm.put("Anand", new Employee(1002,32,"Australia"));
		hm.put("Raji", new Employee(1003,30,"England"));

//		for (Map.Entry<String, Employee> entry : hm.entrySet()) {
//			System.out.println( entry.getKey() +  " : "  + entry.getValue().toString());
//		}
		
		System.out.println(hm.entrySet());
	}
}
