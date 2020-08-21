import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Cockroach implements Runnable {

    private static final int FASTEST_STEP = 50;
    private static final int LONGEST_STEP = 100;


    int stepsNum;
    String name;
    public List<Score> scores;
    Random random = new Random();

    public Cockroach(int stepsNum, String name) {
        this.stepsNum = stepsNum;
        this.name = name;

    }



    @Override
    public void run() {
        scores = new ArrayList<>();
        int countTime = 0;

        for (int i = 0; i < stepsNum; i++) {
            countTime = countTime + random.nextInt(50)+50;
           
        }
        Score cockroachScore = new Score(name, countTime);
        scores.add(cockroachScore);
    }

}

