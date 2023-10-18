package ClientPackage;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client
{

	public static void main(String[] args) throws IOException 
	{
		Socket socket = null;
		try 
		{
			InetAddress host = InetAddress.getByName("localhost");
			System.out.println("je suis un client pas encore connecté");
			socket=new Socket(host,1234);
			System.out.println("je suis un client connecté");	
			
			
			
		 }
	 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		socket.close();
	
}
}
