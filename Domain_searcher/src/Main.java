import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Main {

    static final String ZONES_FILENAME = "zones.txt";
    static final String ZONES_OUTPUT_FILENAME = "zones1.txt";
    static final String ZONES_OUTPUT_FILENAME1 = "zones2.txt";


    public static void main(String[] args) throws IOException {
        FileOperations fo = new FileOperations();
        List<String> unnownHost = new ArrayList<>();
        List<String> nownHost = new ArrayList<>();

        List<String> zones = fo.readFileToList(ZONES_FILENAME);

        Iterator<String> dom = zones.iterator();
        while (dom.hasNext()) {
            String domE = dom.next();
            String urlAddress = "http://evgeny." + domE;

            URL url = new URL(urlAddress);

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            } catch (IOException e) {
                unnownHost.add(urlAddress);
                continue;
            }
            nownHost.add(urlAddress);
        }
        System.out.println(unnownHost);
        System.out.println(nownHost);

        fo.writeListToFile(unnownHost, ZONES_OUTPUT_FILENAME);
        fo.writeListToFile(nownHost, ZONES_OUTPUT_FILENAME1);



    }
}