package Lec11;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sol();
	}

	public static void sol() {
		int arr[] = { 1, 2, 3 };

		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = i; j < arr.length; j++) {
//				int sum=0;
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
					sum+=arr[k];
				}
				System.out.println("-> "+sum);
			}
		}
	}
		public static int solOpt(int arr[])
		{
			int sum=0;
			int max=0;
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i];
				max=Math.max(sum, max);
				if(sum<0)sum=0;
			}
			
			return max;
			
		}

	}


