import java.util.Scanner;
class trams

{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int sum=0;
        int p=0;
        int A[]=new int[a];
        for(i=0;i<b;i++)
        {
            k=scan.nextInt();
            l=scan.nextInt();
            for(int y=0;y<l;y++)
            {
                int g=scan.nextInt();
                if(A[g-1]==0)
                {
                    A[g-1]=1;
                    sum++;
                }
                if(sum==b)
                {
                    p=i;
                }
            }
        }
        for(int u=0;u<c;u++)
        {
            int d=scan.nextInt();
            int e=scan.nextInt();
        }
        System.out.println(p);
        for(int g=0;g<p;g++)
        {
            System.out.print((g+1)+" ");
        }
    }
}