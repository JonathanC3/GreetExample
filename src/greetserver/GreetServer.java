package greetserver;
import java.io.*;
import java.net.*;
public class GreetServer {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    
    public static void main(String[] args) throws IOException, InterruptedException {
        GreetServer server=new GreetServer();
        System.out.println("iniciando greetServer");
        server.start(6666);
    }
    
    public void start(int port) throws IOException{
        serverSocket=new ServerSocket(port);
        clientSocket=serverSocket.accept();
        out=new PrintWriter(clientSocket.getOutputStream(), true);
        in=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting=in.readLine();
            if ("hello server".equals(greeting)) {
                out.println("hello cliente");
            }
            else {
                out.println("unrecognised greeting");
            }
    }
    
    public void stop() throws IOException{
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
    
}
