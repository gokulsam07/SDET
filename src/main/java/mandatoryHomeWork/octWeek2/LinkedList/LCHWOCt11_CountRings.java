package mandatoryHomeWork.octWeek2.LinkedList;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOCt11_CountRings {
	
	//ip: String
	//op: int
	//Logic: init rodCount, three int[] of size 10 to hold rings for RGB
	//1. Iterate the for loop for every alternate char
	//2. Extract the int value at odd index, check if the char is R or G or B, and when it suits a char, inc the respective arr index by 1
	//3. Iterate the int[] from first to last element, when all the index value for the arr is > 0, inc rodCont
	// return rodCount
	//TC: O[N], SC:O[N]
	
	public int countPoints(String rings) {
        int rodCount =0;
        int arrR[]=new int[10];
        int arrB[]=new int[10];
        int arrG[]=new int[10];
        for(int i=0;i<rings.length();i+=2){
            int index=rings.charAt(i+1)-'0';
            if(rings.charAt(i)=='R')
                arrR[index]+=1;
            else if(rings.charAt(i)=='G')
                arrG[index]+=1;
            else
                arrB[index]+=1;
        }
        for(int i=0;i<=9;i++){
            if(arrR[i]>0 && arrG[i]>0 && arrB[i]>0){
                rodCount++;
            }
        }
        return rodCount;
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
