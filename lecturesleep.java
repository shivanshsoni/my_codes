import java.util.Scanner;
public class lecturesleep
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		k=scan.nextInt();
		int A[]=new int[t];
		int B[]=new int[t];
		int p=0;
		for(i=0;i<t;i++)
		{
			p=scan.nextInt();
			A[i]=p;
		}
		p=0;
		int sum=0;
		for(i=0;i<t;i++)
		{
			p=scan.nextInt();
			B[i]=p;
			if(B[i]==1)
			{
				sum=sum+A[i];
			}
		}
		int g=0;
		for(l=0;l<t-k+1;l++)
		{
			int gf=0;
			for(int s=l;s<l+k;s++)
			{
				gf=A[s]+gf;
				if(B[s]==1)
				{
					gf=gf-A[s];
				}
			}
			gf=sum+gf;
			if(g<gf)
			{
				g=gf;
			}
		}
		System.out.println(g);
	}
}