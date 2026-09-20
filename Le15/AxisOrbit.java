package Le15;

public class AxisOrbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int sol(String str)
	{
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			cnt+=1;
			int prev=i-1;
			int next=i+1;
			while(prev>=0&&next<str.length()&&str.charAt(prev)==str.charAt(next))
			{
				cnt+=1;
				prev--;
				next++;
			}
		}
		for(double i=0.5;i<str.length();i++)
		{
			int prev=(int)(i-0.5);
			int next=(int)(i+0.5);
			while(prev>=0&&next<str.length()&&str.charAt(prev)==str.charAt(next))
			{
				cnt+=1;
				prev--;
				next++;
			}
		}
		return cnt;
	}
}
