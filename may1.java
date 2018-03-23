import java.util.Scanner;
class chefanddailyroutine
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			k=str.length();
			char A[]=str.toCharArray();
			int u=0;
			int a=0;
			int b=0;
			for(j=1;j<k;j++)
			{
				if(A[j-1]=='S'&&A[j]=='C'||A[j-1]=='E'&&A[j]=='C'||A[j-1]=='S'&&A[j]=='E')
				{
					//System.out.println("no");
					u=1;
				}
				if(A[j]=='E')
				{
					a++;
				}
				if(A[j]=='S')
				{
					b++;
				}
			}
			if(a+b==j||a==j||b==j||u==1)
			{
				System.out.println("no");
			}
			else
			{
				System.out.println("yes");
			}
		}
	}
}