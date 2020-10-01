import java.io.IOException;
import java.net.*;

public class LoadbalanserClient implements Runnable{
    static final String SERVER_HOST = "localhost";
    static final int SERVER_PORT_GATE = 5002;


    LoadBalansServer getAddr = new LoadBalansServer();
    InetAddress serverAddress = InetAddress.getByName(SERVER_HOST);
    DatagramSocket socketG = new DatagramSocket();
    public LoadbalanserClient() throws SocketException, UnknownHostException {
    }

    @Override
    public void run() {
        while (true){
            byte[] dataOutG = getAddr.getAddressString().getBytes();
            DatagramPacket packetOut = new DatagramPacket(
                    dataOutG,
                    dataOutG.length,
                    serverAddress,
                    SERVER_PORT_GATE
            );
            try {
                socketG.send(packetOut);
                Thread.sleep(1000);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
