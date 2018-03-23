import java.util.Scanner;
class chefcount1
{
	public static void main(String[]args)
	{
			Scanner scan=new Scanner(System.in);
			int t,i,j,k,l;
			t=scan.nextInt();
			for(i=0;i<t;i++)
			{
				int n=scan.nextInt();
				Long h=0L;
				Long A[]=new Long[n];
				Long p=1L;
				int s=0;
				for(j=0;j<n;j++)
				{	
					A[j]=p;
					h=h+A[j];
					if(h==4294967295L)
					{
						s=1;
					}
					if(h>4294967295L&&s==0)
					{
						A[j]=h-4294967295L;
						p=2L;
						s=1;
						h=0L;
					}
					if(h>4294967295L&&s==1)
					{
						p=2L;
						A[j]=p;
						s=1;
						h=0L;
					}
					System.out.print(A[k]+" ");
					p++;
				}
				System.out.println("");
			}
	}
}