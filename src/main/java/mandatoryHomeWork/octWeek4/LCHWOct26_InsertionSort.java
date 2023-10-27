package mandatoryHomeWork.octWeek4;

import java.util.Arrays;

public class LCHWOct26_InsertionSort {
	
	//ip & op: LL
	//Logic: 
	//1. Calculate num of elements in LL, create int[] of that size
	//2. Add all elements from LL to int[], sort the arrays
	//3 Add the sorted array val to LL val
	//return LL
	//TC & SC :O[N]
	private class ListNode {
		int val;
		ListNode next;
	}

	public ListNode insertionSortList(ListNode head) {
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}

		int[] temp = new int[count];
		current = head;
		int i = 0;

		while (current != null) {
			temp[i++] = current.val;
			current = current.next;
		}

		Arrays.sort(temp);

		current = head;
		i = 0;

		while (current != null) {
			current.val = temp[i++];
			current = current.next;
		}

		return head;
	}

}
