import java.util.Scanner;
class prisonbreak
{
	static int count=0;
	static int h=0;
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		char A[][]=new char[1000][1000];
		count=0;
		h=0;
		int n=scan.nextInt();
		int m=scan.nextInt();
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		for(j=0;j<n;j++)
		{
			for(k=0;k<m;k++)
			{
				A[j][k]=scan.next().charAt(0);
				if(A[j][k]=='V')
				{
					a=j;
					b=k;
				}
				if(A[j][k]=='H')
				{
					c=j;
					d=k;
				}
			}
		}
		char v[][]=new char[n][n];
		if(A[0][0]=='*'&&A[n-1][n-1]=='*')
		{
			System.out.println("0");	
		}
		else	
		{	
			boob(a,b,v,A,c,d,-1,-1);
			System.out.println(count);
		}
	}
	

	static void boob(int i,int j,char v[][], char A[][], int n, int m, int prei, int prej)
	{
		System.out.println(count);
		if(i==n-1&&j==m-1)
		{
			if(h>count)
			{
				h=count;
			}
			return;
		}
		if(v[i][j]=='*')
		{
			return;
		}
		v[i][j]='*';
		if(i!=0&&A[i-1][j]!='*')
		{
			boob(i-1, j, v, A, n ,m, i , j);
		}
		if(j!=0&&A[i][j-1]!='*')
		{
			h++;
			boob(i, j-1, v, A, n ,m, i , j);
		}
		if(i!=n-1&&A[i+1][j]!='*')
		{
			boob(i+1, j, v, A, n ,m, i , j);
		}
		if(j!=n-1&&A[i][j+1]!='*')
		{
			h++;
			boob(i, j+1, v, A, n ,m, i , j);
		}
		v[i][j]='.';
	}
}