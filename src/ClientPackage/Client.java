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
		try 
		{
			InetAddress host = InetAddress.getByName("localhost");
			System.out.println("je suis un client pas encore connecté");
			socket=new Socket(host,1234);
			System.out.println("je suis un client connecté");	
			
			System.out.println("donner un entier");
			Scanner val;
			val=new Scanner(System.in);
			int x=val.nextInt();
			
			OutputStream os=socket.getOutputStream();
			os.write(x);
			
			InputStream in=socket.getInputStream();
			int c=in.read();	
			System.out.println(x+"*5="+c);
			}
	 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		socket.close();
	}
}

