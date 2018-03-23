import java.io.*;
class codes1
{
 public static void main(String args[]) throws IOException
 {
     BufferedReader br=new BufferedReader
     (new InputStreamReader(System.in));

     int T,N,c,i,j;
     String word,s="abcdefghijklmnopqrstuvwxyz";

     System.out.println();
     T=Integer.parseInt(br.readLine());

     for(i=0;i<T;i++)
     {
         N=Integer.parseInt(br.readLine());
         word="";
         c=N/26;
         for(j=0;j<c;j++)
         {
             word+=s;
         }
         c=N%26;
         word+=s.substring(0,c);
         System.out.println(word);
      }
    }
}