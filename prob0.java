import java.util.Scanner;
import java.util.Arrays;
public class prob0
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int n=scan.nextInt();
		int A[]=new int[t];
		int B[]=new int[n];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		for(j=0;j<n;j++)
		{
			B[j]=scan.nextInt();
		}
		Arrays.sort(B);
		int D[]=new int[n];
		int h=n-1;
		for(int y=0;y<n;y++)
		{
			D[y]=B[h];
			h--;
		}
		int a=0;
		int C[]=new int[t];
		for(k=0;k<t;k++)
		{
			if(A[k]==0)
			{
				A[k]=D[a];
				a++;
			}
			C[k]=A[k];
		}
		Arrays.sort(A);
		int m=0;
		for(l=0;l<t;l++)
		{
			if(A[l]==C[l])
			{
				m++;
			}
		}
		if(m==t)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
	}
}