package mandatoryHomeWork.weekendCrash1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GroupAnagram {
	
//Two for loops
//Add to hashmap and remove the values of second one, if hm is empty, add to al
//return al
	//Sc:O(n); TC:O(n2)
	@Test
	public void grpAnagramTest() {
		Assert.assertEquals(Arrays.asList(Arrays.asList("bat"),Arrays.asList("nat","tan"),Arrays.asList("ate","eat","tea")), grpAnagram(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
	}
	
	public List<List<String>> grpAnagram1(String[] arr){
		List<List<String>> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			List<String> temp = new ArrayList<>();
			for (int j = i; j < arr.length; j++) {
				if(checkAnagram(arr[i],arr[j])) {
					temp.add(arr[j]);
				}
			}
			result.add(temp);
		}
		return result;
	}
	
	private boolean checkAnagram(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		HashMap<Character,Integer> hm = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			hm.put(s1.charAt(i), hm.getOrDefault(hm, 0)+1);
		}
		for (int i = 0; i < s2.length(); i++) {
			hm.put(s2.charAt(i), hm.getOrDefault(hm, 0)-1);
			if (hm.get(s2.charAt(i))==0) {
				hm.remove(s2.charAt(i));
            }
		}
		return hm.isEmpty();
	}
	
	public List<List<String>> grpAnagram(String[] arr){ 
		//TC:O(n log n), SC: O(n)
		//"eat", "tea", "tan", "ate", "nat", "bat"
		HashMap<String, List<String>> hm = new HashMap<>();
	        for (String word : arr) {
	            String sortedWord = sort(word);
	            List<String> al = hm.getOrDefault(sortedWord, new ArrayList<>());
	            al.add(word);
	            hm.put(sortedWord, al);
	        }
	        return new ArrayList<>(hm.values());
	    }
	    private String sort(String s) {
	        char[] cArr = s.toCharArray();
	        Arrays.sort(cArr);
	        return new String(cArr);
	    }
}
