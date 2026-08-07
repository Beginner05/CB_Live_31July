package Lec4;

public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1002032;
		int cnt=0;
		while(n>0)
		{
			cnt+=1;
			n=n/10;
		}
		System.out.println(cnt);
	}

}
