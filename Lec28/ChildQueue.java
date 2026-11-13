package Lec28;

public class ChildQueue extends QueueConstruct {

	
	public boolean enqueue(int val)
	{
//		System.out.println("hey "+size);
		
		if(size==arr.length)
		{
//			System.out.println("inside");
			int res[]=new int[arr.length*2];
			int k=0;
			for(int i=0;i<size;i++)
			{
				res[k]=arr[(front+i)%arr.length];
				k++;
			}
			arr=res;
			front=0;
			tail++;
			arr[tail%arr.length]=val;
			size++;
			return true;
		}
		tail++;
		arr[tail%arr.length]=val;
		size++;
	return true;
	}
}
