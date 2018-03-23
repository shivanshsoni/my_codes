import java.util.Scanner;
class hilljump
{
	public static void main(String[]rags)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		int n=scan.nextInt();
		int A[]=new int[t];
		int B[]=new int[t];
		int C[]=new int[t];
		int d=1;
		int f=0;
		for(i=0;i<t;i++)
		{
			A[i]=scan.nextInt();
			if(i==0)
			{
				B[0]=i;
				C[0]=A[0];
			}
			if(i>0)
			{
				if(A[i]>A[d])
				{
					C[f]=A[i];
					B[f]=i;
					f++;
					d++;
				}
			}
		}
		for(int r=0;r<f;r++)
		{
			System.out.println(B[r]+" "+C[r]);
		}
		for(j=0;j<n;j++)
		{
			k=scan.nextInt();
			if(k==1)
			{
				int a=scan.nextInt();
				int b=scan.nextInt();
				int h=A[a-1];
				int p=a-1;
				int o=0;
				for(l=a;l<t;l++)
				{
					if(A[l]>h&&l-p<=100)
					{
						o++;
						p=l;
						h=A[l];
					}
					if(l-p>100)
					{
						break;
					}
					if(o==b)
					{
						break;
					}
				}
				System.out.println(p+1);
			}
			if(k==2)
			{
				int a=scan.nextInt();
				int b=scan.nextInt();
				int c=scan.nextInt();
				for(int y=a-1;y<=b-1;y++)
				{
					A[y]=A[y]+c;
				}
			}
		}
	}
}