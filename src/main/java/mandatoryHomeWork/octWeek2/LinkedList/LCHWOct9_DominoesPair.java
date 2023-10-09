package mandatoryHomeWork.octWeek2.LinkedList;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct9_DominoesPair {
	
	//ip: int[][]
	//op: int
	//Logic :init counter
	//1. Run a for loop from start to end of 2D array take the front and back element in the array for each iteration
	//2. Run a nested for loop to start from the next pair of int[][], and check if either front matches any of checking items front or back, same for back
	//if yes inc count
	// return count
	//TC: O[N2]; SC:O[k]
	 public int numEquivDominoPairs(int[][] dominoes) {
	        int count =0;
	        for(int i=0;i<dominoes.length;i++){
	            int front = dominoes[i][0];
	            int back = dominoes[i][1];
	            for(int j=i+1;j<dominoes.length;j++){
	                int frontC=dominoes[j][0];
	                int backC=dominoes[j][1];
	                if(front==frontC&&back==backC)count++;
	                if(front==backC&&back==frontC) count++;
	            }
	        }
	        return count;
	    }
@Test
public void test1() {
	Assert.assertEquals(1, numEquivDominoPairs(new int[][] {{1,2},{2,2},{2,1},{3,2}}));
}
@Test
public void test2() {
	Assert.assertEquals(0, numEquivDominoPairs(new int[][] {{2,2},{2,1},{3,2}}));
}

@Test
public void test3() {
	Assert.assertEquals(6, numEquivDominoPairs(new int[][] {{1,2},{1,2},{2,1},{2,1}}));
}


}
