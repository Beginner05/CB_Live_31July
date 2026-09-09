package Lec12;

public class KokoEatingBanana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 6, 7, 11 };
		int hrs = 8;
		sol(arr, hrs);
	}

	public static int sol(int arr[], int hrs) {
		int lo = 1;
		int hi = 0;
		for (int i = 0; i < arr.length; i++) {
			hi += arr[i];
		}
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isItPossible(arr, mid, hrs) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;

	}

	public static boolean isItPossible(int arr[], int phs, int hrs) {
		int time = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= phs) {
				time += 1;
			} else {
				if (arr[i] % phs == 0) {
					time += arr[i] / phs;
				} else {
					time += arr[i] / phs + 1;
				}
			}

		}
		if (time > hrs)
			return false;
		return true;

	}

}
