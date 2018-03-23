import java.util.Scanner;
class apgps
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
			int c=scan.nextInt();
			int A[]=new int[c];
			A[0]=1;
			int p=0;
			int sum=0;
			for(j=1;j<c;j++)
			{
				sum=0;
				A[j]=((A[j-1])%c*(a%c))%c;
				for(k=0;k<=j;k++)
				{
					sum=(sum+A[k])%c;
				}
				if(sum==b)
				{
					p=1;
					break;
				}
			}
			if(p==1)
			{
			System.out.println(j+1);
			}
			else
			{
			System.out.println("-1");
			}
		}
	}
}