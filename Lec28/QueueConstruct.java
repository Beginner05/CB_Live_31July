package Lec28;

public class QueueConstruct {

	int arr[];
	int size=0;
	int tail=-1; // last element kha insert hua 
	int front=0; //kha se element niklega
	 public QueueConstruct()
	 {
		 arr=new int[5];
	 }
	 public QueueConstruct(int capacity)
	 {
		 arr=new int[capacity];
	 }
	
	public  boolean enqueue(int val)
	{
		
		if(size==arr.length)
		{
			System.out.println("queue is full");
			return false;
		}
		tail++;
		
		
		arr[tail%arr.length]=val;
		size++;
		return true;
		
	}
	public int dequeue()
	{
		if(isEmpty()==true)
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		int temp=arr[front];
		front ++;
		size--;
		return temp;
	}
	
	public int peek()
	{
		if(size==0)
		{
			System.out.println("Queue is Empty");
			return -1;
		}
			
			return arr[front];
		
	}
	public boolean isEmpty()
	{
		if(size==0)return true;
		return false;
	}
	public void display()
	{
		
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[(front+i)%arr.length]+" ");
		}
	}
	
	
	
}
