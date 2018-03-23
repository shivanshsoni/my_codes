import java.util.Scanner;
class stack1
{
	public static void main(String[]arfs)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t];
		int B[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
		}
		k=scan.nextInt();
		l=scan.nextInt();
		int p=0;
		int m=0;
		for(j=0;j<k;j++)
		{
			String str=scan.next();
			if(str.equals("Harry"))
			{
				B[m]=A[p];
				m++;
				p++;
			}
			else
			{
				if(m>0)
				{
					m--;
				}
			}
			int sum=0;
			for(int y=0;y<m;y++)
			{
				sum=sum+B[y];
			}
			if(sum==l)
			{
				System.out.println(m);
				break;
			}
		}
	}
}