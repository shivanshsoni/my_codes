import java.util.Scanner;
import java.util.Arrays;
class voting_list
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int a,b,c,i,j,k,l;
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		int A[]=new int[a];
		int B[]=new int[b];
		int C[]=new int[c];
		for(i=0;i<a;i++)
		{
			A[i]=scan.nextInt();
		}
		for(j=0;j<b;j++)
		{
			B[j]=scan.nextInt();
		}
		for(k=0;k<c;k++)
		{
			C[k]=scan.nextInt();
		}
		int D[]=new int[a+b];
		int m=0;
		for(l=0;l<a;l++)
		{
			for(int y=0;y<b;y++)
			{
				if(A[l]==B[y])
				{
					D[m]=A[l];
					m++;
				}
			}
			for(int t=0;t<c;t++)
			{
				if(A[l]==C[t])
				{
					D[m]=A[l];
					m++;
				}
			}
		}
		for(int d=0;d<b;d++)
		{
			for(int e=0;e<c;e++)
			{
				if(B[d]==C[e])
				{
					D[m]=B[d];
					m++;
				}
			}
		}
		int E[]=new int[a+b+c];
		//Arrays.sort(D);
		
	}
}