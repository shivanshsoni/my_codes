import java.util.Scanner;
import java.util.Arrays;
class johny
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			k=scan.nextInt();
			l=A[k-1];
			Arrays.sort(A);
			for(int a=0;a<n;a++)
			{
				if(A[a]==l)
				{
					System.out.println(a+1);
					break;
				}
			}
		}
	}
}