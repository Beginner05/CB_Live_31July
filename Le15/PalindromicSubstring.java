package Le15;

public class PalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		sol(str);
	}

	public static void sol(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String s = str.substring(i, j + 1);
				boolean res = check(s);
				if (res == true) {
					cnt += 1;
				}
			}
		}
	}

	public static boolean check(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
