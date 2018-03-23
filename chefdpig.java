import java.util.Scanner;
class chefdpig
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			int A[]=new int[str.length()];
			int C[]=new int[10];
			for(j=0;j<str.length();j++)
			{
				A[j]=Integer.parseInt(String.valueOf(str.charAt(j)));
				if(A[j]==6||A[j]==7||A[j]==8)
				{
					C[A[j]]++;
					if(C[A[j]]>2)
					{
						C[A[j]]=2;
					}	
				}
				else
				{
					C[A[j]]=1;
				}
			}
			int B[]=new int[26];
			for(k=0;k<10;k++)
			{
				for(l=0;l<10;l++)
				{
					if(C[k]==1&&C[l]==1&&k!=l)
					{
						int a=10*k+l;
						int b=10*l+k;
						if(a<=90&&a>=65)
						{
							B[a-65]=1;
						}
						if(b<=90&&b>=65)
						{
							B[b-65]=1;
						}
					}
					if(C[k]==2&&C[l]==2||C[k]==1&&C[l]==2||C[k]==2&&C[k]==1)
					{
						int a=10*k+l;
						int b=10*l+k;
						if(a<=90&&a>=65)
						{
							B[a-65]=1;
						}
						if(b<=90&&b>=65)
						{
							B[b-65]=1;
						}
					}
				}
			}
			StringBuilder ptr=new StringBuilder("");
			for(int y=0;y<26;y++)
			{
				if(B[y]>0)
				{
					int u=y+65;
					String mtr=Character.toString((char)u);
					ptr=ptr.append(mtr);
				}
			}
			System.out.println(ptr);
		}
	}
}