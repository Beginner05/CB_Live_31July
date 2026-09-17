package Le15;

public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 30, 5, 9, 34 };
		String str = sol(arr);
		System.out.println(str);
	}

	public static String sol(int arr[]) {
		String ans = "";
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {
				String s1 = arr[j] + "" + arr[j + 1];
				String s2 = arr[j + 1] + "" + arr[j];
//				int val1 = Integer.parseInt(s1);
//				int val2 = Integer.parseInt(s2);
				if (s1.compareTo(s2) < 0) {
					int val = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = val;
				}
			}
		}
		if (arr[0] == 0)
			return "0";
		for (int i = 0; i < arr.length; i++) {
			ans = ans + arr[i];
		}
		return ans;
	}

}
