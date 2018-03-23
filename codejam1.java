import java.util.Scanner;
class codejam1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int A[]=new int[n];
			Double d=(n-1)/2.0; 
			int start=(int) Math.floor(d);
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			int B[]=new int[n];
			int p=1;
			B[0]=A[start];
			//System.out.println(B[0]);
			int a=start;
			int b=start;
			//System.out.println(start);
			for(k=1;k<n;k++)
			{
				if(k%2!=0)
				{
					a++;
					//System.out.println(a);
					B[p]=A[a];
					//System.out.println(B[p]);
					p++;
					//System.out.println(B[p]);
				}
				else
				{
					b--;
					//System.out.println(b-1);
					B[p]=A[b];
					//System.out.println(B[p]);
					p++;
				}
			}
			int g=0;
			if(n==2)
			{
				if(B[1]-B[0]>0||B[1]-B[0]<0)
				{

				}
				else
				{
					g=1;
				}
			}
			else
			{
				if(B[1]-B[0]<0)
				{
					for(l=0;l<n-1;l++)
						{
						if(B[l]-B[l+1]<0&&l%2==0||B[l]-B[l+1]>0&&l%2!=0)
						{
							g=1;
							break;
						}
					}
				}
				else
				{
					for(l=0;l<n-1;l++)
					{
						if(B[l]-B[l+1]>0&&l%2==0||B[l]-B[l+1]<0&&l%2!=0)
						{
							g=1;
							break;
						}
					}
				}
			}
			if(g==0pol)
			{
				System.out.println("Case #"+(i+1)+": "+"YES");
			}
			else
			{
				System.out.println("Case #"+(i+1)+": "+"NO");
			}
		}
	}
}