package mandatoryHomeWork.postfoundationDailyHW;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class Sep12LCHW_UniqueEmailAddress {
	
	//Input: String[]
	//Ouput: int
	//Logic
	//1. Initialzie a has set (to remove dup emails after removing unnecessary chars)
	//2. Iterate in a for loop, split all the elements at @ and store in temp string[] 
	//3. Initialzie a string builder
	//4. In a nested for loop, iterate each string till length of temp[0]
	//5. if the char is + break the loop
	//6. if the char is != '.' append the char to sb
	//append @ to sb and append temp[1] to sb, convert to string and add to hashset, return the size of hashset
	
	 public int numUniqueEmails(String[] emails) {
         HashSet<String> ans = new HashSet<>();
          for(int i=0; i<emails.length; i++){
                 String[] temp = emails[i].split("@");
        StringBuilder sb = new StringBuilder("");
        for(int j=0; j<temp[0].length(); j++){
            if(temp[0].charAt(j)=='+') break;
            if(temp[0].charAt(j)!='.') sb.append(temp[0].charAt(j));  
        }
        sb.append('@');
        sb.append(temp[1]);
        ans.add(new String(sb));
          }
    return ans.size();
}
	 
	 
	 @Test
		public void test1() {
			Assert.assertEquals(2, numUniqueEmails(new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
		}
		
		@Test
		public void test2() {
			Assert.assertEquals(3, numUniqueEmails(new String[] {"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));
		}
		
		@Test
		public void test3() {
			Assert.assertEquals(0, numUniqueEmails(new String[] {}));
		}
		
}
