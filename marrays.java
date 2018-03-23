import java.util.*;
class marrays
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
			int B[]=new int[n];
			for(j=0;j<n;j++)
			{
				k=scan.nextInt();
				int C[]=new int[k];
				for(l=0;l<k;l++)
				{
					C[l]=scan.nextInt();
				}
				Arrays.sort(C);
				A[j]=C[k-1];
				B[j]=C[0];
			}
			int C[]=new int[n-1];
			Long h=0L;
			int p=n-2;
			if(Math.abs(A[n-1]-B[n-2])>Math.abs(B[n-1]-A[n-2]))
			{
				h=h+Math.abs(A[n-1]-B[n-2])*(p+1);
				C[p]=A[n-2];
				p--;
			}
			else
			{
				h=h+Math.abs(B[n-1]-A[n-2])*(p+1);
				C[p]=B[n-2];
				p--;	
			}
			//System.out.println(h);
			for(int y=n-2;y>=1;y--)
			{
				if(Math.abs(C[y]-A[y-1])>Math.abs(C[y]-B[y-1]))
				{
					h=h+Math.abs(C[y]-A[y-1])*(p+1);
					C[p]=B[y-1];
					p--;
				}
				else
				{
					h=h+Math.abs(C[y]-B[y-1])*(p+1);
					C[p]=A[y-1];
					p--;
				}
				//System.out.println(h);
			}
			System.out.println(h);
		}
	}
}