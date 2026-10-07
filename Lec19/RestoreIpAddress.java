package Lec19;

public class RestoreIpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="0000";
sol(str,"",0);
	}
	public static void sol(String str,String ans,int cnt)
	{
		if(cnt==4&&str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			String s=str.substring(0,i+1);
			if(Integer.parseInt(s)>255)return;
//			ki no h vo 255 tk he h 
			if(cnt==3)
			sol(str.substring(i+1),ans+s,cnt+1);
			else
				sol(str.substring(i+1),ans+s+".",cnt+1);
			
		}
	}

}
