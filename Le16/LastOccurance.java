package Le16;

public class LastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 1, 1 };
		int trgt = 1;
		int res=find(arr, trgt, 0,4);
	System.out.println(res);
	}

	public static int find(int arr[], int trgt, int idx,int li) {
		if (arr.length == idx)
			return li;
		if (arr[idx] == trgt) {
			int res = find(arr, trgt, idx + 1,idx);
			if (res == -1) {
				res = idx;
			}
			return li;
		} else {
			int res = find(arr, trgt, idx + 1,li);
			return res;
		}
	}

}
