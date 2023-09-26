package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class Sep26_WinnerBowling {
	
	//ip: int [], int[]
	//op : int
	//Logic init sum for both players
	//1. Run a for loop till last index of player 1
			//Check if the first index has value 10 for second score or previous indices has value 10 for indexes 2 to n, if yes add the value to p1Sum
	// add the value to p1Sum
	//2. Repeat the same for p2
	
	// if p1>p2, return 1, if they are equal return 0, else return 2
	
	//Time complexity - O[2N], Space Complexity O[k]

	   public int isWinner(int[] player1, int[] player2) {
	       
	        int p1Sum = 0, p2Sum = 0;
	        for(int i=0; i<player1.length; i++){
	            if((i == 1 && player1[i-1] == 10) || (i >= 2 && (player1[i-1] == 10 || player1[i-2] == 10)))    {
	                p1Sum += player1[i];
	            }
	             p1Sum += player1[i];
	        }
	       for(int i=0; i<player2.length; i++){
	            if((i == 1 && player2[i-1] == 10) || (i >= 2 && (player2[i-1] == 10 || player2[i-2] == 10)))    {
	                p2Sum += player2[i];
	            }
	             p2Sum += player2[i];
	        }

	        return (p1Sum>p2Sum)?1:(p1Sum==p2Sum)?0:2;
	    }
	   
		@Test
		public void test(){
			Assert.assertEquals(2, isWinner(new int[] {2,3,4,5},new int[] {5,6,7,8}));
		}
		@Test
		public void test1(){
			Assert.assertEquals(1, isWinner(new int[] {10,10,2,4},new int[] {2,4,10,10}));
		}

		@Test
		public void test3(){
			Assert.assertEquals(0, isWinner(new int[] {1,3},new int[] {2,2}));
		}
		

		@Test
		public void test4(){
			Assert.assertEquals(2, isWinner(new int[] {3,5,7,6},new int[] {1,10,10,2}));
		}
}
