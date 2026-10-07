package Lec20;

public class RatChasesChees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[][] = { { 'O', 'O', 'O', 'O' }, { 'O', 'O', 'O', 'X' }, { 'X', 'O', 'X', 'O' }, { 'X', 'O', 'O', 'X' },
				{ 'X', 'X', 'O', 'O' } };

		if (arr[arr.length - 1][arr[0].length - 1] == 'X') {
			System.out.println("No path found");
			return;
		}
		sol(arr, 0, 0, arr.length - 1, arr[0].length - 1, "", new boolean[arr.length][arr[0].length]);

	}

	public static void sol(char arr[][], int cr, int cc, int er, int ec, String ans, boolean visited[][]) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr < 0 || cc < 0 || cr > er || cc > ec || arr[cr][cc] == 'X' || visited[cr][cc] == true)
			return;
//		up
		visited[cr][cc] = true;
		sol(arr, cr - 1, cc, er, ec, ans + "U", visited);
//		down
		sol(arr, cr + 1, cc, er, ec, ans + "D", visited);
//		left
		sol(arr, cr, cc - 1, er, ec, ans + "L", visited);
//		right
		sol(arr, cr, cc + 1, er, ec, ans + "R", visited);
		visited[cr][cc] = false;

	}

}
