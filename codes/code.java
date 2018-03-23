import java.util.*;
public class algo
{

    public static void main(String[] args)
    {    
        Scanner scan=new Scanner(System.in);
        int a,b;
        a=scan.nextInt();
        b=scan.nextInt();
        String str[]=new String[a];
        for(int i=0;i<a;i++)
        {
            str[i]=scan.next();
        }
        for(int j=0;j<b;j++)
        {
            int p,z;
            p=scan.nextInt();
            z=scan.nextInt();
            int l1 = str[p].length();
            int l2 = str[z].length();
 
            int[][] arr = new int[l1 + 1][l2 + 1];
            int len = 0, pos = -1;
 
            for (int x = 1; x < l1 + 1; x++)
            {
                for (int y = 1; y < l2 + 1; y++)
                {
                    if (str[p].charAt(x - 1) == str[z].charAt(y - 1))
                    {
                        arr[x][y] = arr[x - 1][y - 1] + 1;
                        if (arr[x][y] > len)
                        {
                            len = arr[x][y];
                            pos = x;
                        }               
                    }
                    else
                    arr[x][y] = 0;
                }
            }     
            if(pos<0)
            {
                pos=0;
            }   
            String res=str[p].substring(pos - len, pos);
            int result=res.length();
            System.out.println(result);
        } 
       
    }
}