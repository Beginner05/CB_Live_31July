package Lec11;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,3};
boolean res=sol(arr);
	System.out.println(res);
	}
	

    public static boolean sol(int arr[])
    {
        int o=0;
        int e=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
e=Math.min(e,arr[i]);
            }
            else{
o=Math.min(o,arr[i]);
            }
        }
    if(o==0&&e>0)return true;
    if(e==0&&o>0)return true;
    boolean flag=true;
    // odd
    for(int i=0;i<arr.length;i++)
    {
if(arr[i]%2==0)
{
    if(arr[i]-o>=1&&((arr[i]-o)%2!=0))continue;
    else{
        flag=false; break;
    }
}
    }
    if(flag)return true;
    flag=true;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]%2!=0)
        {
            if(arr[i]-o>=1)
            {
                continue;
            }
            else{
                flag=false;
                break;
            }
        }
    }
    return flag;
    }
}
