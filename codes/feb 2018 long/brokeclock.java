import java.util.Scanner;
class brokeclock
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			double a=scan.nextDouble();
			double b=scan.nextDouble();
			Long c=scan.nextLong();
			c=c%3600;
			double time=(double) c;
			double d=Math.asin(b/a);
			double e=Math.acos(b/a);
			d=Math.toDegrees(d);
			e=Math.toDegrees(e);
			//System.out.println(d);
			l=0;
			e=e*c%360;
			if(e<90)
			{
				d=90-e;
			}
			if(e<360&&e>180)
			{
				d=360-e;
			}
			if(d>90&&d<=270)
			{
				l=1;
			}
		//	System.out.println(d);
			d=Math.toRadians(d);
			d=Math.sin(d);
			//System.out.println(d);
			if(l==1)
			{
				d=-d;
			}
			d=d*a%1000000007;
			System.out.println(d);
			int h=(int) d;
			if(d-h>.5)
			{
				System.out.println(h+1);
			}
			else
			{
				System.out.println(h);
			}
		}
	}
}