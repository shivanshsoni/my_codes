import java.util.Scanner;
class BinaryTree1
{
	class Node
	{
		int key;
		Node right,left;
		public Node(int item)
		{
			key=item;
			right=left=null;
		}
	}
	Node root;
	BinaryTree1()
	{
		root=null;
	}
	void insert(int key)
	{
		root=insertRec(root,key);
	}
	Node insertRec(Node root,int key)
	{
		if(root==null)
		{
			root=new Node(key);
		}
		if(key<root.key)
		{
			root.left=insertRec(root.left,key);
		}
		if(key>root.key)
		{
			root.right=insertRec(root.right,key);
		}
		return root;
	}

	int maxdepth(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			int ldepth=maxdepth(root.left);
			int rdepth=maxdepth(root.right);

			if(ldepth>rdepth)
			{
				return ldepth+1;
			}
			else
			{
				return rdepth+1;
			}
		}
	}
		
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		BinaryTree1 bst=new BinaryTree1();
		int t,i,j,k,l;
		t=scan.nextInt();
		Node fr;
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			if(i==0)
			{
				
			}
			else
			{
				bst.insert(k);
			}
		}
		System.out.println(bst.maxdepth(bst.root));
	}
}
