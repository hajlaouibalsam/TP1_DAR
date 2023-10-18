package ServerPackage;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server 
{

	public static void main(String[] args)throws IOException
	{
		ServerSocket serversocket=null;
		Socket socket=null;
		int resultat =0;
		try
		{
			serversocket = new ServerSocket(1234);
			System.out.println("je suis un serveur en attente la connexion d'un client");
			
			socket = serversocket.accept();
			System.out.println("un client est connecté");
			
			InputStream is=socket.getInputStream();
			OutputStream os=socket.getOutputStream();
			
			int entier=is.read();
			
			int choix = is.read();
			
			switch(choix)
			{
			case 1 :
				resultat = entier+5;
				os.write(resultat);
				break ;
			
			case 2 :
				resultat = entier-5;
				os.write(resultat);
				break;
			case 3 : 
				resultat = entier*5;
				os.write(resultat);
				break;
			case 4 :
				resultat = entier/5;
				os.write(resultat);
				break ;
			default :
				System.out.println("erreur");	
			}
			
		}		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		socket.close();
	}

}

