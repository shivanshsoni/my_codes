import java.util.Scanner;
class snaketemple
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,n;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			if(n%2==0)
			{
				System.out.println("no");
			}
			else
			{
				int p=0;
				if(A[0]!=1)
				{
					System.out.println("no");
					p=1;
				}	
				else
				{
					for(k=1;k<=n/2;k++)
					{
						if(A[k]-A[k-1]!=1)
						{
							System.out.println("no");
							p=1;
							break;
						}
					}	
					for(k=(n/2)+1;k<n;k++)
					{
						if(A[k]-A[k-1]!=-1)
						{
							if(p==0)
							{
								System.out.println("no");
							}
							p=1;
							break;
						}
					}
					if(p==0)
					{
						System.out.println("yes");
					}
				}
			}
		}
	}
}