package mandatoryHomeWork.postfoundationDailyHW;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class HRCW_MinimumDistance {
	
	//input : List<Integer>
	//output: int 
	//Logic  -> init flag as false, and min (as MAx_VALUE), init int[] of size == list.size
	// Set all the list values to array
	//1. Run two for loops to check if the element is repeated, if yes take the index of i as firstIndex and j as lastIndex
	//2. Find their abs diff
	//3. if the diff is < min , assign the diff to min and enable the flag
	// return (flag)?min:-1
	
	//Time complexity --> O[N2]
	public static int minimumDistances(List<Integer> a) {
	    int min=Integer.MAX_VALUE;
	   boolean flag =false;
	        int[] arr = new int[a.size()];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=a.get(i);
	        }
	        
	        for(int i=0;i<arr.length;i++){
	          for(int j=i+1;j<arr.length;j++){
	              if(arr[i]==arr[j]){
	                  int firstIndex = i;
	                  int lastIndex = j;
	                  int diff = Math.abs(firstIndex-lastIndex);
	                  if(diff<min){
	                      min=diff;
	                     flag=true;
	                  }
	              }
	          }
	        }
	        return (flag)?min:-1;
	    }


	
	

	@Test
	public void test1() {
		Assert.assertEquals(3, minimumDistances(Arrays.asList(7,1,3,4,1,7)));
	}
	@Test
	public void test2() {
		Assert.assertEquals(-1, minimumDistances(Arrays.asList(1,2,3,4,5,6)));
	}
	@Test
	public void test3() {
		Assert.assertEquals(-1, minimumDistances(Arrays.asList(1,2,3,4,5,10)));
	}
	@Test
	public void test4() {
		Assert.assertEquals(1, minimumDistances(Arrays.asList(1,1,1,1,1)));
	}
}
