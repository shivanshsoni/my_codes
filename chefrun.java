import java.util.Scanner;
class chefrun
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[n];
			int m=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			for(k=0;k<n;k++)
			{
				int s=0;
				for(l=0;l<n;l++)
				{
					s=s+A[(k+l)%n];
					s=s%n;
					if(s==k)
					{
						//System.out.println(k+" "+l);
						m++;
						break;
					}
				}
			}
			System.out.println(m);
		}
	}
}