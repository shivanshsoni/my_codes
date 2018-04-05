import java.util.Scanner;
import java.util.Arrays;
public class tetris
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int n=scan.nextInt();
		int A[]=new int[t];
		Arrays.fill(A,0);
		int g=0;
		int m=0;
		for(i=0;i<n;i++)
		{
			k=scan.nextInt();
			A[k-1]++;
			for(l=0;l<t;l++)
			{
				if(A[l]!=0)
				{
					g=1;
				}
				else
				{
					g=0;
					break;
				}
			}
			if(g==1)
			{
				m++;
				for(j=0;j<t;j++)
				{
					A[j]--;
				}
			}
		}		
		System.out.println(m);
	}
}