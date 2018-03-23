import java.util.Scanner;
import java.util.Arrays;
class ritu
{
    public static void main(String[]ars)
    {
        Scanner scan=new Scanner(System.in);
        int n,i,j,k,l;
        n=scan.nextInt();
        Long A[][]=new Long[n][3];
        Long B[]=new Long[3];
        for(i=0;i<n;i++)
        {
            B[0]=scan.nextLong();
            B[1]=scan.nextLong();
            B[2]=scan.nextLong();
            Arrays.sort(B);
            A[i][0]=B[0];
            A[i][1]=B[1];
            A[i][2]=B[2];
            //System.out.println(B[0]+" "+B[1]+" "+B[2]);
        }
        int m=0;
        for(j=0;j<n;j++)
        {
            for(k=0;k<n;k++)
            {
                if(A[j][0]==A[k][0]&&A[j][1]==A[k][1]&&A[j][2]==A[k][2]&&A[j][2]!=0L&&A[j][1]!=0L&&A[j][0]!=0L&&j!=k)
                {
                    m++;
                    A[k][1]=0L;
                    A[k][2]=0L;
                    A[k][0]=0L;
                }
                
            }
        }
        System.out.println(n-2*m);
    }
}