import java.util.Scanner;
class poly1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			Long A[]=new Long[n];
			Long B[]=new Long[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextLong();
				B[j]=scan.nextLong();
				k=scan.nextInt();
				k=scan.nextInt();
				
			}
			int q=scan.nextInt();
			for(l=0;l<q;l++)
			{
				Long p=scan.nextLong();
				Long min=Long.MAX_VALUE;
				for(k=0;k<n;k++)
				{
					Long h=A[k]+B[k]*p;
					if(min>h)
					{
						min=h;
					}
				}
				System.out.println(min);
			}
		}
	}
}