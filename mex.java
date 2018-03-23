import java.util.Scanner;
import java.util.Arrays;
class mex
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
			int B[]=new int[200001];
			Arrays.fill(B,0);
			for(j=0;j<a;j++)
			{
				k=scan.nextInt();
				B[k]=1;
			}
			int u=0;
			for(l=0;;l++)
			{
				if(B[l]==0)
				{
					u++;
				}
				if(u==b+1)
				{
					System.out.println(l);
					break;
				}
			}
		}
	}
}