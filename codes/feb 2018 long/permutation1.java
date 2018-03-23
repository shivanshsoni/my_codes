import java.util.Scanner;
import java.util.Arrays;
class permutation1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			String str=scan.next();
			char A[]=str.toCharArray();
			int B[]=new int[str.length()];
			Arrays.fill(B,0);
			int m=0;
			if(str.length()%2==0)
			{
				int r=0;
				int p=0;
				for(j=0;j<str.length();j++)
				{
					if(A[j]!='Z')
					{
						int s=0;
						for(k=j+1;k<str.length();k++)
						{
							if(A[j]==A[k])
							{
								A[j]='Z';
								A[k]='Z';
								B[m]=j;
								B[str.length()-1-m]=k;
								m++;
								s=1;
								break;
							}
						}
						if(s==0)
						{
							r=1;
							System.out.println("-1");
							break;
						}
					}
					if(r==0&&m==str.length()/2)
					{
						for(l=0;l<str.length();l++)
						{
							System.out.print(B[l]+1+" ");
						}
						System.out.println(" ");
						break;
					}
				}
			}	
			else
			{
				int p=0;
				int r=0;
				int y=0;
				for(j=0;j<str.length();j++)
				{
					if(A[j]!='Z')
					{
						int s=0;
						for(k=j+1;k<str.length();k++)
						{
							if(A[j]==A[k])
							{
								A[j]='Z';
								A[k]='Z';
								B[m]=j;
								B[str.length()-1-m]=k;
								m++;
								s=1;
								break;
							}
						}
						if(s==0)
						{
							if(y==0)
							{
								A[j]='Z';
								B[str.length()/2]=j;
								y++;
							}
							else
							{
								r=1;
								System.out.println("-1");
								break;
							}
						}
					}
					if(m==str.length()/2&&r==0&&y==1)
					{
						for(l=0;l<str.length();l++)
						{
							System.out.print(B[l]+1+" ");
						}
						System.out.println(" ");
						break;
					}

				}
			}
		}
	}
}