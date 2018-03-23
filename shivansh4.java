import java.util.Scanner;
public class shivansh4
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t];
		Long sum=0L;
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		for(j=0;j<t;j++)
		{
			for(l=j+1;l<t;l++)
			{
				if(Math.abs(A[j]-A[l])>1)
				{
					sum=sum+A[l]-A[j];
				}
			}
		}
		System.out.println(sum);
	}
}