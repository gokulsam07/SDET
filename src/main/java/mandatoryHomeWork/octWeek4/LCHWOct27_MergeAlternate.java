package mandatoryHomeWork.octWeek4;

import org.junit.Assert;
import org.junit.Test;

public class LCHWOct27_MergeAlternate {
	//ip: string,string
	//op:string
	//Logic: take least size and store in size, take sum of bpth str len - size and store in rem
	//1. Iterate till size & append char from both str till size
	//2. if rem equls word1 len, iterate till the remaining len of word1 and append to sb
	//3. if not do it for word2
	//return sb as string
	//TC: O[N]; SC:O[k];
	 public String merge(String word1, String word2) {
	        int size =(word1.length()<word2.length())?word1.length():word2.length();
	        int rem = word1.length()+word2.length()-size;
	        StringBuilder sb = new StringBuilder();
	        int i=0;
	        for(i=0;i<size;i++){
	            sb.append(word1.charAt(i));
	            sb.append(word2.charAt(i));
	        }
	            if(rem==word1.length()){
	              for(int j=i;j<word1.length();j++){
	                  sb.append(word1.charAt(j));
	              }
	            }
	            else{
	                for(int j=i;j<word2.length();j++){
	                  sb.append(word2.charAt(j));
	              }
	            }
	        return new String(sb);
	    }
	 
	 @Test
		public void tst1() {
			Assert.assertEquals("apbqcr", merge("abc","pqr"));
		}
		@Test
		public void tst2() {
			Assert.assertEquals("apbqrs", merge("ab","pqrs"));
		}
		@Test
		public void tst3() {
			Assert.assertEquals("apbqcd", merge("abcd","pq"));
		}

		@Test
		public void tst4() {
			Assert.assertEquals("a", merge("a",""));
		}
}
