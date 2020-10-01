import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.util.*;

public class LoadBalansServer implements Runnable {
    DatagramSocket socket;
    byte[] dataIn = new byte[1024];
    DatagramPacket packetIn = new DatagramPacket(dataIn, dataIn.length);
    List<AddressPort> list = new ArrayList<>();
   // ComparatorAddressPort comparatorAddressPort = new ComparatorAddressPort();
    //Comparator<AddressPort> addressPortComparator = ((o1,o2)->o1.key.compareTo(o2.key) );
    //List <>arrayList = new ArrayList<>()
    String reciveToLoadBalanser;

    public LoadBalansServer() {
    }

    public LoadBalansServer(DatagramSocket socket) {
        this.socket = socket;

    }

    @Override
    public void run() {
        try {
            while (true) {
                socket.receive(packetIn);
                reciveToLoadBalanser = new String(dataIn, 0, packetIn.getLength());
                String[] mapData = reciveToLoadBalanser.split("#");
                Integer keyMap = Integer.parseInt(mapData[1]);
                String valueMap = mapData[0];
                list.add(new AddressPort(keyMap, valueMap));
                Collections.sort(list, new ComparatorAddressPort());


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        socket.close();
    }
    public String getAddressString(){
        String a;
        if (list.isEmpty()) a="exit";
    else a=list.remove(0).val;
    return a;
}
}