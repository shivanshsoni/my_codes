import java.util.Scanner;
class desk
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int h=37076;
			 k=0;
			//Long p=0L;
			int A[]=new int[n];
			for(j=0;j<92680;j++)
			{
				System.out.print((j+1)+" ");
			//	p=p+j+1;
			}
			for(l=92680;l<n-1;l++)
			{
				System.out.print("5"+" ");
				h=h-5;
				//p=p+5;
			}
			System.out.print(h+" ");
			//p=p+h;
			System.out.println("");
			//System.out.println(p);
		}
	}
}