package mandatoryHomeWork.octWeek2.LinkedList;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct13_MostCommonWords {
	
	//ip: String, String[]
	//op: String
	//Logic : Init a hm and store the freq of occurrence of a word using HM getOrDefault
	//1. Run through all elements of banned array and remove it from HM
	//2 Init String res & max as Integer.MIN 
	//3. Iterate through all elements of map, if the val is > max assign the val to max and set the mapped key in res
	//return res
	//TC : O[N], SC: O[N]
	

	public String mostCommonWord(String paragraph, String[] banned) {
        String[] arr = paragraph.toLowerCase().split("[!?,';.\\s]+");
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(String s :arr) {
        	hm.put(s, hm.getOrDefault(s, 0)+1);
        }
        
        for(String ban :banned) {
        	hm.remove(ban);
        }
   
        Integer max = Integer.MIN_VALUE;
        String result = "";
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>max) {
				max=entry.getValue();
				result = entry.getKey();
			}
		}
      //  return hm.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
         return result;       
                
    }
	
	
	 @Test
	 public void test1() {
	 	Assert.assertEquals("person", mostCommonWord("A person b is a good person a 'b' if he's a good person B.!", new String[] {"a","b"}));
	 }
	 @Test
	 public void test2() {
		 Assert.assertEquals("d", mostCommonWord("A C b 7* B c c% a  d!  b e  f ;d d? e e a", new String[] {"a","b","c"}));
	 }
	 @Test
	 public void test3() {
		 Assert.assertEquals("y", mostCommonWord("j. t? t. z! r, v, f' x! l; l! w. m; s. y? r! n; o. q; i? h; w. t; y; x? y, p. k! k, h, j, r? w! u! v; j' u; r! z. s. t' k. p? m' i' j! y. p, t! e; x. w? m! y, x; g; d, x? s' f, k? v, r' v, v, d, w, k! s? q! n. n. v. v. t? t' x! u. j; m; n! f, v' y! h; c! v, v, x' x' t? n; n' r; x. w' p? w; p' q, s' x, j; r. x; z; z! g, u; m. p; o. p! y; i, i' l' j? h; q; s? u, q, x. j, t! o. z, n, l; u, w! u, s. y! v; s? y' e! o; p' x, w. p' m, h! r; t? k? y' z? t? w; u. q' r, q, t. r? i. r! t, x, s? u; z. u, y, n' u; m; p? g' p? y' v, o? k? r. q? i! c, x, x. r' u! m' y. t. w; x! k? b. v; m, k; k' x; z! u! p. u? q, t, u' e' n? s' w. y; w, x? r. p! y? q, y. t, z' v, s. q; w. z, z? x! k, i. n; x? z; v? s! g, u; e' m! z? y' x? v! t, f. z? y' s! z, y' t? x? v? o! l; d; g' l. l, z? q. w' r? u! e, h. c, q! o? w! s? w' d. r, y? u. w, n. z? h. m? o, b, g, z! t! l, w? z, o? z, q! o? u, n; o' o? v; s! z; q! q. o, t! q! w! z? z? w, f? o' n' u' p? r' j' l; s. m; g' v. i, p, v, v, f; w? l, y! i' z; l? w. v, s! p?", new String[] {"m","q","e","l","c","i","z","j","g","t","w","v","h","p","d","b","a","r","x","n"}));
	 }
	 
	 
	 
	
}
