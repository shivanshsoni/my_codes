import java.util.Scanner;
public class pixel
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j;
		double k;
		t=scan.nextInt();
		j=0;
		int A[]=new int[t];
		for(i=1;i<=t;i++)
		{
			if(t%i==0)
			{
				A[j]=i;
				j++;
			}
		}
		int c=0;
		k=Math.sqrt(t);
		for(int y=0;y<j;y++)
		{
			if(A[y]<=k)
			{
				c=A[y];
			}
		}
		System.out.printf("%d %d",c,t/c);
	}
}