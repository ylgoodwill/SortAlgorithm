package Sort;

public class SelcecSort {

	public static void main(String[] args) {

		int[] test = { 1, 2, 3, 4, 5, 34, 4, 77, 8766, 2, 3, 32, 434, 54, 6, 10000, 1 };
		selectSort(test);
		for (int x : test) {
			System.out.print(x + "  ");
		}

	}

	private static void selectSort(int[] test) {

		for (int i = 0; i < test.length; i++) {
			int tem = test[i];
			int index = i;
			for (int j = i + 1; j < test.length; j++) {
				if (test[j] < tem) {
					tem = test[j];
					index = j;
				}
			}
			test[index] = test[i];
			test[i] = tem;			
		}
	}

}
