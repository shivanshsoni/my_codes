import java.util.Scanner;
class codess
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int m=scan.nextInt();
			int n=scan.nextInt();
			int A[][]=new int[m][n];
			for(j=0;j<m;j++)
			{
				for(k=0;k<n;k++)
				{
					A[j][k]=scan.nextInt();
				}
			}
			int B[]=new int[n*m];
			int y=0;
			int a=0,b=0,c=m-1,d=n-1,dir=0;
			while(true)
			{
				if(dir==0&&y<n*m)
				{
					for(l=b;l<d;l++)
					{
						B[y]=A[b][l];
						y++;
						dir=1;
						System.out.println("1");
					}
					a++;
				}	
			else if(dir==1&&y<n*m)
			{
				for(l=a;l<c;l++)
				{
					B[y]=A[l][d];
					y++;
					dir=2;
					System.out.println("2");
				}
				d--;
			}
			else if(dir==2&&y<n*m)
			{
				for(l=d;l>=b;l--)
				{
					B[y]=A[c][l];
					y++;
					dir=3;
					
					System.out.println("3");
				}
				c--;
			}
			else if(dir==3&&y<n*m)
			{
				for(l=c;l>=a;l--)
				{
					B[y]=A[l][a];
					y++;
					dir=0;
					System.out.println("4");
				}
				b++;
			}
			else
			{
				break;
			}
			}

			for(int g=0;g<n*m;g++)
			{
				System.out.print(B[g]+" ");
			}
		}
	}
}