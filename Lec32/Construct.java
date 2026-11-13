package Lec32;

import java.util.Scanner;

public class Construct {

	class Node {
		int val;
		Node left = null;
		Node right;
	}

	Scanner scn = new Scanner(System.in);
	Node root = null;
public Construct()
{
	root=construct(null,true);
}
	
	public   Node construct(Node root,boolean lc)
	{
		if(root==null)
		{
			System.out.println("enter the value for root node");
			}
		else {
			if(lc==true)
			{
				System.out.println("enter the value for left child of "+ root.val);
			}
			else {
				System.out.println("enter the value for right child of "+ root.val);
			}
		}
		Node nn=new Node();
		int val=scn.nextInt();
		nn.val=val;
		System.out.println(nn.val+" has left child?");
		boolean hlc=scn.nextBoolean();
		if(hlc==true)
		{
			nn.left=construct(nn,true);
		}
		System.out.println(nn.val+" has right child?");
		boolean hrc=scn.nextBoolean();
		if(hrc==true)
		{
			nn.right=construct(nn,false);
		}
		return nn;
	}
}
