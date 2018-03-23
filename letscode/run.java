import java.util.Scanner;
import java.util.Arrays;
class anurag
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
	 	t=scan.nextInt();
	 	for(i=0;i<t;i++)
	 	{
	 		Long ans=1L:
	 		int n=scan.nextInt();
	 		int A[]=new int[10];
	 		Arrays.fill(A,0);
	 		for(j=0;j<n;j++)
	 		{
	 			l=scan.nextInt();
	 			A[l]=1;
	 		}
	 		k=scan.nextInt();
	 		int p=0;
	 		Long d=0;
	 		for(Long f=1L;f<100000000000;f++)
	 		{
	 			ans=k*f;
	 			int C[]=new int[10];
	 			Arrays.fill(C,0);
	 			for(int g=0;g<15;g++)
	 			{
	 				int y=ans%10;
	 				ans=ans/10L;
	 				C[y]=1;
	 			}
	 			for(int s=0;s<10;s++)
	 			{
	 				if(B[s]!=C[s])
	 				{
	 					p=1;
	 				}
	 			}
	 			if(p==0)
	 			{
	 				d=f;
	 				break;
	 			}
	 		}
	 		System.out.println(d);
	 	}
	}
}