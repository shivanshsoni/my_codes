import java.util.Scanner;
class chefapar1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l,o;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			o=0;
			l=-25;
			for(k=0;k<n;k++)
			{
				A[k]=scan.nextInt();
				if(A[k]==1)
				{
					l=k;
				}
				else
				{
					o++;
				}
			}
			int m=0;
			int y=0;
			for(j=0;j<=l;j++)
			{
				if(A[j]==1)
				{
					m++;
				}
			}	
				
				if(m==n)
				{
					System.out.println("0");
				}
				else
				{
					System.out.println((o+m)*100+o*1000);
				}
			}
		}
	}
