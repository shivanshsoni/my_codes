import java.util.Scanner;
class prmq
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		int n=scan.nextInt();
		for(j=0;j<n;j++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			int d=scan.nextInt();
			int m=0;
			for(k=c;k<=d;k++)
			{
				int p=0;
				for(l=2;l*l<=k;l++)
				{
					if(k%l==0)
					{
						p=1;
						break;
					}
				} 
				if(p==0&&k>1)
				{
					//System.out.println(k);
					for(int y=a;y<=b;y++)
					{
						int exponent = 0;
						if(A[y-1]%k==0)
						{
							int number=A[y-1];
                  			while( number % k == 0 ) 
                  			{
                  			   exponent = exponent + 1; 
                  			   number = number/k;
                  			}
						}
						m=m+exponent;
					}
				}
			}
			System.out.println(m);
		}
	}
}