import java.util.Scanner;
import java.util.*;
class graph12
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int x,y,nodes,edges;
		int A[][]=new int[10][10];
		int B[]=new int[10];
		nodes=scan.nextInt();

		Arrays.fill(B,0);
		//Arrays.fill(A,0);
		edges=scan.nextInt();
		for(int i=0;i<edges;i++)
		{
			x=scan.nextInt();
			y=scan.nextInt();
			A[x-1][B[x-1]]=y;
			B[x-1]++;
		}
		for(int i=1;i<=nodes;i++)
		{
			if(B[i-1]>0)
			{
				System.out.print("Node is"+i+": ");
				for(int s=0;s<B[i-1];s++)
				{
					System.out.print(" --> "+A[i-1][s]);
				}
				System.out.println(" ");
			}
			else
			{
				System.out.println("Node is"+i+": "+A[i][B[i-1]]);
			}
		}
	}
}