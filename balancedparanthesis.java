import java.util.Scanner;
import java.util.*;
class balancedparanthesis
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str=scan.next();
		char A[]=str.toCharArray();
		Stack<Character> s=new Stack<Character>();
		Boolean bool=true;
		int p=0;
		for(i=0;i<str.length();i++)
		{
			if(A[i]=='('||A[i]=='{'||A[i]=='[')
			{
				s.push(A[i]);
			}
			else if(A[i]==']')
			{
				if(s.isEmpty() || s.pop()!='[')
				{
					bool=false;
					p=i+1;
					break;
				}
			}
			else if(A[i]=='}')
			{
				if(s.isEmpty() || s.pop()!='{')
				{
					bool=false;
					p=i+1;
					break;
				}	
			}
			else if(A[i]==')')
			{
				if(s.isEmpty() || s.pop()!='(')
				{
					bool=false;
					p=i+1;
					break;
				}
			}
		}
		if(s.isEmpty())
		{
			bool=true;
		}
		else
		{
			bool=false;
		}
		if(bool==true&&p==0)
		{
			System.out.println("Success");
		}
		else
		{
			if(p==0)
			{
				char ch=s.peek();
				System.out.println(ch.position);
			}
			System.out.println(p);
		}
	}
}