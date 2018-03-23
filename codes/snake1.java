import java.util.Scanner;
class snake1
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
			j=str.length();
			if(j==1)
			{
				if(A[0]=='s')
				{
					System.out.println("snakes");
				}
				else
				{
					System.out.println("mongooses");
				}
			}
			if(j==2)
			{
				if(str.equals("sm"))
				{
					System.out.println("mongooses");
				}
				if(str.equals("ms"))
				{
					System.out.println("mongooses");
				}
				if(str.equals("ss"))
				{
					System.out.println("snakes");
				}
				if(str.equals("mm"))
				{
					System.out.println("mongooses");
				}
			}
			if(j>2)
			{
			for(k=1;k<j-1;k++)
			{
				int p=0;
				if(A[k]=='s'&&A[k-1]=='m')
				{
					A[k]='a';
					A[k-1]='M';
					p=1;
				}
				if(A[k]=='m'&&A[k-1]=='s'&&p==0)
				{
					A[k]='M';
					A[k-1]='a';
					p=1;
				}
				if(A[k]=='s'&&A[k+1]=='m'&&p==0)
				{
					A[k]='a';
					A[k+1]='M';
					p=1;
				}
				if(A[k]=='m'&&A[k+1]=='s'&&p==0)
				{
					A[k]='M';
					A[k+1]='a';
					p=1;
				}
			}
			int c=0;
			int b=0;
			for(l=0;l<j;l++)
			{
				System.out.println(A[l]);
				if(A[l]=='s')
				{
					c++;
				}
				if(A[l]=='m'||A[l]=='M')
				{
					b++;
				}
			}
			if(c>b)
			{
				System.out.println("snakes");
			}
			if(b>c)
			{
				System.out.println("mongooses");
			}
			if(b==c)
			{
				System.out.println("tie");
			}
		}
		}
	}
}