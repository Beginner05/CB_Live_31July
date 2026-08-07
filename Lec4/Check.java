package Lec4;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int r=1;r<=n;r++){
			 for(int s=1;s<=2*r-2;s++){
			System.out.print(" ");
			 }
			for (int c=1;c<=n-r+1;c++){
			System.out.print("*");
			 }
			System.out.println();
			 }
			for (int r=1;r<=n-1;r++){
			for(int s=1;s<=2*(n-r-1);s++){
			System.out.print(" ");
			 }
			for (int c=1;c<=r+1;c++){
			System.out.print("*");
			 }
			System.out.println();
			 }
	}

}
