import java.util.*;
import java.util.Arrays;
//import org.apache.commons.lang.ArrayUtils;
class partition
{
	static int p;
	static int v;
	static boolean[][] dp;
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			v=n;
			int m=scan.nextInt();
			p=m;
			int sum=0;
			l=0;
			int A[]=new int[m-1];
			for(j=1;j<n;j++)
			{
				A[l]=j;
				sum=sum+A[l];
				l++;
			}
			for(k=n+1;k<=m;k++)
			{
				A[l]=k;
				sum=sum+A[l];
				l++;
			}
			if(sum%2!=0)
			{
				System.out.println("impossible");
			}
			else
			{
				sum=sum/2;
				printSubsetsRec(A,m-1,sum,n);
				System.out.println(" ");
			}
		}
	}
	static boolean printSubsetsRec(int set[],int n, int sum, int prev)
    {
        boolean dp[][]=new boolean[n + 1][sum + 1];
        for(int x=0;x<=n;x++)
        {
        	dp[x][0]=true;
        }
        for(int z=0;z<=sum;z++)
        {
        	dp[0][z]=false;
        }
 
    	for (int i = 1; i <= n; ++i) 
    	{
    	    for (int j = i; j <= sum; ++j) 
    	    {
                dp[i][j] = dp[i - 1][j];
                if (dp[i - 1][j] == false && j - set[i - 1] >= 0) 
                {
               	    dp[i][j] = dp[i - 1][j - set[i - 1]];
               	}  	
        	}
    	}
 
    	// print
    	if (dp[n][sum]) 
    	{
        	ArrayList<Integer> p =new ArrayList<>();
        	int i = n;
        	int j = sum;
        	while (i > 0 && j > 0) 
        	{
            	if (dp[i - 1][j]) 
            	{
               		--i;
            	} 
            	else 
            	{
                	p.add(set[i - 1]);
                	j -= set[i - 1];
                	--i;
            	}
        	}
        	int y=p.size();
        	int B[]=new int[y];
        	for(int d=0;d<y;d++)
        	{
        		B[d]=p.get(d).intValue();
        	}
        	int C[]=new int[n+1];
        	Arrays.fill(C,0);
        	for(int g=0;g<p.size();g++)
        	{
        		C[B[g]-1]=1;
        	}
        	C[prev-1]=2;
        	for(int a=0;a<n+1;a++)
        	{
        		System.out.print(C[a]);
        	}
    	}
    	else
    	{
    		System.out.println("impossible");
    	}
    	return dp[n][sum];
	}
}  