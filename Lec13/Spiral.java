package Lec13;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 }, { 11, 12, 13, 14 }, { 16, 17, 18, 19 }, { 21, 22, 23, 24 } };
		int sr = 0;
		int sc = 0;
		int er = arr.length - 1;
		int ec = arr[0].length - 1;
		int total = arr.length * arr[0].length;
		int cnt = 0;
		while (cnt < total) {
			for (int col = sc; col <= ec&&cnt<total; col++) {
				System.out.print(arr[sr][col] + " ");
				cnt++;
			}
			sr++;

			for (int row = sr; row <= er&&cnt<total; row++) {
				System.out.print(arr[row][ec] + " ");
				cnt++;
			}
			ec--;
			for (int col = ec; col >= sc&&cnt<total; col--) {
				System.out.print(arr[er][col] + " ");
				cnt++;
			}
			er--;
			for (int row = er; row >= sr&&cnt<total; row--) {
				System.out.print(arr[row][sc] + " ");
				cnt++;
			}
			sc++;

		}

	}

}
