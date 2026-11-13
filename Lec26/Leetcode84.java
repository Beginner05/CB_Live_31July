package Lec26;

public class Leetcode84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, 5, 6, 2, 3 };
		sol(arr);
	}

	public static int solOpt(int arr[])
	{
		Stack<Integer>s=new Stack();
		int left[]=new int[arr.length];
		int right[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			while(s.isEmpty()==false&&arr[s.peek()]>arr[i])
			{
				right[s.pop()]=i;
			}
			s.push(i);
		}
		while(s.isEmpty()==false)
		{
			right[s.pop()]=-1;
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			while(s.isEmpty()==false&&arr[s.peek()]>arr[i])
			{
				left[s.pop()]=i;
			}
			s.push(i);
		}
		while(s.isEmpty()==false)
		{
			left[s.pop()]=-1;
		}
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
//		case 1 left[i]==-1&&right[i]==-1
if(left[i]==-1&&right[i]==-1)
{
	int ans=arr.length*arr[i];
	max=Math.max(ans, max);
}
// left[i]==-1&&right[i]1=-1
else if(left[i]==-1&&right[i]!=-1)
{
	int ans=i+1+(right[i]-i-1)*arr[i];
	max=Math.max(ans, max);
}
 // left[i]!=-1&&right[i]==-1 
else if(left[i]!=-1&&right[i]==-1)
{
int ans =(i-left[i]-1)+(arr.length-i-1)+1*arr[i];;	
max=Math.max(max, ans);
}
// left[i]!=-1&&right[i]!=-1;
else if(left[i]!=-1&&right[i]!=-1)
{
	int ans=(i-left[i]-1)+(right[i]-i-1)+1*arr[i];
	max=Math.max(max, ans);
}


	}
		return max;
	}
	public static void sol(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int left = 0;
			int right = 0;
			int self = 1;

			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] >= arr[i])
					left++;
				else
					break;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] >= arr[i])
					right++;
				else
					break;
			}
			int width = left + right + self;
			int length = arr[i];
			int ans = length * width;
			max = Math.max(ans, max);

		}
		return max;
	}

}
