package Le16;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res=sol(0,4,4);
	System.out.println(res);
	}
	public static int sol(int cp,int dest,int dice )
	{
		if(cp==dest)return 1;
		if(cp>dest)return 0;
		int cnt=0;
		for(int jump=1;jump<=dice;jump++)
		{
		 cnt+=sol(cp+jump,dest,dice);
		}
		return cnt;
		
	}

}
