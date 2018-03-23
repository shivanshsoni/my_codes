import java.util.Scanner;
import java.util.Arrays;
public class compote
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int a,b,c,i,j,k;
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		b=b/2;
		c=c/4;
		int A[]=new int[3];
		A[0]=a;
		A[1]=b;
		A[2]=c;
		Arrays.sort(A);
		System.out.println(A[0]*7);
	}
}