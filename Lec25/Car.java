package Lec25;

public class Car implements Vechile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int tyre() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int body() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Black");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("-w16 engine");
	}
public static void fun()
{
	System.out.println("Inside fun");
}
}
