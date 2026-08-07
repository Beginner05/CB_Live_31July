package Lec4;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int total=2*n-1;
int nsp=0;
int nst=n;
int row=0;
while(row<total)
{
	for(int csp=0;csp<nsp;csp++)
	{
		System.out.print("  ");
	}
	for(int cst=0;cst<nst;cst++)
	{
		System.out.print("* ");
	}
	System.out.println();
	if(row<total/2)
	{
		nsp+=2;
		nst--;
	}
	else {
		nsp-=2;
		nst++;
	}
	row++;
}

	}

}
