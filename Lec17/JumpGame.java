package Lec17;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,3,1,1,4};
		sol(arr,0);
	}
	public static boolean sol(int arr[],int idx)
	{
		if(idx==arr.length-1)return true;
		if(idx>=arr.length)return false;
		for(int jump=1;jump<=arr[idx];jump++)
		{
			boolean res=sol(arr,idx+jump);
		if(res==true)return true;
		}
		return false;
	}

}
