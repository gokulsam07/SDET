package mandatoryHomeWork.weekendCrash3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class SubArrayMatch {

	@Test
	public void test() {
		Assert.assertEquals(
				Arrays.asList(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(3, 6), Arrays.asList(6, 8)),
				sumMatch(new int[] { 1, 7, 4, 3, 1, 2, 1, 5, 1 }, 7));
	}

	@Test
	public void test1() {
		Assert.assertEquals(
				Arrays.asList(Arrays.asList(0, 2), Arrays.asList(1, 2), Arrays.asList(4), Arrays.asList(3, 5)),
				sumMatch(new int[] { 0, 1, 3, -2, 4, 2 }, 4));
	}

	@Test
	public void test2() {
		Assert.assertEquals(Arrays.asList(), sumMatch(new int[] { 0, 1, 3, 7, 4, 2 }, 5));
	}

	@Test
	public void test3() {
		Assert.assertEquals(Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(4, 7),
				Arrays.asList(7, 9)), sumMatch(new int[] { 1, 7, 7, 4, 3, 1, 2, 1, 5, 1 }, 7));
	}

	public List<List<Integer>> sumMatch(int nums[], int target) {
		int sum = 0, left = 0;
		boolean[] isSingleElementPrinted = new boolean[nums.length];
		List<List<Integer>> result = new ArrayList<>();

		for (int right = 0; right < nums.length; right++) {
			if (!isSingleElementPrinted[right] && nums[right] == target) {
				result.add(List.of(right));
				isSingleElementPrinted[right] = true;
			}
			sum += nums[right];
			while (sum >= target) {
				if (sum == target && right != left) {
					result.add(List.of(left, right));
				}
				sum -= nums[left++];
			}
		}
		return result;
	}
}
