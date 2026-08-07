package Lec3;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int nst=5;
		for(int row=n;row>0;row--)
		{
			for(int cst=0;cst<nst;cst++)
			{
				System.out.print("* ");
			}
			nst--;
			System.out.println();
		}
	}

}
