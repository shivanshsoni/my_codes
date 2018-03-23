import java.util.Scanner;
import java.util.*;
class tweets
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t+1];
		int n=scan.nextInt();
		int sum=0;
		for(i=0;i<n;i++)
		{
				String str=scan.next();
				if(str.equals("CLOSEALL"))
				{
					Arrays.fill(A,0);
					sum=0;
					System.out.println(sum);
				}
				else
				{
					k=scan.nextInt();
					if(A[k]==0)
					{
						A[k]=1;
						sum++;
					}
					else
					{
						A[k]=0;
						sum--;
					}
					System.out.println(sum);
				}
			
		}
	}
}