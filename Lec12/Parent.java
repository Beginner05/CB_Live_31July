package Lec12;

public class Parent {

	static int val=4;
	public static boolean isBadVersion(int n)
	{
//		System.out.println("Inside fun");
		if(n>=val)return true;
		return false;
	}
}
