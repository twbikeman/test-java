import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5000)) {
            Socket socket = serverSocket.accept();
            System.out.println();
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);            
            while(true) {
                String echoString = input.readLine();
                if (echoString.equals("exit")) {
                    break;
                }
                output.println("Echo from server: " + echoString);
            }
        } catch(IOException e) {
            System.out.println("Server exception " + e.getMessage());
            e.printStackTrace();
        }

    } 

}