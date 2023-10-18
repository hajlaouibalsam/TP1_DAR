package ClientPackage;
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.net.InetAddress;

public class Client
{

	public static void main(String[] args) throws IOException 
	{
		Socket socket=null;
		int choix=0;
		int resultat =0;
		
		try 
		{
			InetAddress host = InetAddress.getByName("localhost");
			System.out.println("je suis un client pas encore connecté");
			socket=new Socket(host,1234);
			System.out.println("je suis un client connecté");	
			
			InputStream is=socket.getInputStream();
			OutputStream os=socket.getOutputStream();
			
			System.out.println("donner un entier");
			Scanner val;
			val=new Scanner(System.in);
			int entier=val.nextInt();
			os.write(entier);
			
			do
			{
			System.out.println("*********menu********");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			
			System.out.println("choisir :");
			val = new Scanner(System.in);
			choix = val.nextInt();
			if(choix<1 || choix>4)
				System.out.println("autre tentative");
			
			
			}while(choix<1 || choix>4);
			
			
			
			switch (choix) 
			{
			 case 1:
				 System.out.println("vous avez choisir l'addition");
				 os.write(1);

				 resultat =is.read();
				 System.out.println(entier+"+5 = "+resultat);
				 break;
				 
			 case 2: 
				 System.out.println("vous avez choisir le Substraction");
				 os.write(2);
				 
				 resultat =is.read();
				 System.out.println(entier+"-5 = "+resultat);
				 break;
				 
			 case 3 :
				 System.out.println("vous avez choisir la Multiplication");
				 os.write(3);
				 
				 resultat =is.read();
				 System.out.println(entier+"*5 = "+resultat);
				 break ;
				 
			 case 4 :
				 System.out.println("vous avez choisir la Division");
				 os.write(4);
				 
				 resultat =is.read();
				 System.out.println(entier+"/5 = "+resultat);
				 break;
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
