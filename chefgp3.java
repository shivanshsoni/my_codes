import java.util.Scanner;
class chefgp3
{
	public static void main(String[]args)
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
			int x=0;
			int y=0;
			for(j=0;j<str.length();j++)
			{
				if(A[j]=='a')
				{
					x++;
				}
				else
				{
					y++;
				}
			}
			if(y==0)
			{
				StringBuilder ptr=new StringBuilder("");
				if(x%a==0)
				{
					for(k=0;k<x/a;k++)
					{
						for(l=0;l<a;l++)
						{
							ptr.append("a");
						}
						if(k<(x/a)-1)
						{
							ptr.append("*");
						}
					}
					System.out.println(ptr.toString());
				}
				else
				{
					for(k=0;k<x/a;k++)
					{
						for(l=0;l<a;l++)
						{
							ptr.append("a");
						}
						if(k<(x/a))
						{
							ptr.append("*");
						}
					}
					int p=x%a;
					for(l=0;l<p;l++)
					{
						ptr.append("a");
					}
					System.out.println(ptr.toString());
				}
				
			}
			else if(x==0)
			{
				StringBuilder ptr=new StringBuilder("");
				if(y%b==0)
				{
					for(k=0;k<y/b;k++)
					{
						for(l=0;l<b;l++)
						{
							ptr.append("b");
						}
						if(k<(y/b)-1)
						{
							ptr.append("*");
						}
					}
					System.out.println(ptr.toString());
				}
				else
				{
					for(k=0;k<y/b;k++)
					{
						for(l=0;l<b;l++)
						{
							ptr.append("b");
						}
						if(k<(y/b))
						{
							ptr.append("*");
						}
					}
					int p=y%b;
					for(l=0;l<p;l++)
					{
						ptr.append("b");
					}
					System.out.println(ptr.toString());
				}
				
			}
			else
			{
				if(x>y)
				{
					if((x/y)<=a&&x%y==0)
					{
						StringBuilder ptr=new StringBuilder("");
						for(k=0;k<y;k++)
						{
							for(l=0;l<x/y;l++)
							{
								ptr.append("a");
							}
							ptr.append("b");
						}
						System.out.println(ptr.toString());
					}
					else if((x/y)+1<=a&&x%y!=0)
					{
						int p=x%y;
						StringBuilder ptr=new StringBuilder("");
						for(k=0;k<p;k++)
						{
							for(l=0;l<(x/y)+1;l++)
							{
								ptr.append("a");
							}
							ptr.append("b");
						}
						for(int f=p;f<y;f++)
						{
							for(l=0;l<(x/y);l++)
							{
								ptr.append("a");
							}
							ptr.append("b");
						}
						System.out.println(ptr.toString());	
					}
					else
					{
						StringBuilder ptr=new StringBuilder("");
						int value1=x;
						for(k=0;k<y;k++)
						{
							for(l=0;l<a;l++)
							{
								ptr.append("a");
								value1--;
							}
							ptr.append("b");
						}
						int val2=value1/a;
						int val1=value1%a;
						int s=0;
						for(int f=0;f<val2;f++)
						{
							for(l=0;l<a;l++)
							{
								ptr.append("a");
								value1--;
							}
							if(f<val2-1)
							{
								ptr.append("*");
							}
							s=1;
						}
						if(s==0)
						{
							for(l=0;l<val1;l++)
							{
								ptr.append("a");
							}
						}
						if(s==1&&val1>0)
						{
							ptr.append("*");
							for(l=0;l<val1;l++)
							{
								ptr.append("a");
							}
						}
						System.out.println(ptr.toString());
					}
				}
				if(y>x)
				{
					if((y/x)<=b&&y%x==0)
					{
						StringBuilder ptr=new StringBuilder("");
						for(k=0;k<x;k++)
						{
							for(l=0;l<y/x;l++)
							{
								ptr.append("b");
							}
							ptr.append("a");
						}
						System.out.println(ptr.toString());
					}
					else if((y/x)+1<=b&&y%x!=0)
					{
						int p=y%x;
						StringBuilder ptr=new StringBuilder("");
						for(k=0;k<p;k++)
						{
							for(l=0;l<(y/x)+1;l++)
							{
								ptr.append("b");
							}
							ptr.append("a");
						}
						for(int f=p;f<x;f++)
						{
							for(l=0;l<(y/x);l++)
							{
								ptr.append("b");
							}
							ptr.append("a");
						}
						System.out.println(ptr.toString());	
					}
					else
					{
						StringBuilder ptr=new StringBuilder("");
						int value1=y;
						for(k=0;k<x;k++)
						{
							for(l=0;l<b;l++)
							{
								ptr.append("b");
								value1--;
							}
							ptr.append("a");
						}
						int val2=value1/b;
						int val1=value1%b;
						int s=0;
						for(int f=0;f<val2;f++)
						{
							for(l=0;l<b;l++)
							{
								ptr.append("b");
								value1--;
							}
							if(f<val2-1)
							{
								ptr.append("*");
							}
							s=1;
						}
						if(s==0)
						{
							for(l=0;l<val1;l++)
							{
								ptr.append("b");
							}
						}
						if(s==1&&val1>0)
						{
							ptr.append("*");
							for(l=0;l<val1;l++)
							{
								ptr.append("b");
							}
						}
						System.out.println(ptr.toString());
					}
				}
				if(y==x)
				{
					if((y/x)<=b&&y%x==0)
					{
						StringBuilder ptr=new StringBuilder("");
						for(k=0;k<x;k++)
						{
							for(l=0;l<y/x;l++)
							{
								ptr.append("b");
							}
								ptr.append("a");
						}
						System.out.println(ptr.toString());
					}
					else
					{
						StringBuilder ptr=new StringBuilder("");
						for(k=0;k<x;k++)
						{
							for(l=0;l<b;l++)
							{
								ptr.append("b");
							}
							ptr.append("a");
						}
						for(int f=0;f<y-(x*b);f++)
						{
							for(l=0;l<b;l++)
							{
								ptr.append("b");
							}
							if(f<(y-(x*b))-1)
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
}