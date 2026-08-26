package Lec9;

public class Krotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
public static void sol(int arr[],int k)
{
	k=k%arr.length;
	while(k-->0)
	{
	int temp=arr[arr.length-1];
	for(int i=arr.length-2;i>=0;i--)
	{
		arr[i+1]=arr[i];
	}
	arr[0]=temp;
	}
}
}
