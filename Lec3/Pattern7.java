package Lec3;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=n-2;
		int nsp=n-2;
		for(int row=0;row<n;row++)
		{
			if(row==0||row==n-1)
			{
//				ya toh row ==0 h ya fr row== last h
				for(int cst=0;cst<nst;cst++)
				{
					System.out.print("* ");
				}
			}
			else {
				
//				mtlb yeh h ki row jo h vo 0 se badi h or n-1 se choti h
				System.out.print("* ");
				for(int csp=0;csp<nsp;csp++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
}
