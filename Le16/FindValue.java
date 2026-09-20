package Le16;

public class FindValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 5, 2 };
		int trgt = 50;
		int ans = find(arr, trgt, 0);
		System.out.println(ans);
	}

	public static int find(int arr[], int trgt, int idx) {
		if (idx == arr.length) {
			return -1;
		}

		if (arr[idx] == trgt) {

			return idx;
		} else {
			int res = find(arr, trgt, idx + 1);
			return res;
		}
	}

}
