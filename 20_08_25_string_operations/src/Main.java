import consumer.IStringOperation;
import consumer.InsertStringOperation;
import consumer.LineConsumer;
import consumer.LineSupplier;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        String[] inputStrings = {"CCCC#toLowerCase", "ccc#toUpperCase", "ccc#concat", "cccccc#replace",
                "DDDD#toLowerCase", "dddd#toUpperCase", "dddd#concat", "dcdcdc#replace",
                "EEEE#toLowerCase", "eeee#toUpperCase", "eeee#concat", "ececec#replace",
                "FFFF'#toLowerCase", "ffff#toUpperCase", "ffff#concat", "fcfcfc#replace"
        };
        List<String> listOperation = new ArrayList<>();
        Map<String, IStringOperation> mapOperation = new HashMap<>();
        BlockingQueue<String> queue = new SynchronousQueue<>();

        Thread [] suppliers = new LineSupplier[3];
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
            //Thread.sleep(100);
        }
        for (int i = 0; i < suppliers.length; i++) {

            suppliers[i].join();
        }


        for (int i = 0; i < consumers.length; i++) {

            consumers[i].join();
        }


    }
}
