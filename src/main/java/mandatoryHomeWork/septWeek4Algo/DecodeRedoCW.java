package mandatoryHomeWork.septWeek4Algo;

import java.util.LinkedHashSet;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class DecodeRedoCW {
	

	//ip: String String
	//op : String 
	//Logic --  Init normal string from a-z, op char[] of length equals that of message, key as res
	//1. To normalise key, add in LHS (to maintain insertion order),if there is no duplicate add to sb, all other condition don't add
	  // if given key length > normal length (means duplicate and or space is available) set the sb in key
	//2. Find the index of char at message in res and take the index, set the value of index in normal to output
	//3. if the index is not available set space
	//return the op as string

	//Time complexity - O[N], Space complexity -O[N]
	
	 public String decodeMessage(String key, String message) {
			String normal ="abcdefghijklmnopqrstuvwxyz";
			char[] result = new char[message.length()];
			String res;
			res=key;
			StringBuilder sb = new StringBuilder();
			if(key.length()>normal.length()) {
				LinkedHashSet<Character> lhs = new LinkedHashSet<>();
				for(char c:key.toCharArray()) {
					if(lhs.add(c)&&c!=' ') {
						sb.append(c);
					}
				}
				res=new String(sb);
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
			AssertJUnit.assertEquals("the five boxing wizards jump quickly", decodeMessage("eljuxhpwnyrdgtqkviszcfmabo","zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
		}

		@Test
		public void test2() {
			AssertJUnit.assertEquals("this is a secret", decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));
		}
		
		@Test
		public void test3() {									  
			AssertJUnit.assertEquals("programming", decodeMessage("zjxyqrlnogbcwsmftkiuvdphae","fkmlkzwwosl"));
		}
		
		@Test
		public void test4() {
			AssertJUnit.assertEquals("is this good", decodeMessage("zjxyqrlnogbcwsmftkiuvdphae","oi unoi lmmy"));
		}
	}

