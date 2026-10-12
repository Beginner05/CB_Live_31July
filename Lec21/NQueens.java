package Lec21;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
//tq=total queens
//qpsf=queens place so far
		int n = 4;
		sol(arr, 0, 0, arr.length - 1, arr[0].length - 1, arr.length, 0, "",new boolean[4][4]);
	}

	public static void sol(int arr[][], int cr, int cc, int er, int ec, int tq, int qpsf, String ans,
			boolean visited[][]) {
		if (tq == qpsf) {
			System.out.println(ans);
		}
		if(cr>er)return;
		if (arr.length - cr < tq - qpsf)
			return;
		if (cc > ec) {
			sol(arr, cr + 1, 0, er, ec, tq, qpsf, ans, visited);
			return;
		}
		if (isItPossible(cr, cc, visited) == true) {
			visited[cr][cc] = true;
			sol(arr, cr + 1, 0, er, ec, tq, qpsf + 1, ans + "{ " + cr + " " + cc + " }", visited);
			visited[cr][cc] = false;

			sol(arr, cr, cc + 1, er, ec, tq, qpsf, ans, visited);
		} else {
			sol(arr, cr, cc + 1, er, ec, tq, qpsf, ans, visited);
		}
	}

	public static boolean isItPossible(int cr, int cc, boolean visited[][]) {
//		row check
		for (int i = 0; i < cr; i++) {
			if (visited[i][cc] == true)
				return false;
		}
		int row = cr;
		int col = cc;
		while (row >= 0 && col >= 0) {
			if (visited[row][col] == true)
				return false;
			col--;
			row--;
		}
		row = cr;
		col = cc;
		while (row >= 0 && col < visited.length) {
			if (visited[row][col] == true)
				return false;
			col++;
			row--;
		}

		return true;

	}

}
