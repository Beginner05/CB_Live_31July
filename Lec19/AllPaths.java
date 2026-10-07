package Lec19;

public class AllPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ans=sol(0,0,2,2,new boolean[3][3],"");
	System.out.println(ans);
	}
	public static int  sol(int cr,int cc,int er,int ec,boolean visited[][],String ans)
	{
		if(cr==er&&cc==ec)
			{System.out.println(ans);
			return 1;
			}
			if(cr<0||cc<0||cr>er||cc>ec||visited[cr][cc]==true)return 0;
		visited[cr][cc]=true;
		int up=sol(cr-1,cc,er,ec,visited,ans+"U");
		int down=sol(cr+1,cc,er,ec,visited,ans+"D");
		int left=sol(cr,cc-1,er,ec,visited,ans+"L");
		int right=sol(cr,cc+1,er,ec,visited,ans+"R");
	visited[cr][cc]=false;
	return up+down+left+right;
	}
}
