import java.util.Scanner;
class chefhpal
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(b==1||a==1)
			{
				System.out.print(a+" ");
				for(j=0;j<a;j++)
				{
					System.out.print("a");
				}
				System.out.println("");
			}
			else if(a<=b)
			{
				System.out.print("1"+" ");
				int n=0;
				for(char ch='a';ch<='z';ch++)
				{
					System.out.print(ch);
					n++;
					if(n==a)
					{
						break;
					}
				}
				System.out.println("");
			}
			else
			{
				k=a/b;
				int p=a%b;
				if(p==0&&b>2)
				{
					System.out.print("1"+" ");
					for(l=0;l<k;l++)
					{
						int f=b+96;
						char ch1=(char) f;
						for(char ch='a';ch<=ch1;ch++)
						{
							System.out.print(ch);
						}
					}
					System.out.println("");	
				}
				if(p==0&&b==2)
				{
					int A=0;
					int B=0;
					if(a==2)
					{
						System.out.println("1"+" "+"ab");
					}
					else if(a==3)
					{
						System.out.println("2"+" "+"abb");
					}
					else if(a==4)
					{
						System.out.println("2"+" "+"aabb");
					}
					else if(a==5)
					{
						System.out.println("3"+" "+"aaabb");
					}
					else if(a==6)
					{
						System.out.println("3"+" "+"aaabab");
					}
					else if(a==7)
					{
						System.out.println("3"+" "+"aaababb");
					}
					else if(a==8)
					{
						System.out.println("3"+" "+"aaababbb");
					}
					else if(a==9)
					{
						System.out.println("4"+" "+"aaababbbb");
					}
					else if(a==10)
					{
						System.out.println("4"+" "+"aaaababbbb");
					}
					else
					{
						System.out.print("4 ");
						String str="aabbab";
						char D[]=str.toCharArray();
						if(a%6==0)
						{
							for(int fg=0;fg<a/6;fg++)
							{
								System.out.print(str);
							}
						}
						else
						{
							for(int fg=0;fg<a/6;fg++)
							{
								System.out.print(str);
							}
							for(int as=0;as<a%6;as++)
							{
								System.out.print(D[as]);
							}	
						}
						System.out.println("");
					}
				}
				if(p!=0&&b>2)
				{
					System.out.print("1"+" ");
					for(l=0;l<k;l++)
					{
						int f=b+96;
						char ch1=(char) f;
						for(char ch='a';ch<=ch1;ch++)
						{
							System.out.print(ch);
						}
					}
					int d=p+96;
					char ch2=(char) d;
					for(char ch='a';ch<=ch2;ch++)
					{
						System.out.print(ch);
					}
					System.out.println("");
				}
				if(p!=0&&b==2)
				{
					int A=0;
					int B=0;
					if(a==2)
					{
						System.out.println("1"+" "+"ab");
					}
					else if(a==3)
					{
						System.out.println("2"+" "+"abb");
					}
					else if(a==4)
					{
						System.out.println("2"+" "+"aabb");
					}
					else if(a==5)
					{
						System.out.println("3"+" "+"aaabb");
					}
					else if(a==6)
					{
						System.out.println("3"+" "+"aaabab");
					}
					else if(a==7)
					{
						System.out.println("3"+" "+"aaababb");
					}
					else if(a==8)
					{
						System.out.println("3"+" "+"aaababbb");
					}
					else if(a==9)
					{
						System.out.println("4"+" "+"aaababbbb");
					}
					else if(a==10)
					{
						System.out.println("4"+" "+"aaaababbbb");
					}
					else
					{
						System.out.print("4 ");
						String str="aabbab";
						char D[]=str.toCharArray();
						if(a%6==0)
						{
							for(int fg=0;fg<a/6;fg++)
							{
								System.out.print(str);
							}
						}
						else
						{
							for(int fg=0;fg<a/6;fg++)
							{
								System.out.print(str);
							}
							for(int as=0;as<a%6;as++)
							{
								System.out.print(D[as]);
							}	
						}
						System.out.println("");
					}
				}
			}
		}
	}
} 