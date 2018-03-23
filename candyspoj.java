import java.util.Scanner;
import java.util.Arrays;
class candyspoj
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=0;
		while(n!=-1)
		{
			n=scan.nextInt();
			if(n==-1)
			{
				break;
			}
			else
			{
				int A[]=new int[n];
				k=0;
				for(i=0;i<n;i++)
				{
					A[i]=scan.nextInt();
					k=k+A[i];
				}
				int y=0;
				if(k%n==0)
				{
					Arrays.sort(A);
					for(l=0;l<n;l++)
					{
						if(A[l]<k/n)
						{
							y++;
						}
					}
					if(k/n-A[0]==1)
					System.out.println(y);
					else
					System.out.println(y-A[0]+1+k/n);
				}
				else
				{
					System.out.println("-1");
				}
			}
		}
	}
}