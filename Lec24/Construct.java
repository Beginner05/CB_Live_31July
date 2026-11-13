package Lec24;

public class Construct {

	class Node {
		int val;
		Node next;
	}

	int size = 0;
	Node head = null;
	Node tail = null;

	public void addFirst(int val) {
		Node nn = new Node();
		nn.val = val;
		if (head == null) {
			head = nn;
			tail = nn;
		} else {
			nn.next = head;
			head = nn;
		}
		size++;
	}

	public void addLast(int val) {
		Node nn = new Node();
		nn.val = val;
		if (head == null) {
			head = nn;
			tail = nn;

		} else {
			tail.next = nn;
			tail = nn;
		}
		size++;
	}

	public void removeFirst() {
		if (head == null) {
			return;
		} else {
			head = head.next;
			size--;
		}
	}

	public void removeLast() {
		if (head == null)
			return;
		Node temp = head;
		if (head == tail) {
			head = null;
			return;
		}
		while (temp.next != tail) {
			temp = temp.next;
		}
		temp.next = null;
		tail = temp;
		size--;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public Node getAt(int idx) {
		if (idx == 0)
			return head;
		if (idx == size - 1)
			return tail;
		if (idx < 0 || idx >= size)
			return null;
		Node temp = head;
		while (idx-- > 1) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAt(int idx, int val) {
		if (idx == 0) {
			addFirst(val);
			return;
		} else if (idx == size) {
			addLast(val);
			return;
		} else if (idx < 0 || idx > size)
			return;

		Node temp = getAt(idx - 1);
		Node nn = new Node();
		Node cur = temp.next;
		nn.val = val;
		temp.next = nn;
		nn.next = cur;
		size++;
	}

	public void removeAt(int idx) {
		if (idx == 0) {
			removeFirst();

		} else if (idx == size) {
			removeLast();
		} else if (idx < 0 || idx > size)
			return;
		Node temp = getAt(idx - 1);
		temp.next = temp.next.next;

	}
}
