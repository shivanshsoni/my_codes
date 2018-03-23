import java.util.Scanner;
import java.util.Arrays;
class righttri
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,x1,x3,x2,y1,y2,y3,i,j,k,l;
		t=scan.nextInt();
		k=0;
		for(i=0;i<t;i++)
		{
			x1=scan.nextInt();
			y1=scan.nextInt();
			x2=scan.nextInt();
			y2=scan.nextInt();
			x3=scan.nextInt();
			y3=scan.nextInt();
			int A[]=new int[3];
			A[0]=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		
			A[1]=(x2-x3)*(x2-x3)+(y2-y3)*(y2-y3);
			
			A[2]=(x1-x3)*(x1-x3)+(y1-y3)*(y1-y3);
			
			Arrays.sort(A);
			if(A[2]==A[1]+A[0])
			{
				k++;
			}
		}
		System.out.println(k);
	}
}