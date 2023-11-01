package mandatoryHomeWork.novWeek1;

import org.junit.Assert;
import org.junit.Test;

public class LCHWNov2_RodsColors {
	
	//ip: String'
	//op: int
	//Logic: init three int[] of size for three colors
	//1. Loop thru the string -> hop by 2
	//2. If the char eqls spscific char, inc freq in the specific arrays specific index in string
	//3. Loop from 0 to len of arr to check if the same index of all three int[] has val >0, if yes count++
	//return count
	//TC:O[N]: SC:O[k]
	 public int countPoints(String s) {
	        int[] arrR = new int[10];
	        int[] arrG = new int[10];
	        int[] arrB = new int[10];
	        int count=0;

	        for(int i=0;i<s.length();i+=2){
	            if(s.charAt(i)=='R'){
	                arrR[s.charAt(i+1)-'0']++;
	            }
	            else if(s.charAt(i)=='G'){
	                arrG[s.charAt(i+1)-'0']++;
	            }
	            else if(s.charAt(i)=='B'){
	                arrB[s.charAt(i+1)-'0']++;
	            }
	        }

	         for(int i=0;i<arrG.length;i++){
	            if(arrR[i]>0&&arrG[i]>0&&arrB[i]>0)count++;
	        }
	        return count;
	    }
	 
	 @Test
	 public void test1() {
	 	Assert.assertEquals(2, countPoints("R0G0B0G1G2G3B2R1B3R2"));
	 }
	 @Test
	 public void test2() {
		 Assert.assertEquals(1, countPoints("R9G0B5G1G2G3B1R1B3R6"));
	 }

	 @Test
	 public void test3() {
		 Assert.assertEquals(0, countPoints("R9G0B5G1G2G3B4R1B3R6"));
	 }
}
