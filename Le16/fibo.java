package Le16;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int res=fibo(n);
	System.out.println(res);
	}
	public static int fibo(int n)
	{
		if(n==0||n==1)return n;
		int f=fibo(n-1);
		int s=fibo(n-2);
		return f+s;
	}

}
