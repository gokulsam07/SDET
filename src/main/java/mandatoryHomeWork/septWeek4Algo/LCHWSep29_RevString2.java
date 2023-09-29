package mandatoryHomeWork.septWeek4Algo;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class LCHWSep29_RevString2 {
	//ip: String , int
	//op : String
	//logic : init charArr
	//1. Run from first to last element -- jump i by 2*k each step
	//2. Until the size of window is lte of array length reverse all the element in window
	//3. In all other cases reverse the availablw window
	// return as String
	//TC: O[n]; SC: O[n]

	
	public String reverseStr(String s, int k) {
        char[] cArr = s.toCharArray();

        for(int i = 0 ; i <= cArr.length-1; i += 2*k){
            if(i+k-1 <= cArr.length-1){
                reverse(i,i+k-1,cArr);
            }else{
                reverse(i,cArr.length-1,cArr);
            }
        }
        return new String(cArr);
         
    }
    public void reverse(int i, int j, char[] a){
        while(i < j){
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    

	@Test
	public void test1() {
		Assert.assertEquals("bacacb", reverseStr("abcabc", 2));
	}

	@Test
	public void test2() {
		Assert.assertEquals("cbaab", reverseStr("abcab", 3));
	}

	@Test
	public void test3() {
		Assert.assertEquals("cbadefhg", reverseStr("abcdefgh", 3));
	}
	

}
