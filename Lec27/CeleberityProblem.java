package Lec27;
import java.util.Stack;
public class CeleberityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 1, 0 }, { 0, 1, 0 }, { 0, 1, 1 } };
		int ans = sol(arr);
		System.out.println(ans);
	}

	public static int sol(int arr[][]) {
		Stack<Integer> s = new Stack();
		for (int i = 0; i < arr.length; i++) {
			s.push(i);
		}
		while (s.size() > 1) {
			int e1 = s.pop();
			int e2 = s.pop();

			if (arr[e1][e2] == 1 && arr[e2][e1] == 1) {
				continue;
			} else if (arr[e1][e2] == 0 && arr[e2][e1] == 0) {
				continue;
			} else if (arr[e1][e2] == 1 && arr[e2][e1] == 0) {
				s.push(e2);
			}

			else if (arr[e1][e2] == 0 && arr[e2][e1] == 1) {
				s.push(e1);
			}
		}
		if (s.size() == 0)
			return -1;
		int val = s.pop();
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][val] == 1)
				cnt += 1;
			else
				break;
		}
		if (cnt != arr.length)
			return -1;
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[val][i] == 1 && i != val) {
				flag = false;
				break;
			}
		}
		if (flag == true)
			return val;
		return -1;

	}

}
