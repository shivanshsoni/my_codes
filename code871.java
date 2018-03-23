import java.util.Scanner;
import java.util.Arrays;
import java.util.Arrays.*;
class code871
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[100001];
		Arrays.fill(A,0);
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			for(j=1;j<=Math.sqrt(k);j++)
			{
				if(k%j==0)
				{
					A[j]++;
					//System.out.print(j+" ");
					if(j!=k/j)
					{
						A[k/j]++;
						//System.out.print(k/j+" ");
					}
				}
			}
		}
		int y=scan.nextInt();
		for(l=0;l<y;l++)
		{
			int g=scan.nextInt();
			System.out.println(A[g]);
	}
}