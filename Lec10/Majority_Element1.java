package Lec10;

public class Majority_Element1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="a";
		String s2="b";
System.out.println(s1.compareTo(s2));
	}

	public static int sol(int arr[]) {
		int cnt = 0;
		int val = 10;
		for (int i = 0; i < arr.length; i++) {
			if (cnt == 0) {
				cnt = 1;
				val = arr[i];

			} else if (val == arr[i]) {
				cnt += 1;
			} else {
				cnt--;
			}

		}
		return val;
	}
}
