package Lec13;

import java.util.Scanner;

public class Construct {

	public static void main(String args[])
	{
Scanner scn=new Scanner(System.in);
int arr[][]=new int[3][2];

for(int row=0;row<arr.length;row++)
{
	for(int col=0;col<arr[row].length;col++)
	{
		arr[row][col]=scn.nextInt();
	}
}
	}
}
