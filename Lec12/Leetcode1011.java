package Lec12;

public class Leetcode1011 {
	public static void main(String args[]) {
		int arr[] = {};
		int res = sol(arr, 5);
		System.out.println(res);
	}

	public static int sol(int arr[], int days) {
		int lo = 1;
		int hi = 0;
		for (int i = 0; i < arr.length; i++) {
			hi += arr[i];
		}
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isItPossible(arr, mid, days) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;

	}

	public static boolean isItPossible(int arr[], int mid, int days) {
//		recap=Remaining capacity 
		int day = 1;
		int recap = mid;
		for (int i = 0; i < arr.length; ) {
			if (recap >= arr[i]) {
				recap = recap - arr[i];
				i++;
			} else {
				day++;
				recap = mid;
			}
			if (day > days)
				return false;
		}
		return true;
	}

}
