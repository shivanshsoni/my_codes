import java.util.Scanner;
class help
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t];
		int B[]=new int[t];
		l=0;
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
			B[i]=A[i];
		}
		for(j=0;j<t-1;j++)
		{
			if(A[j]<A[j+1])
			{
				l++;
				A[j+1]=A[j];
			}
		}
		int g=0;
		for(k=t-1;k>=1;k--)
		{
			if(B[k]>B[k-1])
			{
				g++;
				B[k-1]=B[k];
			}
		}
		System.out.println(Math.max(l,g));
	}
}