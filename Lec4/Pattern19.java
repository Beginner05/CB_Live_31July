package Lec4;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=n/2;
		int nsp=1;
		int row=0;
		while(row<n)
		{
			if(row==0||row==n-1)
			{
				for(int cst=0;cst<n;cst++)
				{
					System.out.print("* ");
				}
				System.out.println();
				row++;
				continue;
			}
			else {
				for(int cst=0;cst<nst;cst++)
				{
					System.out.print("* ");
				}
				for(int csp=0;csp<nsp;csp++)
				{
					System.out.print("  ");
				}
				for(int cst=0;cst<nst;cst++)
				{
					System.out.print("* ");
				}	
			}
			
			System.out.println();
			if(row<n/2)
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
