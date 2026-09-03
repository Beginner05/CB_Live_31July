package Lec11;

import java.util.Scanner;

public class ChwebaccaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sol();
	}
	public static void sol()
	{
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
		long multi=1;
		long ans=0;
		while(n>0)
		{
			
			long  rem=n%10;
			
			if(9-rem<rem)
			{
				ans=(9-rem)*multi+ans;
			}
			else {
				ans=rem*multi+ans;
			}
			multi=multi*10;
			n=n/10;
		}
		System.out.println(ans);
	}

}
