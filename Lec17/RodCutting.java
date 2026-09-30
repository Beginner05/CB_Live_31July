package Lec17;

public class RodCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=sol(3, 0, new int[] { 8,7,5 });
	System.out.println(res);
	}

	public static int sol(int n, int profit, int price[]) {
		if (n == 0) {
			return profit;
		}
		int ans = Integer.MIN_VALUE;
		for (int cut = 1; cut <= n; cut++) {
			int res = sol(n - cut, profit + price[cut - 1], price);
			ans = Math.max(ans, res);
		}
		return ans;
	}

	
	
	
	
	
}
