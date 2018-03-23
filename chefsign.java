import java.util.Scanner;
class chefsign
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			char A[]=str.toCharArray();
			int a=0;
			int b=0;
			int p=0;
			for(j=0;j<str.length();j++)
			{
				if(A[j]=='<')
				{
					a++;
				}
				if(A[j]=='>')
				{
					b++;
				}
				if(b>a)
				{
					p=1;
				}
			}
			if(a==0||b==0)
			{
				if(a==0)
				{
					System.out.println(b+1);
				}
				if(b==0)
				{
					System.out.println(a+1);
				}
			}
			else if(p==0)
			{
				int c=0;
				int sum=1;
				for(k=0;k<str.length();k++)
				{
					if(A[k]=='<')
					{
						sum++;
					}
					if(A[k]=='>')
					{
						sum--;
					}
					if(c<sum)
					{
						c=sum;
					}
				}
				System.out.println(c);
			}
			else if(p==1)
			{
				int y=0;
				for(k=0;k<str.length();k++)
				{
					int m=0;
					if(A[k]=='>')
					{
						for(l=k;l<str.length();l++)
						{
							if(A[l]=='>')
							{
								m++;
							}
							else
							{
								break;
							}
						}
					}
					if(y<m)
					{
						y=m;
					}
				}
				System.out.println(y+1);
			}
			else
			{
				System.out.println("1");
			}
		}
	}
}