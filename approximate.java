import java.util.Scanner;
import java.util.Arrays;
class approximate
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		k=scan.nextInt();
		l=scan.nextInt();
		int A[][]=new int[t][l+1];
		int B[]=new int[t];
		int C[]=new int[t];
		for(i=0;i<t;i++)
		{
			for(j=0;j<l+1;j++)
			{
				A[i][j]=scan.nextInt();
			}
		}
		int p=0;
		for(i=0;i<t;i++)
		{
			for(j=0;j<l;j++)
			{
				B[i]=B[i]+A[i][j];
			}
			C[i]=B[i];
		}
		Arrays.sort(B);
		for(int g=0;g<k;g++)
		{
			for(int h=0;h<t;h++)
			{
				if(B[g]==C[h])
				{
					System.out.println(h+1);
					C[h]=-1;
					break;
				}
			}
		}
	}
}