import java.util.Scanner;
class aprilchallenge
{
	public static void main(String[]ars)
	{	
		Scanner scan=new Scanner(System.in);
		int t,n,i,j,k,l,m=0,h=0;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			j=str.length();
			int A[]=new int[j];
			int B[]=new int[j];
			for(k=0;k<j;k++)
			{
				A[k]=Integer.parseInt(String.valueOf(str.charAt(k)));
				B[k]=A[k];
				if(A[k]==1)
				{
					h++;
				}
			}
			for(int q=j-2;q>=1;q--)
			{
				if(A[q]==1&&A[q-1]==0)
				{
					m=q;
					break;
				}
			}
			int sum=0;
			int y=0;
			int p=0;
			for(l=j-1;l>=0;l--)
			{
				for(y=j-1;y>=0;y--)
				{
					if(A[l]==1&&A[y]==0&&y>l)
					{
						A[y]=1;
						A[l]=0;
						sum=sum+y-l+1;
						break;
					}
				}
			}
			int a,b,c=0;
			for(a=m;a>0;a--)
			{
				c=0;
				for(b=0;b<a;b++)
				{
					if(B[b]==1)
					{
						c++;
					}
				}
				if(B[a]==1&&B[a-1]==0)
				{
					sum=sum+c;
				}
				//System.out.println(sum);
			}
			System.out.println(sum);
		}
	}
}