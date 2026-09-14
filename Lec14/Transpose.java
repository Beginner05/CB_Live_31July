package Lec14;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		int res[][]=transpose(arr);
for(int i=0;i<res.length;i++)
{
	for(int j=0;j<res[0].length;j++)
	{
		System.out.print(res[i][j]+" ");
	}
	System.out.println();
}
	}

	public static int[][] transpose(int arr[][]) {
		int res[][] = new int[arr[0].length][arr.length];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				res[col][row] = arr[row][col];
			}
		}

		return res;
	}

}
