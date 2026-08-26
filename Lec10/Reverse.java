package Lec10;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};
for(int k=0;k<arr.length;k++)
{
	System.out.print(arr[k]+" ");
}
System.out.println();
int i=0;
int j=arr.length-1;
while(i<j)
{
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	i++;
	j--;
}
for(int k=0;k<arr.length;k++)
{
	System.out.print(arr[k]+" ");
}
	}

}
