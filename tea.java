import java.util.Scanner;
public class tea
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,k,a,b,i,j,m;
		n=scan.nextInt();
		k=scan.nextInt();
		a=scan.nextInt();
		b=scan.nextInt();
		char A[]=new char[n];
		if(a>=b)
		{
			if(k>b)
			{
				System.out.println("NO");
			}
			else
			{
			for(i=k;i<n;i=i+k+1)
			{
				A[i]='B';
			}
			for(i=0;i<n;i++)
			{
				if(A[i]!='B')
				{
					A[i]='G';
				}
			}
			for(j=0;j<n;j++)
			{
				System.out.printf("%c",A[j]);
			}
			}
		}
		
		else
		{
			if(k>a)
			{
				System.out.println("NO");
			}
			else
			{
			for(i=k;i<n;i=i+k+1)
			{
				A[i]='G';
			}
			for(i=0;i<n;i++)
			{
				if(A[i]!='G')
				{
					A[i]='B';
				}
			}
			for(j=0;j<n;j++)
			{
				System.out.printf("%c",A[j]);
			}		
			
		}
	}
}
}