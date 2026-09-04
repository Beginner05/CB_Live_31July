package Lec12;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 4, 5, 8, 90, 100 };
		int trgt = 900;
		int res=find(arr, trgt);
	System.out.println(res);
	}

	public static int find(int arr[], int trgt) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == trgt) {
				return mid;
			} else if (arr[mid] > trgt) {
				hi = mid - 1;
			} else if (arr[mid] < trgt) {
				lo = mid + 1;
			}
		}
		return -1;
	}

}
