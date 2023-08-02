package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class countrPrime {
	
	//Input: num
	//Output: count of prime num
	//Logic:
	//1. create a boolean array of size n
	//2. set all value to true in the array using for loop
	//3. In for loop, starting from 2, with condition p*p<n run till <n
	//4. check if the value of prime in index p is true, if yes make all the multiples of number p to false
	//5. check for the count of true in the boolean array and return the count
	public int countPrime(int n) {
		boolean prime[] = new boolean[n];
		for(int i=0;i<n;i++)
			prime[i] = true;

		for(int p = 2; p*p <n; p++)
		{

			if(prime[p] == true)
			{
				for(int i = p*p; i < n; i += p)
					prime[i] = false;
			}
		}

		int count=0;
		for(int i = 2; i < n; i++)
		{
			if(prime[i] == true)
				count++;
		}return count;
	}

	@Test
	public void tst1() {
		Assert.assertEquals(4, countPrime(10));
	}

	@Test
	public void tst3() {
		Assert.assertEquals(1, countPrime(3));
	}

	@Test
	public void tst4() {
		Assert.assertEquals(13848, countPrime(150000));
	}


}
