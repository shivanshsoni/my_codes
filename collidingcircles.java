import java.util.Scanner;
class collidingcircles
{
	public static void main(String[]atgs)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		k=scan.nextInt();
		int A[]=new int[n];
		for(j=0;j<n;j++)
		{
			A[j]=scan.nextInt();
		}
		int sum=0;
		int p=0;
		int hg=0;
		for(l=k;l<n;l++)
		{
			for(int y=0;y<n;y++)
			{
				sum=0;
				for(int g=l;g>=0+p;g--)
				{
					sum=sum+A[g];
				}
				p++;
				hg=hg+22/7*(sum)*(sum)+22/7*(A[y])*(A[y]);
				System.out.println(sum);
			}
		}
		System.out.printf("%d",hg/p);
	}
}