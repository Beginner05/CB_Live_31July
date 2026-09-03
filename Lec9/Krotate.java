package Lec9;

public class Krotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void solOpt(int arr[], int k) {
		k = k % arr.length;
//		step 1;
		int idx = arr.length - k;
		rotate(arr, idx, arr.length);
		rotate(arr, 0, idx - 1);
		rotate(arr, 0, arr.length - 1);
	}

	public static void rotate(int arr[], int strt, int end) {
		while (strt < end) {
			int temp = arr[strt];
			arr[strt] = arr[end];
			arr[end] = temp;
			strt++;
			end--;
		}
	}

	public static void sol(int arr[], int k) {
		k = k % arr.length;
		while (k-- > 0) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = temp;
		}
	}
}
