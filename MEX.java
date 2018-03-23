import java.util.Scanner;
import java.util.Arrays;
class MEX
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int A[]=new int[a];
			int B[]=new int[100001];
			Arrays.fill(B,0);
			for(j=0;j<a;j++)
			{
				k=scan.nextInt();
				B[k+1]=1;
			}
			int u=0;
			for(l=0;;l++)
			{
				if(B[l+1]==1)
				{

				}
				if(B[l+1]==0)
				{
					u++;
				}
				if(u==b+1)
				{
					System.out.println(l);
				}
			}
		}
	}
}