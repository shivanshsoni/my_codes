import java.util.Scanner;
class codearena2
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(j=0;j<t;j++)
        {
            int n=scan.nextInt();
            int A[]=new int[n];
            int B[]=new int[n];
            A[0]=0;
            B[0]=1;
            for(i=1;i<n;i++)
            {
                A[i]=B[i-1];
                B[i]=A[i-1]+B[i-1];
            }
            System.out.println(A[n-1]+" "+B[n-1]);
        }
    }
}