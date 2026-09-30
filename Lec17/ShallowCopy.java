package Lec17;

import java.util.ArrayList;

public class ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>l1=new ArrayList();
l1.add(10);
l1.add(20);
l1.add(30);
l1.add(40);
ArrayList<Integer>l2=new ArrayList(l1);
for(int i=0;i<l1.size();i++)
{
	l2.add(l1.get(i));
}
System.out.println(l1);
System.out.println(l2);
	l1.remove(2);
	l1.remove(0);
	System.out.println(l1);
	System.out.println(l2);
	}
}
