import java.util.Scanner;
class hackerearth3
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t];
		k=-1;
		n=0;
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			if(n==1&&k>=0)
			{
				System.out.println(A[k]);
				k--;
			}
			else if(n==1&&k<0)
			{
				System.out.println("No Food");
			}
			else
			{
				j=scan.nextInt();
				k++;
				A[k]=j;
			}
		}
	}
}