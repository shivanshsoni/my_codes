import java.util.Scanner;
class icpc2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		int p=0;
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int A[]=new int[a];
		for(i=0;i<a;i++)
		{
			A[i]=scan.nextInt();
		}
		for(j=0;j<b;j++)
		{
			int d=scan.nextInt();
			int e=scan.nextInt();
			if(A[d-1]<=A[e-1]&&A[d-1]>0&&A[e-1]>0)
			{
				p=1;
				break;
			}
			if(A[d-1]==0)
			{
				if(A[e-1]>0)
				{
					A[d-1]=A[d-1]+A[e-1]-1;
				}
				else
				{
					A[e-1]--;
					A[d-1]++;
				}
			}
			else if(A[e-1]==0)
			{
				if(A[d-1]>0)
				{
					A[e-1]=A[d+1]+A[e-1]-1;
				}
				else
				{
					A[e-1]--;
					A[d-1]++;
				}
			}
		}
		if(p==1)
		{
			for(k=0;k<a;k++)
			{
				System.out.print(A[k]+" ");
			}
		}
		else
		{
			System.out.println("-1");
		}
	}
}