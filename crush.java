import java.util.Scanner;
class crush
{
	public static void main(String[]rgs)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		String str;
		str=scan.next();
		n=str.length();
		i=0;
		j=0;
		int A[]=new int[n];
		for(k=0;k<n;k++)
		{
			A[k]=Integer.parseInt(String.valueOf(str.charAt(k)));
			if(A[k]==1)
			{
				i++;
			}
			if(A[k]==2)
			{
				j++;
			}
		}
		if(i==j)
		{
			System.out.println(str);
		}
		else
		{
			if(j>i)
			{
				while(j!=i)
				{
					if(A[k-1]==2)
					{
						A[k-1]=1;
						j--;
						i++;
					}
					k--;
				}
				for(int y=0;y<n;y++)
				System.out.printf("%d",A[y]);
			}
			if(j<i)
			{
				while(i!=j)
				{
					if(A[k-1]==1)
					{
						A[k-1]=2;
						i--;
						j++;
					}
					k--;
				}
				for(int y=0;y<n;y++)
				System.out.printf("%d",A[y]);
			}
		}
	}
}