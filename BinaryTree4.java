import java.util.Scanner;
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
class BinaryTree4
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		Node root=null;
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			Node node=new Node(k);
			root=insert(root,node);
		}
		System.out.println(height(root));
	}
	static Node insert(Node root,Node n)
	{
		if(root==null)
		{
            root=n;
            return root;
        }
        if(n.key<=root.key)
        {
            root.left=insert(root.left,n);
        }
        else
        {
            root.right=insert(root.right,n);
        }
        return root;
	}
	static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int le=1+height(root.left);
		int ri=1+height(root.right);
		if(le>ri)
		{
			return le;
		}
		else
		{
			return ri;
		}
	}
}