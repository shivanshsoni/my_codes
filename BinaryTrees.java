import java.util.Scanner;
import java.util.Arrays;

class Node<T>
{
	int value;
	Node right;
	Node left;

	Node(int value)
	{
		this.value=value;
	}
}

class BinarySearchTree
{
	Node root;

	BinarySearchTree insert(int value)
	{
		Node node = new Node<>(value);
		if(root==null)
		{
			root=node;
			return this;
		}
		insertRec(root,node);
		return this;
	}
	void insertRec(Node latestroot, Node node)
	{
		if(latestroot.value > node.value)
		{
			if(latestroot.left==null)
			{
				latestroot.left=node;
			}
			else
			{
				insertRec(latestroot.left, node);
			}
		}
		else
		{
			if(latestroot.right==null)
			{
				latestroot.right=node;
			}
			else
			{
				insertRec(latestroot.right, node);
			}
		}
	}

	void printInorder()
	{
		printInorderRec(root);
		System.out.println("");
	}

	void printInorderRec(Node currRoot)
	{
		if(currRoot==null)
		{
			return;
		}
		printInorderRec(currRoot.left);
		System.out.print(currRoot.value + ", ");
		printInorderRec(currRoot.right);
	}

	void printPreorder()
	{
		printPreorderRec(root);
		System.out.println("");
	}

	void printPreorderRec(Node currRoot)
	{
		if(currRoot==null)
		{
			return;
		}
		System.out.print(currRoot.value + ", ");
		printPreorderRec(currRoot.left);
		printPreorderRec(currRoot.right);
	}

	void printPostorder()
	{
		printPostorderRec(root);
		System.out.println("");
	}

	void printPostorderRec(Node currRoot)
	{
		if(currRoot==null)
		{
			return;
		}
		printPostorderRec(currRoot.left);
		printPostorderRec(currRoot.right);
		System.out.print(currRoot.value + ", ");
	}
}

class BinaryTrees
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		BinarySearchTree bst=new BinarySearchTree();
		int t=scan.nextInt();
		int A[]=new int[t];
		for(int i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
			bst.insert(A[i]);
		}
		bst.printInorder();

		bst.printPreorder();

		bst.printPostorder();
	}
}