package Sort;

public class BunbleSort {

	public static void main(String[] args) {

		int[] test = { 1, 2, 3, 4, 5, 34, 4, 77, 8766, 2, 3, 32, 434, 54, 6, 1, 1 };
		test = sort(test);
	}

	private static int[] sort(int[] test) {
		for (int i = 0; i < test.length-1; i++) {
			for (int j = 0; j < test.length-1-i; j++) {
				if (test[j] > test[j + 1]) {
					int com = test[j];
					test[j] = test[j + 1];
					test[j + 1] = com;
				} 
			}
			System.out.println();
			for (int x : test) {
				System.out.print(x + "  ");
			}
		}
		return test;
	}

}
