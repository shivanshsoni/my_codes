import java.util.Scanner;
class sncoup
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			String str=scan.next();
			String ptr=scan.next();
			char A[]=str.toCharArray();
			char B[]=ptr.toCharArray();
			int p=0;
			int a=0;
			int b=0;
			for(k=0;k<n;k++)
			{

				if(A[k]=='*')
				{
					a++;
				}
				if(B[k]=='*')
				{
					b++;
				}
				if(A[k]=='*'&&B[k]=='*')
				{
					p++;
				}
			}
			int c=0;
			int s=0;
			for(int q=0;q<n;q++)
			{
				for(int w=q+1;w<n;w++)
				{
					if(A[q]=='*'&&A[w]=='*')
					{
						for(int r=q;r<=w;r++)
						{
							if(B[r]=='*')
							{
								c++;
							}
						}
						if(c>2)
						{
							s=s+c-2;
						}
						break;
					}
				}
			}
			l=0;
			if(p>0)
			{
				l++;
			}
			for(int y=0;y<n;y++)
			{
				if(A[y]=='*'||B[y]=='*')
				{
					l++;
				}
			}
			if(a>=b)
			{
				s=s+a-1;
			}
			if(a<=b)
			{
				s=s+b-1;
			}
			System.out.println(s);
			if(l<=s)
			{
				if(l==0)
				{
					System.out.println(l);
				}
				if(l>0)
				{
					System.out.println(l-1);
				}
			}
			if(s<l)
			{
				if(s==0)
				{
					System.out.println(0);
				}
				if(s>0)
				{
					System.out.println(s);
				}
			}
		}
	}
}