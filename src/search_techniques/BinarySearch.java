package search_techniques;

import java.util.LinkedList;
import sorting_methods.binary_insertion_sort.Number;

public class BinarySearch {
	public static int search(LinkedList<Integer> list, int wanted) {
		int low = 0, high = list.size() - 1, mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (list.get(mid) == wanted)
				return mid;
			if (list.get(mid) < wanted)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	public static int searchPossible(LinkedList<Number> list, int wanted) {
		int low = 0, high = list.size() - 1, mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (list.get(mid).getValue() == wanted)
				return mid;
			if (list.get(mid).getValue() < wanted)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return low; // If not found, low will contain the possible position for it.
	}

	public static int searchPossible(LinkedList<Number> list, int wanted, int from, int to) {
		int low = from, high = to, mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (list.get(mid).getValue() == wanted)
				return mid;
			if (list.get(mid).getValue() < wanted)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return low; // If not found, low will contain the possible position for it.
	}

	public static int searchPossible(int[] numbers, int wanted) {
		int low = 0, high = numbers.length, mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (numbers[mid] == wanted)
				return mid;
			if (numbers[mid] < wanted)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return low; // If not found, low will contain the possible position for it.
	}

	public static int searchPossible(int[] numbers, int wanted, int from, int to) {
		int low = from, high = to, mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (numbers[mid] == wanted)
				return mid;
			if (numbers[mid] < wanted)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return low; // If not found, low will contain the possible position for it.
	}

	public static int recursiveBinarySearch(int[] srcArray, int wanted) {
		return recBinSrch(srcArray, wanted, 0, srcArray.length - 1);
	}

	private static int recBinSrch(int[] srcArray, int wanted, int low, int high) {
		if (low > high)
			return low;
		int mid = (low + high) / 2;
		if (srcArray[mid] == wanted)
			return mid;
		else if (srcArray[mid] < wanted)
			return recBinSrch(srcArray, wanted, mid + 1, high);
		else
			return recBinSrch(srcArray, wanted, low, mid - 1);
	}
}
