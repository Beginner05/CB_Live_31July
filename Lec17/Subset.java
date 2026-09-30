package Lec17;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3};
sol(arr,0,"");
	}
	public static void sol(int arr[],int idx,String ans)
	{
		if(idx==arr.length)
		{
			System.out.println(ans);
			return;
		}
		sol(arr,idx+1,ans+arr[idx]);
		sol(arr,idx+1,ans);
	}

}
