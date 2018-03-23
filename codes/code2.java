import java.util.Scanner;
class code2
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int t,i,j,k,l;
        t=scan.nextInt();
        for(i=0;i<t;i++)
        {
            k=scan.nextInt();
            int sum=0;
            l=1;
            for(j=1;j<=k;j++)
            {
                if(k<j*(j+1)/2)
                {
                    break;
                }
            }
 			j=j-1;
            l=k-j*(j+1)/2;
            for(int y=1;y<=j;y++)
            {
                sum=sum+y*y;
            }
            sum=sum+l*(j+1);
            System.out.println(sum);
        }
    }
}