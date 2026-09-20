package Le16;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int c = 30;
		int b = 10;
		check();
		System.out.println("inside fun");
		fun();
		System.out.println("Bye");
	}

	public static void fun() {
		int a = 100;
		System.out.println("inside fun");

	}

	public static int check() {
		int a = 10;
		int b = 20;
		return a + b;
	}

}
