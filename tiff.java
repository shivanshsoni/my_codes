import java.util.Scanner;
class tiff
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
            for(j=0;j<n;j++)
            {
                A[j]=scan.nextInt();
            }
            int m=0;
            for(k=0;k<n;k++)
            {
                int p=0;
                for(l=0;l<n;l++)
                {
                    if(A[k]==A[l])
                    {
                        p++;
                        //System.out.println(p);
                    }
                }
                if(p>m)
                {
                    m=p;
                }
            }
            System.out.println(m);
    
        }
    }
}