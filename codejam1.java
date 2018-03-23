import java.util.Scanner;
class codejam1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,n;
		int A[]=new int[10];
		t=scan.nextInt();
		j=0;
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			l=n;
			if(n==0)
			{
				System.out.printf("Case #%d: INSOMNIA\n",i+1);
			}
			else
			{
				while(j!=10)
				{
					while(n!=0)
					{int u=0;
					int y=n%10;
					for(k=0;k<j;k++)
					{
						if(A[k]==y)
						{
							u=1;
							break;
						}
					}
					if(u==0)
					{
						A[j]=y;
						j++;
						if(j==10)
						{
							System.out.printf("Case #%d: %d\n",i+1,l);
						}
					}
					n=n/10;
				}
				if(j!=10)
				{
					l=2*n;
				}
				}
			}
		}
	}
}