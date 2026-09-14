package Lec14;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabbbvvvddedf";
		String res = compress(str);
		System.out.println(res);
	}

	public static String compress(String str) {
		String ans = "";
		for (int i = 0; i < str.length();) {
			int cnt = 1;
			int j = i + 1;
			while (j<str.length()&&str.charAt(i) == str.charAt(j)) {
				cnt += 1;
				j++;
			}
			if(cnt==1)
			{
				ans=ans+str.charAt(i);
			}
			else {
			ans = ans + str.charAt(i) + cnt;
			}
		i=j;
		}
		return ans;
	}

}
