package Lec23;

public class Construct2 extends Construct {

	@Override
	public void push(int val)
	{
		if(size==arr.length)
		{
		int res[]=new int[2*arr.length];
		for(int i=0;i<arr.length;i++)
		{
			res[i]=arr[i];
		}
		arr=res;
	}
		tos++;
		arr[tos]=val;
		size++;
}
}
