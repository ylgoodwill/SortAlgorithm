package Sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] test = { 1, 2, 3, 4, 5, 34, 4, 77, 8766, 2, 3, 32, 434, 54, 6, 1, 1 };
		quickSort(test, 0, test.length - 1);
		for (int x : test) {
			System.out.print(x + "  ");
		}
	}

	private static void quickSort(int[] numbers, int low, int high) {
		if (low < high) {
			int middle = sortGetIndex(numbers, low, high);
			quickSort(numbers, low, middle - 1);
			quickSort(numbers, middle + 1, high);
		}
	}

	private static int sortGetIndex(int[] test, int start, int end) {
		int x = test[start];
		while (start < end) {
			while (start < end && x <= test[end]) {
				end--;
			}
			if (start < end) {
				test[start] = test[end];
			}
			while (start < end && x >= test[start]) {
				start++;
			}
			if (start < end) {
				test[end] = test[start];
			}
		}
		test[start] = x;
		return start;
	}
}
