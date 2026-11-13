package Lec25;

public class Bike implements Vechile{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike b=new Bike();
System.out.println(b.body());
System.out.println(b.tyre());
b.color();
b.engine();
	}

	@Override
	public int tyre() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int body() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Green");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("w16 engine");
	}
public static void fun()
{
	System.out.println("Inside fun");
}
}
