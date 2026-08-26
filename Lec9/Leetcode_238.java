package Lec9;

public class Leetcode_238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4 };
	}

	public static int[] sol(int arr[]) {
		int res[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int left = 1;
			int right = 1;
			for (int j = 0; j < i; j++) {
				left = left * arr[j];
			}
			for (int j = i + 1; j < arr.length; j++) {
				right = right * arr[j];
			}
			res[i] = left * right;
		}
		return res;
	}

	public static int[] solOpt(int arr[]) {
		int res[] = new int[arr.length];
		int left[] = new int[arr.length];
		int right[] = new int[arr.length];
		left[0] = 1;
		right[arr.length - 1] = 1;
		for (int i = 1; i < arr.length; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}
		for (int i = arr.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}
		for (int i = 0; i < arr.length; i++) {
			res[i] = left[i] * right[i];
		}
		return res;
	}
}