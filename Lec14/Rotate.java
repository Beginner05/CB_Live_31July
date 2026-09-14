package Lec14;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(arr);
	}

	public static void rotate(int arr[][]) {
//		transpose;
		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr[0].length; col++) {
				int temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;
			}
		}
		for (int row = 0; row < arr.length; row++) {
			int strt = 0;
			int end = arr[row].length - 1;
			while (strt < end) {
				int temp = arr[row][strt];
				arr[row][strt] = arr[row][end];
				arr[row][end] = temp;
				strt++;
				end--;
			}
		}
	}
//ctlr+shift+f
}
