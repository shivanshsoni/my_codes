import java.util.Scanner;
import java.util.Arrays;
public class tennis
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		Long T=Long.valueOf(t);
		Long n=scan.nextLong();
		int A[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		if(n>=T)
		{
			Arrays.sort(A);
			System.out.println(A[t-1]);
		}
		else
		{
			Long B[]=new Long[t];
			Arrays.fill(B,0L);
			int max=0;
			int p=0;
			int u=0;
			if(A[0]>A[1])
			{	
				max=A[0];
				B[0]++;
				p=0;
			}
			else
			{
				max=A[1];
				p=1;
				B[1]++;
			}
			if(B[0]==n)
			{
				u=1;
				System.out.println(A[p]);
			}
			if(B[1]==n)
			{
				u=1;
				System.out.println(A[p]);
			}
			if(u==0)
			{
				for(l=2;l<t;l++)
				{
					if(max>A[l])
					{
						B[p]++;
						if(B[p]==n)
						{
							System.out.println(A[p]);
							break;
						}
					}
					else
						{
						max=A[l];
						p=l;
						B[p]++;
						if(B[p]==n)
						{
							System.out.println(A[p]);
							break;
						}
					}
				}
			}
		}
	}
}