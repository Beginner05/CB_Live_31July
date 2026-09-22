package Le16;

public class FindAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 1 };
		int trgt = 1;
		int res=find(arr, trgt, 0, 0);  //2
	System.out.println(res);
	}

	public static int find(int arr[], int trgt, int idx, int cnt) {
		if(idx==arr.length)return cnt;
		
		if (arr[idx] == trgt) {
			int res = find(arr, trgt, idx + 1, cnt + 1);
			return res;
		} else {
			int res = find(arr, trgt, idx + 1, cnt);
			return res;
		}
	}

}
