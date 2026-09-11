package Lec13;

public class RowWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
//		front to last;
				for (int col = 0; col < arr[0].length; col++) {
					System.out.print(arr[row][col] + " ");
				}
			} else {
//		last to front
				for (int col = arr[row].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + " ");
				}
			}
			System.out.println();
		}
	}

}
