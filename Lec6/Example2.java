package Lec6;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first line");
		fun1();
		System.out.println("2nd line");


		fun2();
		System.out.println("last line");
	}

	public static void fun1() {
		int a = 10;
		int b = 20;
		int c = a + b + 10;
		System.out.println(c);

int res=10;
		System.out.println(res);
	}

	public static int fun2() {
		int a = 10;
		int b = 20;
		int res = a + b;

		return res;
	}
}
