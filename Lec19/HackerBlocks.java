package Lec19;

public class HackerBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 7, 15, 20, 30 };
		int b[] = { 1, 10, 25, 35 };
		sol(a, b, true, 0, 0, -1, "");
	}

	public static void sol(int a[], int b[], boolean flag, int idxa, int idxb, int lval, String ans) {
		if (flag == true && ans.length() != 0) {
			System.out.println(ans);
		}
		if (flag == true) // A se lena h
		{
			for (int i = idxa; i < a.length; i++) {
				if (a[i] > lval) {
					sol(a, b, false, i + 1, idxb, a[i], ans + a[i] + ",");
				}
			}
		} else { // iska mtlb flag false h B se lena h
			for (int i = idxb; i < b.length; i++) {
				if (b[i] > lval) {
					sol(a, b, true, idxa, i + 1, b[i], ans + b[i] + ",");
				}
			}
		}
	}

}
