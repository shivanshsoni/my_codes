import java.util.Scanner;
import java.util.Arrays;
class spaceship
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		int w=scan.nextInt();
		int m=scan.nextInt();
		int q=scan.nextInt();
		int A[][]=new int[w+1][w+1];
		for(int d=0;d<w+1;d++)
		{
			for(int e=0;e<w+1;e++)
			{
				A[d][e]=0;
			}
		}
		String str[]=new String[w];
		for(i=0;i<w;i++)
		{	
			str[i]=scan.next();
		}
		for(j=0;j<m;j++)
		{
			int a=scan.nextInt();
			String ptr=scan.next();
			String mtr=scan.next();
			int x=0;
			int y=0;
			for(k=0;k<w;k++)
			{
				if(str[k].equals(ptr))
				{
					x=k+1;
				}
				if(str[k].equals(mtr))
				{
					y=k+1;
				}
				if(x>0&&y>0)
				{
					break;
				}
			}
			if(A[x][y]==0)
			{
				A[x][y]=a;
				A[y][x]=a;
				System.out.println("YES");
			}
			else
			{
				if(A[x][y]==a||A[y][x]==a)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
		}

		for(l=0;l<q;l++)
		{
			String ptr=scan.next();
			String mtr=scan.next();
			int x=0;
			int y=0;
			for(k=0;k<w;k++)
			{
				if(str[k].equals(ptr))
				{
					x=k+1;
				}
				if(str[k].equals(mtr))
				{
					y=k+1;
				}
				if(x>0&&y>0)
				{
					break;
				}
			}
			if(A[x][y]==1||A[x][y]==2)
			{
				System.out.println(A[x][y]);
			}
			else
			{
				System.out.println("3");
			}
		}
	}
}