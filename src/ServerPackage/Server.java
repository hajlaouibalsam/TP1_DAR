package ServerPackage;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server 
{

	public static void main(String[] args)throws IOException
	{
		ServerSocket serversocket = null;
		Socket socket = null;
		try
		{
			serversocket = new ServerSocket(1234);
			System.out.println("je suis un serveur en attente la connexion d'un client");
			
			socket = serversocket.accept();
			System.out.println("un client est connecté");
			
		}		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		socket.close();
	}

}
