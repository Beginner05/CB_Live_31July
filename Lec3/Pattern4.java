package Lec3;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nst=5;
int nsp=0;
int n=5;
for(int row=0;row<n;row++)
{
//	phele space h 
	for(int csp=0;csp<nsp;csp++)
	{
		System.out.print("  ");
	}
//	stars ka kaam h 
	for(int cst=0;cst<nst;cst++)
	{
		System.out.print("* ");
	}
	
	System.out.println();
	nst--;
	nsp++;
}
	}

}
