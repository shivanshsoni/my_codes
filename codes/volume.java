import java.util.Scanner;
class volume
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,x,y;
		Double j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			x=scan.nextInt();
			y=scan.nextInt();
			j=Math.sqrt(x*x+3*(x*x-32*y));
			k=(x+j)/12;
			//System.out.println(k);
			l=(2*x-j)/24;
			//System.out.println(l);
			System.out.printf("%.2f\n",k*l*l);
		}
	}
}