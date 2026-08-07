package Lec4;
import java.util.Scanner;
public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		boolean flag=true;
//		agr flag true h iska mtlb number prime h ;
		for(int i=1;i<n;i++)
		{
			
			if(n%i==0)
			{
				flag=false;
				System.out.println("Prime nhi h ");
				break;
			}
		
		}
		if(flag==true)
		{
		System.out.println("Prime h ");
		}
		}

}
