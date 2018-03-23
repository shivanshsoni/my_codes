import java.util.Scanner;
class xentask
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			int B[]=new int[n];
			int s1,s2,s3,s4;
			s1=0;
			s2=0;
			s3=0;
			s4=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				if(j%2==0)
				{
					s1=s1+A[j];
				}
				else
				{
					s2=s2+A[j];
				}
			}
			for(k=0;k<n;k++)
			{
				B[k]=scan.nextInt();
				if(k%2==0)
				{
					s3=s3+B[k];
				}
				else
				{
					s4=s4+B[k];
				}
			}
			if(s1+s4>=s2+s3)
			{
				System.out.println(s2+s3);
			}
			else
			{
				System.out.println(s1+s4);
			}
		}
	}	
}