import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.net.*;
class server
{
	public static void main(String[]ars) throws IOException 
	{
		ServerSocket ss=new ServerSocket(3175);
		Socket so=ss.accept();
		Scanner scan1=new Scanner(System.in);
		//String string1=scan1.next();
		Scanner scan=new Scanner(so.getInputStream());
		//String string=scan.next();
		PrintWriter ps=new PrintWriter(so.getOutputStream());
		//ps.println(string1);
		//System.out.println(string);
		String receiveMessage, sendMessage;               
     	while(true)
     	{
     		if((receiveMessage = scan.next()) != null)  
     	   	{	
     	   	   System.out.println(receiveMessage);         
     	   	}         
     	   	sendMessage = scan1.next(); 
     	   	ps.println(sendMessage);             
     	   	ps.flush();               
    	}	   
	}
}