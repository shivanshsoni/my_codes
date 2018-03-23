import java.util.Scanner;
class code
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        int A[]=new int[t];
        for(i=0;i<t;i++)
        {
            A[i]=scan.nextInt();
        }
        for(j=1;j<t;j++)
        {
            int p=0;
            for(k=0;k<j;k++)
            {
               if(A[k]>=A[k+1])
               {
                   A[k]=A[k]+1;
                   System.out.println(A[k]);
               }
               else
               {
                   p=1;
                   break;
                   
               }
            }
            if(p==1)
            {
                break;
            }
        }
        for(l=0;l<t;l++)
        {
            System.out.print(A[l]+" ");
        }
    }
}