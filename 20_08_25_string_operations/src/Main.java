import consumer.IStringOperation;
import consumer.InsertStringOperation;
import consumer.LineConsumer;
import consumer.LineSupplier;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        String[] inputStrings = {"SSSS#toLowerCase", "ccc#toUpperCase", "sss#concat", "ccc#replace",
                "YYYYYYY#toLowerCase", "ddddddd#toUpperCase", "uuuuu#concat", "dcdcdcdcdc#replace",
                "QWERT#toLowerCase", "jhgfds#toUpperCase", "1234#concat", "gggccc#replace",
                "MNBVCX'#toLowerCase", "rewq#toUpperCase", "890#concat", "lllllccc#replace"
        };
        List<String> listOperation = new ArrayList<>();
        Map<String, IStringOperation> mapOperation = new HashMap<>();
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        Thread [] suppliers = new LineSupplier[1];
        Thread[] consumers = new LineConsumer[3];
        for (int i = 0; i < inputStrings.length; i++) {
            listOperation.add(inputStrings[i]);
        }

        for (int i = 0; i < suppliers.length; i++) {
            suppliers[i] = new LineSupplier(queue, listOperation);
            suppliers[i].start();
        }


        for (int i = 0; i < consumers.length; i++) {
            consumers[i] = new LineConsumer(queue, mapOperation);
            consumers[i].start();
            Thread.sleep(100);
        }
        for (int i = 0; i < suppliers.length; i++) {

            suppliers[i].join();
        }


        for (int i = 0; i < consumers.length; i++) {

            consumers[i].join();
        }


    }
}
