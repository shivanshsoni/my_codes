import java.util.Scanner;
public class problemA1
{
	public static void main(String[]ars)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		int A[]=new int[n];
		int B[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
		}
		for(j=0;j<n;j++)
		{
			B[j]=scan.nextInt();
		}
		int o=0;
		for(k=0;k<n;k++)
		{
			for(l=0;l<n;l++)
			{
				if(A[k]==B[l])
				{
					B[l]=0;
					A[k]=0;
					o++;
					break;
				}
			}
		}
		//System.out.println(o);
		if((n-o)%2!=0)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println((n-o)/2);
		}
	}
}