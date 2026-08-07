package Lec3;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int nsp=n-1;
int nsp2=0;
for(int row=0;row<n;row++)
{
	if(row==0)
	{
		for(int csp=0;csp<nsp;csp++)
		{
			System.out.print("  ");
		}
		System.out.print("* ");
	}
	else if(row==n-1)
	{
		System.out.print("  ");
		for(int cst=0;cst<n;cst++)
		System.out.print("* ");
	}
	else {
		for(int csp=0;csp<nsp;csp++)
		{
			System.out.print("  ");
		}
		System.out.print("* ");
	for(int csp=0;csp<nsp2;csp++)
	{
		System.out.print("  ");
	}
	System.out.print("* ");
	}
	System.out.println();
	nsp--;
	nsp2+=1;
}
	}

}
