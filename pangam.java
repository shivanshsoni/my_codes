import java.util.Scanner;
class pangam
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int A[]=new int[26];
			for(j=0;j<26;j++)
			{
				A[j]=scan.nextInt();
			}
			String str=scan.next();
			char B[]=str.toCharArray();
			int sum=0;
			for(char ch='a';ch<='z';ch++)
			{
				int p=0;
				for(k=0;k<str.length();k++)
				{
					if(B[k]==ch)
					{
						p=1;
						break;
					}
				}
				if(p==0)
				{
					l=(int) ch;
					sum=sum+A[l-97];
				}
			}
			System.out.println(sum);
		}
	}
}