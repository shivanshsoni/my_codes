import java.util.Scanner;
import java.util.Arrays;
class array23
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		Long A[]=new Long[t];
		Long B[]=new Long[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextLong();
			B[i]=A[i];
		}
		Arrays.sort(A);
		k=scan.nextInt();
		for(j=0;j<k;j++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(a==0)
			{
				int p=0;
				for(l=0;l<t;l++)
				{
					int m=0;
					for(int y=0;y<t;y++)
					{
						if(A[l]==B[y])
						{
							m++;
						}
					}
					if(m>=b)
					{
						System.out.println(A[l]);
						p=1;
						break;
					}
				}
				if(p==0)
				{
					System.out.println("0");
				}
				
			}
			else
			{
				int p=0;
				for(l=0;l<t;l++)
				{
					int m=0;
					for(int y=0;y<t;y++)
					{
						if(A[l]==B[y])
						{
							m++;
						}
					}
					if(m==b)
					{
						System.out.println(A[l]);
						p=1;
						break;
					}
				}
				if(p==0)
				{
					System.out.println("0");
				}
			}
		}
	}
}