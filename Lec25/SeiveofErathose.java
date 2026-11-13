package Lec25;
import java.util.*;
public class SeiveofErathose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		sol(n);
	}
	public static void sol(int n)
	{
		Stack<int[]>s=new Stack();
		boolean arr[]=new boolean[n+1];
		for(int i=2;i*i<=n;i++)
		{
			if(arr[i]==true)continue;
			int j=2;
			while(i*j<=n)
			{
				arr[i*j]=true;
				j++;
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(arr[i]==false)System.out.print(i+" ");
		}
			
	}

}
