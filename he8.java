import java.util.Scanner;
class he8
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int x1=scan.nextInt();
			int y1=scan.nextInt();
			int x2=scan.nextInt();
			int y2=scan.nextInt();
			int x3=scan.nextInt();
			int y3=scan.nextInt();
			int x4=scan.nextInt();
			int y4=scan.nextInt();
			int a=(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;
			if(a<0)
			{
			    a=-a;
			}
			int a1=(x1*(y2-y4)+x2*(y4-y1)+x4*(y1-y2))/2;
			if(a1<0)
			{
			    a1=-a1;
			}
			int a2=(x4*(y2-y3)+x2*(y3-y4)+x3*(y4-y2))/2;
			if(a2<0)
			{
			    a2=-a2;
			}
			int a3=(x1*(y4-y3)+x4*(y3-y1)+x3*(y1-y4))/2;
			if(a3<0)
			{
			    a3=-a3;
			}
			if(a==a1)
			{
				System.out.println("INSIDE");
			}
			else
			{
				System.out.println("OUTSIDE");
			}
		}
	}
}