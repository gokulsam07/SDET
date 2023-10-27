package mandatoryHomeWork.octWeek4;

import org.junit.Assert;
import org.junit.Test;

public class LCHWOct26_MatrixFlipReverse {
	
	//ip& op: int[][]
	//Logic:
	//1. Iterate all the elements in int[][] , init two pointer until they cross each other to swap elements
	//2. Iterate all the elements again to flip 
	//return image
	//TC :O[N]; SC:O[k]
	 public int[][] flipAndInvertImage(int[][] image) {
	        for(int i=0;i<image.length;i++){
	                int p1=0;int p2=image[i].length-1;
	                while(p1<p2){
	                    int temp = image[i][p1];
	                    image[i][p1]=image[i][p2];
	                    image[i][p2]=temp;
	                    p1++;
	                    p2--;
	                }
	            }
	         for(int i=0;i<image.length;i++){
	            for(int j=0;j<image[i].length;j++){
	                 if(image[i][j]==0) image[i][j]=1;
	                else image[i][j]=0;
	                }
	            }
	        return image;
	    }
	 
	 
	   @Test
			public void test1() {
				Assert.assertArrayEquals(new int[][] {{1,0,0},{0,1,0},{1,1,1}}, flipAndInvertImage(new int[][] {{1,1,0},{1,0,1},{0,0,0}}));
			}

			@Test
			public void test2() {
				Assert.assertArrayEquals(new int[][] {{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}}, flipAndInvertImage(new int[][] {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}));
			}
}
