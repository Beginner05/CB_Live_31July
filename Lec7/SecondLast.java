package Lec7;

public class SecondLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,22,12,3,2};
int trgt=2;
int last=-1;
int slast=-1;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==trgt)
	{
		if(last==-1)
		{
			last=i;
		}
		else {
			slast=last;
			last=i;
		}
	}
}
if(slast==-1)
{
	System.out.println(" second occurance not found");
}
System.out.println(slast);
	}

}
