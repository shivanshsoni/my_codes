import java.util.Scanner;
class pokemon
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l;
		t=scan.nextInt();
		n=scan.nextInt();
		Long A[]=new Long[t];
		Long B[]=new Long[t];
		for(i=0;i<t;i++)
		{	
			A[i]=scan.nextLong();
			B[i]=scan.nextLong();
		}
		for(j=0;j<n;j++)
		{
			k=scan.nextInt();
			if(k==0)
			{
				int a=scan.nextInt();
				A[a-1]=scan.nextLong();
				B[a-1]=scan.nextLong();
			}
			else
			{
				Long sum=0L;
				int a=scan.nextInt();
				int b=scan.nextInt();
				Long c=scan.nextLong();
				Long d=scan.nextLong();
				for(l=a-1;l<b;l++)
				{
					Long e=Math.abs(A[l]-c);
					Long f=Math.abs(B[l]-d);
					sum=sum+Math.max(e,f);
				}
				System.out.println(sum);
			}
		}
	}
}