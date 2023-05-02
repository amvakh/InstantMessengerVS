package Files;
import java.net.*;
import java.io.*;

public class Client2
{
    public static void main(String[] args) throws IOException
     {
     //client server files connect -> access through login ex. // 
        Client client = new Client("127.0.0.1", 3066);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter username: ");
        String username = reader.readLine();
        System.out.print("Enter password: ");
        String password = reader.readLine();
        if (username.equals("client2") && password.equals("password2")) 
        {
            System.out.println("Login Successful / connected to TCP Files ");
            return;
        } else {
            System.out.println("Invalid username or password.");
            return;
        }
        
    }
}
