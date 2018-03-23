import java.util.Scanner;
import java.util.*;
class paranthesis
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			int n=str.length();
			Stack<Integer> stack=new Stack<>();
			int res=0;
			for(j=0;j<n;j++)
			{
				if(str.charAt(j)=='(')
				{
					stack.push(j);
				}
				else
				{
					stack.pop();
					if(!stack.empty())
					{
						res=Math.max(res,j-stack.peek());
					}
					else
					{
						stack.push(j);
					}
				}
			}
			System.out.println(res);
		}
	}
}