import java.util.Scanner;
class arith2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		Long res,x;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			x=0L;
			res=0L;
			String str="";
			while(str!="=")
			{
				if(i==0)
				{
					str=scan.nextInt()
				}
				else
				{
					x=res;
				}
				int a=0;
				int b=0;
				int c=0;
				int d=0;
				str=scan.next();
				if(str=="*")
				{
					a=1;
				}
				if(str=="/")
				{
					b=1;
				}
				if(str=="+")
				{
					c=1;
				}
				if(str=="-")
				{
					d=1;
				}
				Long y=scan.nextLong();
				if(a==1)
				{
					res=x*y;
				}
				if(b==1)
				{
					res=x/y;
				}
				if(c==1)
				{
					res=x+y;
				}
				if(d==1)
				{
					res=x-y;
				}
			}
			System.out.println(res);
		}
	}
}