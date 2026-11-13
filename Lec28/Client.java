package Lec28;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildQueue q=new ChildQueue();
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.enqueue(40);
q.enqueue(50);
q.enqueue(60);
q.enqueue(70);
q.enqueue(80);
q.enqueue(90);
q.enqueue(100);
q.enqueue(110);
q.enqueue(120);
q.dequeue();
q.dequeue();
q.dequeue();
q.dequeue();
q.dequeue();
q.dequeue();
q.dequeue();
q.dequeue();
q.dequeue();
q.dequeue();
q.dequeue();
q.dequeue();
q.enqueue(130);
q.enqueue(140);
q.enqueue(150);
q.enqueue(150);
q.enqueue(150);
q.enqueue(150);
q.enqueue(150);
q.enqueue(150);
q.enqueue(150);
q.enqueue(150);
q.enqueue(150);
q.enqueue(150);
q.enqueue(150);
q.display();
//q.enqueue(10);


	}

}
