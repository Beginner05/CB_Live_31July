package Lec7;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=scn.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
	System.out.println("Enter the value for "+i +" th index ");
	arr[i]=scn.nextInt();
}
int trgt=scn.nextInt();
int res=find(arr,trgt);
	System.out.println(res);
	}
	public static int find(int arr[],int trgt)
	{
		int idx=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==trgt)
			{
				idx=i;
//				break;
			}
			else {
				
			}
		}
		return idx;
	}

}
//5 1 3 5 7 9 60