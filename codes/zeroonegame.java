import java.util.Scanner;
class zeroonegame
{
	public static void main(String[]args)
	{	
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l,n;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			n=scan.nextInt();
			int A[]=new int[n];
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
			}
			k=0;
			int g=0;
			while(true)
			{
				int y=k;
				for(l=1;l<n-1;l++)
				{
					if(A[l-1]==0&&A[l+1]==0&&A[l]!=-1)
					{
						k++;
						A[l]=-1;
					}
				}
				if(y==k)
				{
					break;
				}
			}
			System.out.println(k);
			if(k%2==0)
			{
				System.out.println("Bob");
			}
			else
			{
				System.out.println("Alice");
			}
		}
	}
}