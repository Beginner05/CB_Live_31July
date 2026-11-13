package Lec29;

public class Construct {

	class Node {

		int val;
		Node next;
	}

	Node head;
	Node tail;
	int size = 0;

	public void addFirst(int val) {
		if (head == null) {
			Node nn = new Node();
			nn.val = val;
			head = nn;
			tail = nn;
			size++;
		} else {
			Node nn = new Node();
			nn.val = val;
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void addLast(int val) {

		if (head == null) {
			Node nn = new Node();
			nn.val = val;
			head = nn;
			tail = nn;
		} else {
			Node nn = new Node();
			nn.val = val;
			tail.next = nn;
			tail = nn;
		}
		size++;

	}

	public void removeFirst() {
		if (head == null)
			return;
		head = head.next;
		size--;
	}

	public void removeLast() {
		if (head == null)
			return;
		if (head == tail) {
			head = null;
			tail = null;
			size--;
			return;
		}
		Node temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		temp.next = null;
		tail = temp;
		size--;
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public Node getAt(int idx)
	{
		if(idx==0) return head;
		if(idx==size-1)return tail;
		if(idx<0||idx>=size)return null;
		Node temp=head;
		while(idx>0)
		{
			temp=temp.next;
			idx--;
		}
		return temp;
		
	}
	public void addAt(int idx,int val)
	{
		if(idx==0) {
			addFirst(val);
			return;
		}
		if(idx==size) {
			addLast(val);
			return;
		}
		if(idx<0||idx>size)return;
		Node nn=new Node();
		nn.val=val;
		Node temp=getAt(idx-1);
		nn.next=temp.next;
		temp.next=nn;
		
		
	}
	
	
	
	
	
	
	

}
