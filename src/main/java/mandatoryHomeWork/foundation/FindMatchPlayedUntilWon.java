package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

//Input: number of teams
//Output: Match to decide winner
//Logic:
//	1. Iterate while loop till teams>1
//	2. If the played matches is even, increase the count of matches by sum of count and teams/2
//	3. Reduce the teams by 2 from the exisiting team
//	4. If the matches played is odd,  increase the count of matches by sum of count and (teams-1)/2
//	5. reduce the teams by teams/2
	
public class FindMatchPlayedUntilWon {

	public int checkMatch(int teams) {
		int count=0;
		while (teams>1) {
			if(teams%2==0) {
				count =count+(teams/2);
				teams=teams-(teams/2);
			}
			else
			{
				count =count+(teams - 1)/2;	
				teams=	teams - (teams - 1)/ 2;
			}
		}
		return count;

	}


	@Test
	public void tst1() {
		Assert.assertEquals(6, checkMatch(7));	
	}

	@Test
	public void tst2() {
		Assert.assertEquals(13, checkMatch(14));	
	}

	@Test
	public void tst3() {
		Assert.assertEquals(0, checkMatch(1));	
	}
	@Test
	public void tst4() {
		Assert.assertEquals(1, checkMatch(2));	
	}
}
