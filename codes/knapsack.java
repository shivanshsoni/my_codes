import java.util.Scanner;
import java.util.Arrays;
class knapsack
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int a=scan.nextInt();
			int w=scan.nextInt();
			int A[]=new int[a];
			int B[]=new int[a];
			for(j=0;j<a;j++)
			{
				A[j]=scan.nextInt();
			}
			for(k=0;k<a;k++)
			{
				B[k]=scan.nextInt();
			}
			Arrays.sort(A);
			int dp[][]=new int[a+1][w+1];
			for (int col = 0; col <= a; col++) {

            dp[0][col] = 0;

        }



        //What if there are no items at home.

        //Fill the first row with 0
        for (int row = 0; row <= a; row++) {

            dp[row][0] = 0;
        }

			if(w==0||B[0]>w)
			{
				System.out.println("0");
			}
			else
			{
				for(j=1;j<=a;j++)
				{
					for(k=1;k<=w;k++)
					{
						if(B[j-1]<=k)
						{
							dp[j][k]=Math.max(dp[j-1][k], A[j-1]+dp[j-1][k-B[j-1]]);
						}
						else
						{
							dp[j][k]=dp[j-1][k];
						}
					}
				}
			}
			System.out.println(dp[a][w]);
		}
	}
}