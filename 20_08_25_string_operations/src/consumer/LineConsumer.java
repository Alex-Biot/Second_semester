package consumer;

import consumer.IStringOperation;

import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class LineConsumer extends Thread {

    private final BlockingQueue<String> queue;
    Map<String, IStringOperation> operationByName;

    IStringOperation operation;

    public LineConsumer(BlockingQueue<String> queue, Map<String, IStringOperation> operationByName) {
        this.queue = queue;
        this.operationByName = operationByName;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String line = queue.take();
                //TODO: split the line on parts: the text to operate on and the name of the operation
                String[] splitLine = line.split("#");
                String text = splitLine[0];
                String operationName = splitLine[1];
                operation = new InsertStringOperation(operationName);
                String res = operation.operate(text);
                operationByName.put(res, operation);
                System.out.println("take: "+res +"  "+operationName);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}