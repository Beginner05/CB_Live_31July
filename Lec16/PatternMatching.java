package Lec16;
import java.util.Scanner;
public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String str=scn.next();
String pat=scn.next();
boolean res=check(str,pat);
	System.out.println(res);
	}
	public static boolean check(String str,String pat)
	{
		int i=0;
		while(i<str.length())
		{
			int j=0;
			while(j<pat.length()&&i+j<str.length()&&pat.charAt(j)==str.charAt(i+j))
			{
				j++;
				
			}
			if(j==pat.length())return true;
			i++;
		}
		return false;
	}

}
