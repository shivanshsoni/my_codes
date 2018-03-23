import java.util.Scanner;
import java.util.Arrays;
class cook89b
{

	static boolean isSubsetSum(int set[], int n, int sum)
    {
        boolean subset[][] = new boolean[sum+1][n+1];
        for (int i = 0; i <= n; i++)
          subset[0][i] = true;
        for (int i = 1; i <= sum; i++)
          subset[i][0] = false;
      
         for (int i = 1; i <= sum; i++)
         {
           for (int j = 1; j <= n; j++)
           {
             subset[i][j] = subset[i][j-1];
             if (i >= set[j-1])
               subset[i][j] = subset[i][j] || 
                                          subset[i - set[j-1]][j-1];
           }
         }
      
      
         return subset[sum][n];
    }
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			long m=scan.nextLong();
			int A[]=new int[n];
			int B[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				B[j]=A[j];
			}
			Arrays.sort(B);
			if(B[n-1]>=m)
			{
				System.out.println("1");
			}
			else
			{		
				int g=1;
				int u=0;	
				int p=0;
				long sum=0L;
				for(k=0;k<n;k++)
				{
					sum=sum+A[k];
					g=1;
					long sum1=sum;
					for(l=1;l<n;l++)
					{
						sum1=sum1+A[l];
						//System.out.println(sum1)
						if(sum1>=m)
						{
							g++;
							break;
						}
						else
						{
							g++;
						}
					}
					if(p<g)
					{
						p=g;
						if(p==2)
						{
							System.out.println("2");
							u=1;
							break;
						}
					}	
				}
				if(u==0)
				{
					System.out.println(p);
				}
			}
		}
	}
}