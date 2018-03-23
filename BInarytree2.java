import java.util.Scanner;
class Node
{
	int key;
	Node right,left;
	Node(int item)
	{
		key=item;
		right=left=null;
	}
}

class Binarytree2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		Node root=null;
		for(int i=0;i<t;i++)
		{
			int k=scan.nextInt();
			Node node=new Node(k);
			root=insert(root,node);
		}
		System.out.println(height(root));
	}

	Node insert(Node root,Node n);
	{
		if(root==null)
		{
			root=n;
			return root;
		}
		if(n.root<root.data)
		{
			root.left=insert(root.left,n);
		}
		else
		{
			root.right=insert(root.right,n);
		}
		return root;
	}
	int height(Node root);
	{
		if(root=null)
		{
			return 0;
		}
		int l=l+height(root.left);
		int r=l+height(root.right);
		if(l>r)
		{
			return l+1;
		}
		else
		{
			return r+1;
		}
	}
}