import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int x){
        data=x;
        left=null;
        right=null;
    }
}
class Binarytree2 {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        Node root=null;
        for(int i=0;i<n;i++){
            Node node=new Node(a[i]);
            root=insert(root,node);
        }
        System.out.println(height(root));
    }
    static Node insert(Node root, Node n){
        if(root==null){
            root=n;
            return root;
        }
        if(n.data<=root.data)
            root.left=insert(root.left,n);
        else
            root.right=insert(root.right,n);
        return root;
    }
    static int height(Node root){
        if(root==null)
            return 0;
        int l=1+height(root.left);
        int r=1+height(root.right);
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