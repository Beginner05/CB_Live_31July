package Lec4;

import java.util.Scanner;

public class Odd_EvenSum {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int odd_Sum = 0;
		int even_Sum = 0;
		int cnt=1;
		while (n > 0) {

			int rem = n % 10;
			if (cnt % 2 == 0) {
				even_Sum += rem;
			} else {
				odd_Sum += rem;
			}
			n = n / 10;
			cnt++;
		}
		System.out.println("oddSum is "+ odd_Sum);
		System.out.println("evenSum is "+ even_Sum);
	}
}
