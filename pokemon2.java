import java.util.Scanner;
public class pokemon2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		int A[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
		}
		int m=0;
		for(k=0;k<n;k++)
		{
			int r=0;
			for(j=0;j<n;j++)
			{
				if(A[k]%A[j]==0&&A[k]!=0)
				{
					r++;
				}
			}
			if(r>=m)
			{
				m=r;
			}
		}
		System.out.println(m);
	}
}