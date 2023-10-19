import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(4000);

        InetAddress inet = serverSocket.getInetAddress();

        System.out.println("Host Name:" + inet.getHostName());
        System.out.println("Host adress:" + inet.getHostAddress());

        Socket cliente = serverSocket.accept();

        Scanner scannerClient = new Scanner(cliente.getInputStream());

        System.out.println("Conectado");

        scannerClient.close();
        serverSocket.close();

        System.out.println("Desconectado");

    }

}