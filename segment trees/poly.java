import java.util.Scanner;
class poly
{
	static Long horner(Long poly[], int n, int x)
	{
		Long result=poly[0];
		for(int i=0;i<n;i++)
		{
			result=result*x+poly[i];
		}
		return result;
	}
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,l;
		int g=scan.nextInt();
		for(l=0;l<g;l++)
		{
			t=scan.nextInt();
			Long A[]=new Long[t];
			Long B[]=new Long[t];
			for(i=0;i<t;i++)
			{
				A[i]=scan.nextLong();
				B[i]=scan.nextLong();
				int r=scan.nextInt();
				r=scan.nextInt();
			}
			int q=scan.nextInt();
			for(j=0;j<q;j++)
			{
				int k=scan.nextInt();
				Long min=Long.MAX_VALUE;
				Long poly[]=new Long[2];
				for(int s=0;s<t;s++)
				{
					poly[0]=B[s];
					poly[1]=A[s];
					Long p=horner(poly, 2, k);
					if(min>p)
					{
						min=p;
					}
				}
				System.out.println(min);	
			}
		}	
	}
}