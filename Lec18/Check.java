package Lec18;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[4][4];
sol(arr,0,0,arr.length-1,arr[0].length-1);
	}
	public static void sol(int arr[][],int cr,int cc,int er,int ec)
	{
		if(cr<0||cc<0)return;
//		up
		sol(arr,cr-1,cc,er,ec);
		
//		down
		sol(arr,cr+1,cc,er,ec);
		
//		left
		sol(arr,cr,cc-1,er,ec);
		
//		right
		sol(arr,cr,cc+1,er,ec);
	}

}
