import java.util.Scanner;
public class problem2017a
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str=scan.next();
		String ptr=scan.next();
		int n=scan.nextInt();
		n=n%4;
		if(n==0&&str.equals(ptr))
		{
			System.out.println("cw");
		}	
		else if(n==1&&str.equals("v")&&ptr.equals("<")||n==1&&str.equals("<")&&ptr.equals("^")||n==1&&str.equals("^")&&ptr.equals(">")||n==1&&str.equals(">")&&ptr.equals("v"))
		{
			System.out.println("cw");
		}
	    else if(n==1&&str.equals("v")&&ptr.equals(">")||n==1&&str.equals("<")&&ptr.equals("v")||n==1&&str.equals("^")&&ptr.equals("<")||n==1&&str.equals(">")&&ptr.equals("^"))
		{
			System.out.println("ccw");
		}
		else if(n==3&&str.equals("v")&&ptr.equals(">")||n==3&&str.equals("<")&&ptr.equals("v")||n==3&&str.equals("^")&&ptr.equals("<")||n==3&&str.equals(">")&&ptr.equals("^"))
		{
			System.out.println("cw");
		}
		else if(n==3&&str.equals("v")&&ptr.equals("<")||n==3&&str.equals("<")&&ptr.equals("^")||n==3&&str.equals("^")&&ptr.equals(">")||n==3&&str.equals(">")&&ptr.equals("v"))
		{
			System.out.println("ccw");
		}
		else
		{
			System.out.println("undefined");
		}
	}
}