package Lec25;

import java.util.Stack;

public class Stockspan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {100,80,60,70,60,75,85};
solOpt(arr);
	}
	public static int[] sol(int arr[])
	{
		int res[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int cnt=1;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[i]>=arr[j])
				{
					cnt++;
				}
				else {
					break;
				}
			}
			res[i]=cnt;
		}
		return res;
	}

	public static int[] solOpt(int arr[])
	{
		Stack<Integer>s=new Stack();
		int res[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			while(s.isEmpty()==false&&arr[s.peek()]<arr[i])
{
res[s.pop()]=i;	
}
			s.push(i);
		
	}
		while(!s.isEmpty())
		{
			res[s.pop()]=-1;
		}
		for(int i=0;i<res.length;i++)
		{
//			System.out.print(res[i]+" ");
			if(res[i]==-1)
			{
				res[i]=i+1;
			}
			else {
				res[i]=i-res[i];
			}
			System.out.print(res[i]+" ");
			
			
		}
		return res;
}
}