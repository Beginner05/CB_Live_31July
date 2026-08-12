package Lec5;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int ans=0;
int multi=1;
while(n>0)
{
	int rem=n%10;
	ans+=rem*multi;
	multi=multi*2;
	n=n/10;
}
System.out.println(ans);


	}

}
