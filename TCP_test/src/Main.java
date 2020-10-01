import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    static final String SERVER_HOST = "localhost";
    static final int SERVER_PORT = 3000;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
        // the object sends data to server
        PrintStream socketOut = new PrintStream(socket.getOutputStream());
        // the object receives data from server
       BufferedReader socketIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String stringIn;
        Random i = new Random();
        int k=i.nextInt(50);
        System.out.println(k);
        for (int j = 0; j < k; j++) {
            if (j<k-1)
                stringIn = "Request namber: " + j;

             else stringIn = "exit";
            // reads lines from the console until "exit" appears
            if (!stringIn.equals("exit")) {
                // sends the line to the server
                socketOut.println(stringIn);

                // waiting for the response from the server
                String response = socketIn.readLine();
                System.out.println(response);
            }

        }
        socket.close();

    }
}
