package consumer;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class LineSupplier extends Thread{
    private final BlockingQueue<String> deque;
    private final List <String> list;

    public LineSupplier(BlockingQueue<String> deque, List<String> list) {
        this.deque = deque;
        this.list = list;

    }

    @Override
    public void run() {

        Iterator <String>iterator = list.iterator();
            try {while (iterator.hasNext())
               {
                    String res = iterator.next();
                    deque.put(res);
                    System.out.println("put: "+res);
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
