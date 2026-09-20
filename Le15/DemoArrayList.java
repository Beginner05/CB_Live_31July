package Le15;
import java.util.ArrayList;
public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<>(1);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println(list.size());
	System.out.println(list.get(3));
	list.add(2,50);
	System.out.println(list);
	list.remove(2);
	System.out.println(list);
		
	}

}
