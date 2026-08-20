package Lec8;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		int res=find(arr);
		System.out.println(res);
	}

	public static int find(int arr[]) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int lmax = arr[i];
			int rmax = arr[i];
			for (int j = 0; j < i; j++) {
				lmax = Math.max(lmax, arr[j]);
			}
			for (int j = i + 1; j < arr.length; j++) {
				rmax = Math.max(rmax, arr[j]);
			}
//			yha iss line pr aane k baad mere lmax me left ki max value or 
//		rmax me right ki max value h 
			ans += Math.min(lmax, rmax) - arr[i];
		}
		return ans;
	}

}
