package Lec24;
import java.util.Stack;
public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 5, 7, 5, 9, 6 };
		int res[] = solOpt(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public static int[] sol(int arr[]) {
		int res[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					res[i] = arr[j];
					break;
				}
			}
			if (res[i] == 0)
				res[i] = -1;
		}
		return res;
	}
	
	
	
	public static int[] solOpt(int arr[])
	{
		int res[]=new int[arr.length];
		Stack<Integer>s=new Stack();
	for(int i=0;i<arr.length;i++)
	{
		while(s.isEmpty()==false&&arr[i]>arr[s.peek()])
		{
			res[s.pop()]=arr[i];
		}
		s.push(i);
		
	}
	while(!s.isEmpty())
	{
		res[s.pop()]=-1;
	}
	return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
