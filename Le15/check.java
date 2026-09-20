package Le15;

import java.util.*;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer>q=new PriorityQueue(Collections.reverseOrder());
q.add(10);q.add(20);
System.out.println(q);
System.out.println(q.poll());

System.out.println(q);

System.out.println(q.peek());
	}
}