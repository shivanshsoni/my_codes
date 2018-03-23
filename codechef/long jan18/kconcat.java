import java.util.Scanner;
import java.util.Arrays;
class kconcat
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int t,i,j,k,l;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			int n=scan.nextInt();
			k=scan.nextInt();
			int A[]=new int[2*n];
			int B[]=new int[n];
			Long sum=0L;
			int m=0;
			for(j=0;j<n;j++)
			{
				A[j]=scan.nextInt();
				A[j+n]=A[j];
				B[j]=A[j];
				sum=sum+A[j];
				if(A[j]<0)
				{
					m++;
				}
			}

			int size = A.length;
    	    Long max_so_far = Long.MIN_VALUE, max_ending_here = 0L;	
 	       	for (int a = 0; a < size; a++)
     	   	{
     	       	max_ending_here = max_ending_here + A[a];
     	       	if (max_so_far < max_ending_here)
     	       	    max_so_far = max_ending_here;
     	       	if (max_ending_here < 0L)
     	           max_ending_here = 0L;
     	  	}

     	  	int size1 = B.length;
    	    Long max_so_far1 = Long.MIN_VALUE, max_ending_here1 = 0L;	
 	       	for (int s = 0; s < size1; s++)
     	   	{
     	       	max_ending_here1 = max_ending_here1 + B[s];
     	       	if (max_so_far1 < max_ending_here1)
     	       	    max_so_far1 = max_ending_here1;
     	       	if (max_ending_here1 < 0L)
     	           max_ending_here1 = 0L;
     	  	}
			
			Long sum1=0L;
			Long max=0L;
			for(int y=n-1;y>=0;y--)
			{
				sum1=sum1+B[y];
				if(max<sum1)
				{
					max=sum1;
				}
			}
			Long sum2=0L;
			Long max1=0L;
			for(int y=0;y<n;y++)
			{
				sum2=sum2+B[y];
				if(max1<sum2)
				{
					max1=sum2;
				}
			}
			if(k==3)
			{
				Long C[]=new Long[3];
				C[0]=max+max1+sum;
				C[1]=sum*k;
				C[2]=max_so_far;
				Arrays.sort(C);
				System.out.println(C[2]);
				
			}	
			if(k==1)
			{
				System.out.println(max_so_far1);
			}
			if(k==2)
			{
				System.out.println(max_so_far);
			}
			if(k>3)
			{
				Long C[]=new Long[4];
				C[0]=max+max1+sum*(k-2);
				C[1]=sum*k;
				C[2]=max_so_far;
				C[3]=max+max1+sum;
				Arrays.sort(C);
				System.out.println(C[3]);
			}
		}
	}
}