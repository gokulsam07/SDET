package mandatoryHomeWork.weekendCrash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class UncommonWords {
	//ip: String, String
	//op: String[]
	//Logic -> Init hm <Str,Int>
	//1. Split both the strings using " " & store in String[]
	//2. Init string[] of size sum(s1.len+s2.len)
	//3. Add frequency of Strings in both the String[] using separate for each 
	
	//init count=0
	//Iterate the map to check which value is 1, take and put it's corresponding key to res string[]
	//TC & SC :O(N)
	
	@Test
	public void uncommonTest()
	{
		Assert.assertArrayEquals(new String[] {"sweet","sour"}, uncommonFromSentences("this apple is sweet","this apple is sour"));
	}
	@Test
	public void uncommonTest1()
	{
		Assert.assertArrayEquals(new String[] {"banana"}, uncommonFromSentences("apple,apple","banana"));
	}
	 public String[] uncommonFromSentences(String s1, String s2) {
	        Map<String,Integer> hm = new HashMap<>();
	        String[] s1Arr = s1.split(" ");
	        String[] s2Arr = s2.split(" ");
	        String[] res = new String[s1Arr.length+s2Arr.length];
	        for(String s: s1Arr){
	            hm.put(s,hm.getOrDefault(s,0)+1);
	        }
	        for(String s: s2Arr){
	            hm.put(s,hm.getOrDefault(s,0)+1);
	        }
	        int count=0;
	        for(Map.Entry<String,Integer> entry : hm.entrySet()){
	           if(entry.getValue()==1){
	                res[count++]=entry.getKey();
	           }
	        }
	        return Arrays.copyOfRange(res,0,count);
	    }

}
