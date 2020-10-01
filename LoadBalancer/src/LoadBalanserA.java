import java.net.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoadBalanserA {
    static final String SERVER_HOST = "localhost";
    static final int SERVER_PORT_BACK = 5001;


    public static void main(String[] args) throws SocketException, UnknownHostException {
        DatagramSocket socketB = new DatagramSocket(SERVER_PORT_BACK);
        LoadBalansServer loadBalansServer = new LoadBalansServer(socketB);
        new Thread(loadBalansServer).start();
        LoadbalanserClient loadbalanserClient=new LoadbalanserClient();
        new Thread(loadbalanserClient).start();


    }
}
