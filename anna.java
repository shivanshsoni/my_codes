import java.util.Scanner;
import java.util.Arrays;
class anna
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        int A[]=new int[t*3];
        int B[]=new int[3];
        k=0;
        for(i=0;i<t;i++)
        {
            for(j=0;j<3;j++)
            {
                B[j]=scan.nextInt();
            }
            Arrays.sort(B);
            A[k]=B[0];
            A[k]=B[0];
            A[k+1]=B[1];
            A[k+2]=B[2];
            k=k+3;
        }
        int m=0;
        int a=0;
        int b=0;
        for(a=0;a<3*t;a=a+3)
        {
            for(b=a+3;b<3*t;b=b+3)
            {
                if(A[a]==A[b]&&A[a+1]==A[b+1]&&A[a+2]==A[b+2]&&A[a]!=0&&A[b]!=0&&A[a+1]!=0&&A[b+1]!=0&&A[b+2]!=0&&A[a+2]!=0)
                {
                    A[a]=0;
                    A[b]=0;
                    A[a+1]=0;
                    A[b+1]=0;
                    A[a+2]=0;
                    A[b+2]=0;
                    m++;
                }
            }
        }
        System.out.println(t-2*m);
    }
}