import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class StringMatching
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		String str=scan.next();
		t=scan.nextInt();
		char A[]=new char[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.next().charAt(0);
		}
		l=str.length();
		String ptr[]=new String[l*(l+1)/2];
		int p=0;
		int a,b,c,d;
		int m=0;
		for(j=0;j<str.length();j++)
		{
			for(k=1;k<=str.length()-j;k++)
			{	
				ptr[p]=str.substring(j,k+j);
				char B[]=ptr[p].toCharArray();
				d=0;
				TreeSet tree=new TreeSet();
				for(b=0;b<ptr[p].length();b++)
				{
					tree.add(B[p]);
				}
				for(a=0;a<t;a++)
				{
					Boolean res=tree.add(A[a]);
					if(res)
					{
						break;
					}
					else
					{
						d++;
					}
				}
				if(d==t)
				{
					m++;
				}
				p++;
			}
		}
		System.out.println(m);
	}
}