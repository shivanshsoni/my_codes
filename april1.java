import java.util.Scanner;
class april1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,h,n,i,j,k,l,m;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			k=scan.nextInt();
			int A[]=new int[k];
			m=0;
			h=0;
			for(j=0;j<n;j++)
			{
				m=0;
				l=scan.nextInt();
				for(int y=0;y<l;y++)
				{
					int f=scan.nextInt();
					A[f-1]=1;
				}
				for(int p=0;p<k;p++)
				{
					if(A[p]==1)
					{
						m++;
					}
				}
				if(m==k)
				{
					h=j+1;
					k=-1;
				}
			}
			if(h<n&&h!=0)
			{
				System.out.println("some");
			}
			if(h==n)
			{
				System.out.println("all");
			}
			if(h==0)
			{	
				System.out.println("sad");
			}
		}
	}
}