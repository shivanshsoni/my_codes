import java.util.Scanner;
import java.util.Arrays;
class permutation
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
			int p=str.length();
			int B[]=new int[str.length()];
			Arrays.fill(B,0);
			if(p==1)
			{
				System.out.println("-1");
			}
			else
			{
				if(p%2==0)
				{
					int m=0;
					int s=0;
					int w=0;
					for(j=0;j<str.length()-1;j++)
					{
						s=0;
						for(l=j+1;l<str.length();l++)
						{
							if(A[j]==A[l]&&(int) A[j]>=97)
							{
								s=1;
								A[j]='Z';
								A[l]='Z';
								B[m]=j;
								B[str.length()-1-m]=l;
								m++;
							}
						}
						//System.out.println(s);
						if(s==0&&(int) A[j]>=97)
						{
							System.out.println("-1");
							w=1;
							break;
						}
					}
					if(w==0&&A[str.length()-1]=='Z')
					{
						for(k=0;k<str.length();k++)
						{
							System.out.print(B[k]+1+" ");
						}
						System.out.println("");
					}
					else if(w==0&&A[str.length()-1]!='Z')
					{
						System.out.println("-1");
					}
				}
				else
				{
					int m=0;
					int y=0;
					int w=0;
					for(j=0;j<str.length()-1;j++)
					{
						int s=0;
						for(l=j+1;l<str.length();l++)
						{
							if(A[j]==A[l]&&(int) A[j]>=97)
							{
								s=1;
								A[j]='Z';
								A[l]='Z';
								B[m]=j;
								B[str.length()-1-m]=l;
								m++;
							}
						}
						if(s==0&&(int) A[j]>=97)
						{
							y++;
							if(y==1)
							{
								B[str.length()/2]=j;
								A[j]='Z';
							}
							else
							{
								System.out.println("-1");
								w=1;
								break;
							}
						}
					}
					if(w==0&&A[str.length()-1]=='Z')
					{
						for(k=0;k<str.length();k++)
						{
							System.out.print(B[k]+1+" ");
						}
						System.out.println("");
					}
					else if(w==0&&A[str.length()-1]!='Z'&&y>0)
					{
						System.out.println("-1");
					}
					else if(w==0&&A[str.length()-1]!='Z'&&y==0)
					{
						B[str.length()/2]=str.length()-1;
						for(k=0;k<str.length();k++)
						{
							System.out.print(B[k]+1+" ");
						}
						System.out.println("");
					}
				}
			}
		}
	}
}