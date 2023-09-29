package mandatoryHomeWork.septWeek3Algos;
import org.junit.Test;
import org.testng.Assert;

public class Sep19LCHW_SubArrayAvgGTEThreshold {

	//ip: int[], int,int
	//op: int
	//Logic init i,j,sum, count as 0
	//1. run a while loop for the first k elements to check the sum>= in a=if loop outside while, if yes count++
	//2. Run another while loop till arr.length-1, add j(end from 1st while loop) & sub i (start index)
	//3. if the avg >= threshold, count++, increase the start and end index to move the window one step
	//return count
	//Time complexity -- O[N]


	public int numOfSubarrays(int[] arr, int k, int threshold) {
		int i=0;
		int j=0;
		int sum=0;
		int count=0;

		while(j<k){
			sum+=arr[j];
			j++;
		}
		if(sum/k>=threshold){
			count++;
		}
		while(j<arr.length){
			sum=sum+arr[j]-arr[i];
			if(sum/k>=threshold){
				count++;
			}
			i++;
			j++;
		}
		return count;
	}

	@Test
	public void test1() {
		Assert.assertEquals(0, numOfSubarrays(new int[]{ 1,2,3,4,5,6},4,10));
	}

	@Test
	public void test2() {
		Assert.assertEquals(3, numOfSubarrays(new int[]{ 1,2,3,4,5,6},2,3));
	}

	@Test
	public void test3() {
		Assert.assertEquals(5, numOfSubarrays(new int[]{ 1,1,1,1,1},1,1));
	}

}
