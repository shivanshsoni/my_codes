import java.util.Scanner;
class he12
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            int n=scan.nextInt();
            int A[]=new int[n];
            for(l=0;l<n;l++)
            {
                A[l]=scan.nextInt();
            }
            int B[]=new int[n/2+1];
            int C[]=new int[n/2+1];
            int s=0;
            for(int a=1;a<n;a=a+2)
            {
                B[s]=A[a+1];
                C[s]=A[a];
                s++;
            }
            if(A[0]!=0)
            {
                System.out.println(A[0]);
            }
            for(j=0;j<s;j++)
            {
                if(B[j]!=0)
                {
                    System.out.println(B[j]);
                }
            }
            for(k=0;k<s-1;k++)
            {
                if(C[k]!=0)
                {
                    System.out.println(C[k]);
                }
            }
            System.out.println("");
        }
    }
}