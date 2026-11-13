package Lec24;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Construct c=new Construct();
c.addFirst(10);
c.addFirst(20);
c.addFirst(30);
c.display();
c.removeAt(2);
c.addAt(0, 100);


c.display();
	}

}
