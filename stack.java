import java.util.Scanner;
class stack
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int A[]=new int[t];
		j=0;
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
			if(k==1)
			{
				if(j>0)
				{
					System.out.println(A[j-1]);
					j--;
				}
				else
				{
					System.out.println("No Food");
				}
			}
			else
			{
				A[j]=scan.nextInt();
				j++;
			}
		}
	}
}
