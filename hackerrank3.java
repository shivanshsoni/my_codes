import java.util.Scanner;
class hackerrank3
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,k,l;
		n=scan.nextInt();
		if(n==1)
		{
			for(char ch='a';ch<'y';ch++)
			{
				System.out.println(ch);
			}
			System.out.println("z");
		}	
		if(n==2)
		{
			for(char cf='a';cf<='z';cf++)
			{
				if(cf!='a'||cf!='e'||cf!='i'||cf!='o'||cf!='u'||cf!='y')
				{
					System.out.printf("a%c\n",cf);
					System.out.printf("e%c\n",cf);
					System.out.printf("i%c\n",cf);
					System.out.printf("o%c\n",cf);
					System.out.printf("u%c\n",cf);
					System.out.printf("%ca\n",cf);
					System.out.printf("%ce\n",cf);
					System.out.printf("%ci\n",cf);
					System.out.printf("%co\n",cf);
					System.out.printf("%cu\n",cf);
				}
			}
		}
	}
}
