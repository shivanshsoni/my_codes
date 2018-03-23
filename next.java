import java.util.Scanner;
class next
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			int a=scan.nextInt();
			int b=scan.nextInt();
			char A[]=str.toCharArray();
			int c=0;
			int d=0;
			for(j=0;j<str.length();j++)
			{
				if(A[j]=='a')
				{
					c++;
				}
				else
				{
					d++;
				}
			}
			int min1=0;
			int min2=0;
			if(c%a==0)
			{
				if(a>c)
				{
					min1=c;
				}
				else
				{
					min1=c/a;
				}
			}
			else
			{
				if(a>c)
				{
					min1=c;
				}
				else
				{
					min1=(c/a)+1;
				}
			}
			if(d%b==0)
			{
				if(b>d)
				{
					min2=d;
				}
				else
				{
					min2=d/b;
				}
			}
			else
			{
				if(b>d)
				{
					min2=d;
				}
				else
				{
					min2=(d/b)+1;
				}
			}
			int s=0;
			for(k=min1;k<=c;k++)
			{
				for(l=min2;l<=d;l++)
				{
					if(k==l)
					{
						s=k;
						break;
					}
				}
				if(s>0)
				{
					break;
				}
			}
			if(s>0)
			{
				int start1=0;
				int end1=0;
				int start2=0;
				int end2=0;
				start1=c/s;
				end1=c%s;
				start2=d/s;
				end2=d%s;
				StringBuilder ptr=new StringBuilder("");
				for(int y=0;y<s;y++)
				{
					if(y<end1)
					{
						for(int u=0;u<start1+1;u++)
						{
							ptr.append("a");
						}
					}
					else
					{
						for(int u=0;u<start1;u++)
						{
							ptr.append("a");
						}	
					}
					if(y<end2)
					{
						for(int u=0;u<start2+1;u++)
						{
							ptr.append("b");
						}	
					}
					else
					{
						for(int u=0;u<start2;u++)
						{
							ptr.append("b");
						}
					}
				}
				System.out.println(ptr.toString());
			}
			else
			{
				if(min1>d)
				{
					StringBuilder ptr=new StringBuilder("");
					for(int y=0;y<d;y++)
					{
						for(int u=0;u<a;u++)
						{
							ptr.append("a");
						}
						ptr.append("b");
					}
					for(int g=d;g<min1;g++)
					{
						for(int u=0;u<a;u++)
						{
							ptr.append("a");
						}
						if(g!=min1-1)
						{
							ptr.append("*");
						}
					}
					System.out.println(ptr.toString());
				}
				else
				{
					StringBuilder ptr=new StringBuilder("");
					for(int y=0;y<c;y++)
					{
						for(int u=0;u<b;u++)
						{
							ptr.append("b");
						}
						ptr.append("a");
					}
					for(int g=d;g<min2;g++)
					{
						for(int u=0;u<b;u++)
						{
							ptr.append("b");
						}
						if(g!=min2-1)
						{
							ptr.append("*");
						}
					}
					System.out.println(ptr.toString());
				}
			}
		}	
	}
}