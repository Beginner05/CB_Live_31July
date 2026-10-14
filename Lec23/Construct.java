package Lec23;

public class Construct {

	
	int arr[];
	public Construct()
	{
		System.out.println("Default hu me");
		arr=new int[5];
	}
	public Construct(int cap)
	{
		System.out.println("Parameter wala hun me");
		arr=new int[cap];
	}
	 int tos=-1;
	  int size=0;
	public void push(int val)
	{
		if(size==arr.length)
		{
			
		}
		tos++;
		
		arr[tos]=val;
//		tos++;
		size++;
	}
	public int pop()
	{
		if(tos==-1) {
			System.out.println("Stack khali h");
		return -1;	
		}
		int temp=arr[tos];
		tos--;
		size--;
		return temp;
	}
	public int peek()
	{
		if(tos==-1)
		{
			System.out.println("stack is empty");
			return -1;
		}
		return arr[tos];
	}
	public boolean isEmpty()
	{
//		if(tos==-1)return true;
//		return false
	return tos==-1;
		
		}
	public int size()
	{
		return size;
	}
	
	public void display()
	{
		for(int i=tos;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static  void check()
	{
		System.out.println("inside check");
	}
	
	
	
}
