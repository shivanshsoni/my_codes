import java.util.Scanner;
class potential
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int q=scan.nextInt();
		int A[]=new int[t];
		
		int B[]=new int[t];
		
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		for(j=0;j<t;j++)
		{
			B[j]=scan.nextInt();
		}
		for(k=0;k<q;k++)
		{
			l=scan.nextInt();
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(l==1)
			{
				A[a-1]=b;
			}
			if(l==2)
			{
				B[a-1]=b;
			}
			if(l==3)
			{
				int max=0;
				for(int g=a-1;g<=b-1;g++)
				{
					int o=A[g]+Math.min(B[g],g+1-a);
					//System.out.println(A[g]+" "+Math.min(B[g],g-a));
					if(max<o)
					{
						max=o;
					}
				}
				System.out.println(max);
			}	
		}
	}
}