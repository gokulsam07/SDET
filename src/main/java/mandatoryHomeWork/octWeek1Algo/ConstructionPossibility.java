package mandatoryHomeWork.octWeek1Algo;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;
import org.testng.Assert;

public class ConstructionPossibility {
	
	//ip: String, String
	//op: boolean
	//Logic: init freq array 
	//1. if len of rans > len og mag return false
	//2. Run a for loop to inc freq all the elements in mag str to freq arr
	//3. Run another for loop to reduce all the elements in freq arr
			//if the freq for a particular char is less than zero , return false
	//All other condition returns true
	//TC : O[N]. SC: O[N]
	
	 public boolean canConstruct1(String ransomNote, String magazine) {
		 if(ransomNote.length()>magazine.length()) return false;
		 short[] fr = new short[26];

		for(int i=0;i<magazine.length();i++) {
	        fr[magazine.charAt(i)-'a']++;
	    }
		for (int i = 0; i < ransomNote.length(); i++) {
            fr[ransomNote.charAt(i) - 'a']--;
            if (fr[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
		
		return true;
	 }
	 
	 
	 public boolean canConstruct2(String ransomNote, String magazine) {
		 //ip: String, String
		 //op: boolean
		 //Logic : init hm<Char,Int>
		 //1. Run a for loop to inc the freq of char in mag string to hm
		 //2. Run another for loop to reduce the freq of hm for the char in ransom string
		 	//if the value of char of ransom note is <0 return false
		 // all other cases returns true
		//TC : O[N]. SC: O[N]
		 
		 HashMap<Character,Integer> hm = new HashMap<>();
		 for(int i=0;i<magazine.length();i++) {
		      hm.put(magazine.charAt(i), hm.getOrDefault(magazine.charAt(i), 0)+1);
		    }
			for (int i = 0; i < ransomNote.length(); i++) {
				 hm.put(ransomNote.charAt(i), hm.getOrDefault(ransomNote.charAt(i), 0)-1);
	            if (hm.get(ransomNote.charAt(i)) < 0) {
	                return false;
	            }
	        }
			
			return true;
		}
	 
	 public boolean canConstruct3(String ransomNote, String magazine) {
		 if(ransomNote.length()>magazine.length()) return false;
		 ConcurrentHashMap<Character, Integer> cMap = new ConcurrentHashMap<Character, Integer>();
		 for (int i = 0; i < magazine.length(); i++) {
				char c1 = magazine.charAt(i);
				char c2=' ';
				if(i<ransomNote.length()) {
					c2=ransomNote.charAt(i);
				}
				cMap.put(c1, cMap.getOrDefault(c1, 0) + 1);
				if(i<ransomNote.length()) {
					cMap.put(c2, cMap.getOrDefault(c2, 0) - 1);
				}
			}
		 for(int i=0;i<ransomNote.length();i++) {
				 if(cMap.get(ransomNote.charAt(i))<0) {
					 return false;
				 }
			 }
		 return true;
		}
	 
	 
	 //brute force
	 public boolean canConstruct(String ransomNote, String magazine) {
		 if (ransomNote.length() > magazine.length()) return false;

	        StringBuilder sb = new StringBuilder(magazine);
	        
	        for (int i = 0; i < ransomNote.length(); i++) {
	            char c = ransomNote.charAt(i);
	            int index = sb.indexOf(String.valueOf(c));
	            if (index == -1) {
	                return false; 
	            }
	            sb.deleteCharAt(index);
	        }

	        return true;
		    
		}
	 @Test
		public void test1() {
			Assert.assertEquals(false, canConstruct("a","b"));
		}
		@Test
		public void test2() {
			Assert.assertEquals(false, canConstruct("bach","ba"));
		}

		@Test
		public void test3() {
			Assert.assertEquals(true, canConstruct("aa","baach"));
		}

		@Test
		public void test4() {
			Assert.assertEquals(true, canConstruct("dash","hashed"));
		}
		
		@Test
		public void test5() {
			Assert.assertEquals(true, canConstruct("ab","baaa"));
		}
}