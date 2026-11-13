package Lec29;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Construct c=new Construct();
c.addLast(10);
c.addLast(20);
c.addLast(30);
c.addLast(40);
c.addLast(50);

// if(temp!=null)System.out.println((Object)(temp.val));
c.display();
c.addAt(4, 100);
c.addAt(3, 670);
c.display();
	}

}
