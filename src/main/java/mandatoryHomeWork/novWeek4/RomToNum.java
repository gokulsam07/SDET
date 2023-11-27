package mandatoryHomeWork.novWeek4;

import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public abstract class RomToNum {
	
	//ip: String 
	//op: int
	//Logic -> init total
	//1.Iterate all elements, if char is I check if i<le-1 and next char is V, if yes add 4 
		//check same rule and next is X, add 9
		// else add 1
	//2. if char is V, add 5; L - 50; D- 500; M-1000
	//3. for X and C check there is next char 
	//for X if next is L - add 40, if C add 90
	//for C, if next is D add 400, if M add 900
	
	//return total
	//TC :O(n), SC: O(1)
	
	@Test
	public void test() {
		Assert.assertEquals(4, romanToInt("IV"));
		Assert.assertEquals(4, convert("IV"));}
	@Test
	public void test1() {
		Assert.assertEquals(3999, romanToInt("MMMCMXCIX"));	
		Assert.assertEquals(4, convert("IV"));}
	
	@Test
	public void test2() {
		Assert.assertEquals(1595, romanToInt("MDXLV"));	
		Assert.assertEquals(4, convert("IV"));}
	//Bruteforce
	public int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                    total += 4;
                    i++; 
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                    total += 9;
                    i++;
                } else {
                    total += 1;
                }
            } else if (s.charAt(i) == 'V') {
                total += 5;
            } else if (s.charAt(i) == 'X') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                    total += 40;
                    i++; 
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    total += 90;
                    i++; 
                } else {
                    total += 10;
                }
            } else if (s.charAt(i) == 'L') {
                total += 50;
            } else if (s.charAt(i) == 'C') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                    total += 400;
                    i++; 
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                    total += 900;
                    i++; 
                } else {
                    total += 100;
                }
            } else if (s.charAt(i) == 'D') {
                total += 500;
            } else if (s.charAt(i) == 'M') {
                total += 1000;
            }
        }
        return total;
    }
	
	//Optimised
	public int convert(String s) {
		int total=0;
		HashMap<Character, Integer> m = new HashMap<>();        
	        m.put('I', 1);
	        m.put('V', 5);
	        m.put('X', 10);
	        m.put('L', 50);
	        m.put('C', 100);
	        m.put('D', 500);
	        m.put('M', 1000);
	        for (int i = 0; i < s.length(); i++) {
	            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
	                total -= m.get(s.charAt(i));
	            } else {
	                total += m.get(s.charAt(i));
	            }
	        }
		return total;
	}
}
