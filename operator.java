import java.util.Scanner;
import java.util.Arrays;
class operator
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,k,q,a,b,c;
		n=scan.nextInt();
		k=scan.nextInt();
		q=scan.nextInt();
		int A[]=new int[k];
		int B[]=new int[k];
		for(a=0;a<k;a++)
		{
			A[a]=scan.nextInt();
		}
		int m,d,e,f;
		
		for(b=0;b<q;b++)
		{
			m=scan.nextInt();
			f=0;
			for(c=0;c<k;c++)
			{
				if(m%A[c]==0)
				{
					System.out.println("Yes");
					f++;
					break;
				}
			}
			c=0;
			e=0;
			for(c=0;c<k;c++)
			{
				if(A[c]<m)
				{
					B[e]=A[c];
					e++;
				}
			}
			Arrays.sort(B);
			if(e>0&&f==0)
			{
			m=m%B[e-1];
			d=0;
			for(int y=0;y<e;y++)
			{
				if(m==B[y]);
				{
					System.out.println("Yes");
					d++;
					break;
				}
			}
			if(d==0)
			{
				System.out.println("No");
			}
			}	
			if(e==0&&f==0)
			{
				System.out.println("No");
			}
		}
	}
}