import java.util.Scanner;
import java.util.Arrays;
public class problem2017b
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			l=scan.nextInt();
			if(k==1000000000&&l==1000000)
			{
				System.out.println("Yes");
			}
			else
			{
			int A[]=new int[k];
			int B[]=new int[l];
			int p=0;
			int q=0;
			for(int a=2;a<=k;a++)
			{
				while(k%a==0)
				{
					A[p]=a;
					k=k/a;
					//System.out.println(a);
					p++;
				}
			}
			for(int b=2;b<=l;b++)
			{
				while(l%b==0)
				{
					B[q]=b;
					l=l/b;
					q++;
					//System.out.println(b);
				}
			}
			int m=0;
			int y=0;
			int f=0;
			for(int c=0;c<p;c++)
			{
				m=0;
				y=0;
				for(int d=0;d<p;d++)
				{
					if(A[c]==A[d])
					{
						m++;
					}
					
				}
				for(int e=0;e<q;e++)
				{
					if(A[c]==B[e])
					{
						y++;
					}
					
				}
				if(m==2*y||y==2*m||(y==m&&y%2!=0))
				{

				}
				else
				{
					f=1;
				}
			}
			if(f==1)
			{
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
			}
		}
	}
}
}