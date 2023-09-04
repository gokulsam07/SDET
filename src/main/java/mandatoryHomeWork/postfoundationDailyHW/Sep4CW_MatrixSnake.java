package mandatoryHomeWork.postfoundationDailyHW;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Sep4CW_MatrixSnake {
	//Input: int[][]
	//Output: int[]
	//Logic
	//1. Create a int[]  of size n*n -- n = len of row/col
	//2. In a for loop, check if the index of row%2 gives zero
	//3. if yes, add the elements in the same order using second for loop
	//4. else add the elements in reverse order by decrementing the for loop
	// return thr int[]
	static int[] printMatrix(int mat[][]){
		int s = mat.length;
		int[] res = new int[s * s];
		int v = 0;

		for (int i = 0; i < s; i++) {
			if (i % 2 == 0) {  
				for (int j = 0; j < s; j++) {
					res[v++] = mat[i][j];
				}
			} else {
				for (int j = s - 1; j >= 0; j--) {
					res[v++] = mat[i][j];
				}
			}
		}

		return res;
	}





@Test
public void test1() {
	int[][] mat = {{1,2},{3,4}};
	int[] res = {1,2,4,3};
	Assert.assertEquals(res, printMatrix(mat));
}

@Test
public void test2() {
	int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
	int[] res = {1,2,3,6,5,4,7,8,9};
	Assert.assertEquals(res, printMatrix(mat));
}

}