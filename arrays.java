import java.util.Scanner;
class arrays
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            String str=scan.next();
            char A[]=str.toCharArray();
            k=str.length();
            int B[]=new int[k];
            l=0;
            for(j=0;j<k;j++)
            {
                if(A[j]=='1')
                {
                    B[l]=j;
                    l++;
                }
            }
            int m=0;
            for(int a=0;a<l-1;a++)
            {
                int p=0;
                for(int b=B[a]+1;b<B[a+1];b++)
                {
                    //System.out.println(A[b]);
                    if(A[b]!='0')
                    {
                        p=1;
                    }
                }
                if(p==0)
                {
                    m++;
                }
            }
            System.out.println(m);
        }
    }
}