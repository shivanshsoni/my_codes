import java.util.Scanner;
import java.util.Arrays;
class spojapples
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,k,i,j,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			k=scan.nextInt();
			int A[]=new int[n];
			//int B[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			int m=0;
			for(l=0;l<n;l++)
			{
				if(n%(l+1)==0&&A[l]!=-1)
				{
					m=(A[l]*n)/(l+1);
					if(l>0)
					{
						if(m>)
					}
				}
			}
			Arrays.sort(B);
			for(int y=0;y<m;y++)
			{
				System.out.println(B[y]);
			}
			if(B[0]<=0)
			{
					System.out.println("-1");
			}
			else
			{
				//Arrays.sort(B);
				System.out.println(B[0]);
			}
		}
	}
}