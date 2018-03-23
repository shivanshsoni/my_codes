import java.util.Scanner;
import java.*;
import java.util.*;
class substrings
{
	public static void main(String[]srgs)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l,a,b;
		t=scan.nextInt();
		n=scan.nextInt();
		int A[]=new int[t];
		String str[]=new String[n];
		String ptr="";
		l=0;
		int y=0;
		for(y=0;y<t;y++)
		{
			ptr=ptr.concat(A[y]);
		}
		for(i=0;i<n;i++)
		{
			a=scan.nextInt();
			b=scan.nextInt();
			for(j=a-1;j<=b-1;j++)
			{
				if(A[j]==0)
				{
					A[j]=1;
				}
				else
				{
					A[j]=0;
				}
			}
			str="";
			for(y=0;y<t;y++)
			{
				str=str.concat(A[y]);
			}
		}
		l=0;
		for(k=0;k<t-1;k++)
		{
			l=str[k].compareTo(str[k+1]);
			if(l>0)
			{
				ptr=str[k+1];
			}
			else
			{
				ptr=str[k];
			}
		}
		System.out.println(ptr);
	}
}