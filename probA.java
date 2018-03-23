import java.util.Scanner;
public class probA
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		int A[]=new int[n];
		k=0;
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
			k=k+A[i];
		}	
		if(k==0&&n>1)
		{
			System.out.println("YES");
			System.out.println("2");
			System.out.println("1 2");
			System.out.printf("3 %d",n);
		}
		else
		{
			if(n<=2)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
				System.out.println(n);
				for(j=1;j<=n;j++)
				{
					System.out.printf("%d %d\n",j,j);
				}
			}
		}
	}
}