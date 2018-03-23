import java.util.Scanner;
import java.util.Arrays;
class zeroandone
{
	public static void main(String[]rgs)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,n;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			int p=0;
			l=0;
			int m;
			while(p!=1)
			{
				m=0;
				for(k=0;k<n-2;k++)
				{
					if(A[k]==0&&A[k+2]==0)
					{
						l++;
						m=1;
						break;
					}
				}	
				if(m==0)
					{
						p=1;
					}
				for(int y=k+2;y<n;y++)
				{
					A[y-1]=A[y];
				}
				n=n-1;
			}
			System.out.println(l);
			if(l%2!=0)
			{
				System.out.println("Alice");
			}
			else
			{
				System.out.println("Bob");
			}
		}
	}
}