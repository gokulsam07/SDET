package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class MaxShareProfit {

	/*
	 * 1. input : Array of prices 
	 * 2. output : max profit achieved 
	 * Logic: 
	 * 3. intialize max=0;
	 * 4. iterate through for loop 1 all the values in array
	 * 5.  iterate through for loop 2 all the i+1 values in array
	 * 6.  check if price in j>i (no need of back traversal because can't sell the before date of buy) 
	 * 7.check if price[j]>price[i]
	 * 8.  if yes assign the difference to max else leave empty return the max value
	 */

	public int maxProfit1(int[] prices) {
		int max=0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i+1; j < prices.length; j++) {
				if((prices[j]-prices[i])>max) {
					max=prices[j]-prices[i];
				}
			}
		}
		return max;

	}

	public int maxProfit(int[] prices) {
		int max=0;
		int currentProfit = 0;
		int buyprice = Integer.MAX_VALUE;

		for (int i = 0; i < prices.length; i++) {

			if(prices[i]<buyprice) {
				buyprice=prices[i];
			}
			currentProfit = prices[i]-buyprice;
			if(currentProfit>max) {
				max=currentProfit;
			}

		}
		return max;

	}

	@Test
	public void tst1() {
		Assert.assertEquals(5, maxProfit(new int[] {7,1,5,3,6,4}));	
	}


	@Test
	public void tst2() {
		Assert.assertEquals(0, maxProfit(new int[] {7,6,4,3,1}));	
	}

	@Test
	public void tst3() {
		Assert.assertEquals(0, maxProfit(new int[] {7}));	
	}
}
