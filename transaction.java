import java.util.Scanner;
class shinopairs
{
	public static void main(String[]afd)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		int A[]=new int[n];
		for(i=0;i<n;i++)
		{
			A[i]=scan.nextInt();
		}
		k=0;
		for(j=1;j<n;j++)
		{
			if(A[j]>A[j-1])
			{
				k++;
			}
		}
		System.out.println(k);
	}
}