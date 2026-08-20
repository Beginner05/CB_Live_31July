package Lec6;
import java.util.Scanner;
public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
int n=scn.nextInt();
System.out.println(n +"inside main");
	fun(n);
	}
	public static void fun(int val)
	{
		System.out.println(val+" inside fun");
	}

}
