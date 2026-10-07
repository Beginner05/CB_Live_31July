package Lec19;

public class HeadTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sol(4,"");
	}
	public static void sol(int n,String ans)
	{
		if(ans.length()==n)
			{
			System.out.println(ans);
			return;
			}
			sol(n,ans+"H");
		sol(n,ans+"T");
	}

}
