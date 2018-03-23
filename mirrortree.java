import java.util.Scanner;
import java.util.*;
class mirrortree
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,k,l;
		Long j;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			Long n=scan.nextLong();
			int A[]=new int[100000];
			int B[]=new int[100000];
			int a=0;
			int b=0;
			int y=0;
			Long h=0L;
			int p=1;
			int s=0;
			for(j=0L;j<n;j++)
			{
				k=scan.nextInt();
				if(j==h+1L)
				{
					B[b]=k;
					b++;
				}
				if(j>h)
				{
					h=h+p*2;
					p=p*2;
				}
				if(j==h||j==0)
				{
					A[a]=k;
					a++;
				}
				if(k!=0)
				{
					s=k;
				}
			}
			//System.out.println(a+" "+b);
			int m=0;
			int aa=0;
			for(int x=0;x<a;x++)
			{
				if(A[x]!=0)
				{
					System.out.println(A[x]);
					m=A[x];
					aa=x;
				}
			}
			int mm=0;
			for(int z=0;z<b;z++)
			{
				if(B[z]!=0)
				{
					mm=z;
				}
			}
			//System.out.println(m+" "+s);
			if(m!=s&&aa>mm)
			{
				System.out.println(s);
			}
			for(int z=0;z<b;z++)
			{
				if(B[z]!=0)
				System.out.println(B[z]);
			}
			System.out.println("");
		}
	}
}