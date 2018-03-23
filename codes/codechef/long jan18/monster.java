import java.util.Scanner;
class monster
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t];
		int f=0;
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
			if(A[i]==1)
			{
				f++;
			}
		}
		k=scan.nextInt();
		int m=0;
		int as=0;
		for(j=0;j<k;j++)
		{
			m=0;
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(f==t&&b==1)
			{
				for(int q=0;q<t;q++)
				{
					if(A[q]>0)
					{
						if((a&q)==q)
						{
							as++;
						}
					}	
				}
				
				System.out.println(t-as);
			}
			else
			{
				for(l=0;l<t;l++)
				{
					if((a&l)==l&&A[l]>0)
					{	
						A[l]=A[l]-b;	
					}
					if(A[l]>0)
					{
						m++;
					}
				}
				System.out.println(m);
			}
		}
	}
}