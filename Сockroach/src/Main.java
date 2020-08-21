import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws InterruptedException {
// Initialize scores list. Then initialize and start all tarakans.
// Then join all the tarakans. Then print the scores out.
        List<Score> totalScore = new ArrayList<>();
        Cockroach[] cockroaches = new Cockroach[10];
        Thread cockroachesThread;
        int stepNum = 20;
        for (int i = 0; i < 10; i++) {
            cockroaches[i] = new Cockroach(stepNum, "Cockroach" + i);
            cockroachesThread = new Thread(cockroaches[i]);
            cockroachesThread.start();
            cockroachesThread.join();
        }
        for (int i = 0; i < 10; i++) {
            totalScore.add(cockroaches[i].scores.get(0));

        }
        System.out.println(totalScore+"\n");
    }
}
