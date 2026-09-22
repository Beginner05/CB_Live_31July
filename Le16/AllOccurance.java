package Le16;

public class AllOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 1, 4, 1 };
		int trgt = 1;
		int res[]=find(arr, trgt, 0, 0);
	for(int i=0;i<res.length;i++)
	{
		System.out.print(res[i]+" ");
	}
	}

	public static int[] find(int arr[], int trgt, int idx, int cnt) {
		if (idx == arr.length) {
			int res[] = new int[cnt];
			return res;
		}
		if (arr[idx] == trgt) {
			int res[]=find(arr, trgt, idx + 1, cnt + 1);
			res[cnt]=idx;
			return res;
		} else {
			int res[]=find(arr, trgt, idx + 1, cnt);
			return res;
		}
	}

}
