import java.util.Scanner;
class class2
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
			int n,i,j,k;
			n=scan.nextInt();
			int A[]=new int[n];
			for(i=0;i<n;i++)
			{
				A[i]=scan.nextInt();
			}
			int m=0;
			int o=0;
			if(A[0]==1 && A[1]==2)
			{
				m++;
			}
			else if(A[0]==1)
			{
				m++;
			}
			else
			{
				o++;
			}
			System.out.printf("%d %d",m,o);
		
	}
}