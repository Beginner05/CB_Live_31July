package Lec17;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[3][3];
int res=sol(0,0,arr.length-1,arr[0].length-1);
	System.out.println(res);
	}
	public static int sol(int cr,int cc,int er,int ec)
	{
		if(cr>er||cc>ec)return 0;
		if(cr==er&&cc==ec)return 1;
		int h=sol(cr,cc+1,er,ec);
		int v=sol(cr+1,cc,er,ec);
		return h+v;
	}

}
