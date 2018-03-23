import java.util.Scanner;

import java.util.*;
class code
{
	public static int getHeight(Node root)
{
	if(root==null)
	{
		return -1;
	}
	else
	{
		return 1+Math.max(getHeight(root.left),getHeight(root.right));
	}
}
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		Node root=new Node("root");
		for(i=0;i<t;i++)
		{
			Node k=scan.nextNode();
			root.addChild(new Node(k));
		}
		System.out.println(getHeight(root));
	}
}
