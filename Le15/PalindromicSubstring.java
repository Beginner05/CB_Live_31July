package Le15;

public class PalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc";
	sol(str);
	}
	public static void sol(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				System.out.println(str.substring(i,j+1));
			}
		}
	}
	

}
