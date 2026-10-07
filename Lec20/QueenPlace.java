package Lec20;

public class QueenPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[1][4];
//tq= total queen
//qpsf=queen place so far
boolean visited[][]=new boolean[1][4];
sol(arr,0,0,arr.length-1,arr[0].length-1,2,0,visited,"");
	}
	public static void sol(int arr[][],int cr,int cc,int er,int ec,int tq,int qpsf,boolean visited[][],String ans)
	{
		if(tq==qpsf)
		{
			System.out.println(ans);
			return;
		}
		if(cr>er||cc>ec)return ;
		visited[cr][cc]=true;
//		chnges kre jaate hue 
		sol(arr,cr,cc+1,er,ec,tq,qpsf+1,visited,ans+"{ "+cr+" "+cc+" }");
		visited[cr][cc]=false;
	sol(arr,cr,cc+1,er,ec,tq,qpsf,visited,ans);
	}

}
