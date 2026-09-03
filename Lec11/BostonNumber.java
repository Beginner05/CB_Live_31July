package Lec11;
import java.util.Scanner;
public class BostonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sol();
	}
	public static void sol()
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int digiSum=digiSum(n);
		while(digiSum>=10)
		{
			digiSum=digiSum(digiSum);
		}
		int primeSum=primeSum(n);
		while(primeSum>=10)
		{
			primeSum=digiSum(primeSum);
		}
		if(digiSum==primeSum)
		{
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	public static int digiSum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
	}
public static int primeSum(int n)
{
	int sum=0;
	int i=2;
	while(n>1)
	{
		if(n%i==0)
		{
			n=n/i;
			sum+=i;
		}
		else {
			i++;
		}
	}
	return sum;
}
}
