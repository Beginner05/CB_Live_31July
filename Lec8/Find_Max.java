package Lec8;

public class Find_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,5,3,8,9};
max(arr);
	}
	public static int max(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			max=Math.max(max,arr[i]);
		}
		return max;
	}

}
