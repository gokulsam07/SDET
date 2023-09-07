package mandatoryHomeWork.postfoundationDailyHW;

import java.util.LinkedHashSet;

import org.junit.Test;
import org.testng.Assert;

public class Sep7HWLC_DecodeMessage {
	
	//Input : string, string
	//Output: string
	//Logic
	//1. Create a normal string a-z; create a resultant char[] of size that equals the message
	//2. Initialize a string builder, check if the length of key is > length of normal, if yes, iterate it in a for loop to remove duplicate & ' ' to append in string builder
	//3. check if the length of key is > length of normal, if yes pass the value of sb to create string res, else pass key to res
	
	//Main logic
	//1. Iterate a for loop for message till last index
	//2. Take the index of charAt(i) of message & store in index
	//3. If index == -1, add ' ' to resultant array else add the charAt(index) in normal array --> this is where the mapping happens
	//return the resultant string

	public String decodeMessage(String key, String message) {
		String normal ="abcdefghijklmnopqrstuvwxyz";
		char[] result = new char[message.length()];

		StringBuilder sb = new StringBuilder();
		if(key.length()>normal.length()) {
			LinkedHashSet<Character> lhs = new LinkedHashSet<>();
			for(char c:key.toCharArray()) {
				boolean flag = lhs.add(c);
				if(flag&&c!=' ') {
					sb.append(c);
				}
			}
		}
		String res;
		if(key.length()>normal.length()) {
			res=new String(sb);
		}
		else {
			res=key;
		}



		for(int i=0;i<message.length();i++){
			int index = res.indexOf(message.charAt(i));
			if(index==-1) {
				result[i]=' ';
			}
			else{
				result[i]= normal.charAt(index);
			}

		}

		return new String(result);
	}


	@Test
	public void test1() {
		Assert.assertEquals("the five boxing wizards jump quickly", decodeMessage("eljuxhpwnyrdgtqkviszcfmabo","zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
	}

	@Test
	public void test2() {
		Assert.assertEquals("this is a secret", decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));
	}




}
