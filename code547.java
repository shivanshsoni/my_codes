import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class code547
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
		while(T>0){
			T--;
 
			int n=scan.nextInt();
			int[] arr = new int[n];
			int[] flag = new int[6];
			boolean imp=false;
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
			}
			for(int i=0;i<6;i++){
				if(i>0 && arr[i]==arr[i-1]){imp=true;break;}
				if(n>1 && i<n-1){flag[i]=arr[i];flag[i+1]=arr[i+1];}
			}
		if(imp==true)System.out.println("-1");	
		else{
			for(int i=6;i>=1;i--){
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		}
	}
}