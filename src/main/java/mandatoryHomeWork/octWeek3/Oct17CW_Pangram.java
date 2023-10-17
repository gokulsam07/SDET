package mandatoryHomeWork.octWeek3;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class Oct17CW_Pangram {
	
	//ip: String
	//op: boolean
	//Logic : int char HashSet
	//1. add all chars to hs
	// return if size of hs is 26
	//TC: O[N}; SC:[N]
	public boolean checkIfPangram1(String sentence) {
        HashSet<Character> hs = new HashSet<>();
        for(char ch: sentence.toCharArray()){
            hs.add(ch);
        }
        return hs.size()==26;
    }
	//Method2
	 public boolean checkIfPangram(String sentence) {
	        boolean[] arr = new boolean[26];
	        for(int i=0;i<sentence.length();i++){
	            arr[sentence.charAt(i)-'a']=true;
	        }
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]==false){
	                return false;
	            }
	        }
	        return true;
	    }
	
	 @Test
		public void test() {
			Assert.assertEquals(true, checkIfPangram("abcdefghijklmnopqrstuvwxyznnyufbeuvue"));
		}
		@Test
		public void test1() {
			Assert.assertEquals(false, checkIfPangram("douancerxubvzuvuydzvyixibzbue"));
		}
		@Test
		public void test2() {
			Assert.assertEquals(true, checkIfPangram("qwertyuioplkjhgfdsazxcvbnmrygrybr"));
		}
}
