import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.net.*;
class client
{
	public static void main(String[]args) throws IOException
	{
		Socket sc=new Socket("127.0.0.1", 3175);
		Scanner scan=new Scanner(System.in);
		Scanner scan1=new Scanner(sc.getInputStream());
		//String message=scan.next();
		PrintWriter pe=new PrintWriter(sc.getOutputStream());
		//pe.println(message);
		//String message2=scan1.next();
		//System.out.println(message2);
		String receiveMessage, sendMessage;              
    	while(true)
     	{
     		sendMessage = scan.next();  // keyboard reading
        	pe.println(sendMessage);       // sending to server
        	pe.flush();                    // flush the data
        	if((receiveMessage = scan1.next()) != null) //receive from server
        	{
        	    System.out.println(receiveMessage); // displaying at DOS prompt
        	}        
      	}	
	}
}