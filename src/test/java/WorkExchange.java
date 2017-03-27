import java.util.concurrent.SynchronousQueue;

/**
 * Created by a.chebotareva on 27.03.2017.
 */
public class WorkExchange {
    SynchronousQueue<Integer> q1 = new SynchronousQueue<Integer>();
    SynchronousQueue<String> q2 = new SynchronousQueue<String>();

    Integer command;

    public String sendWork(Integer work) throws InterruptedException {
        q1.put(work);
        return q2.take();
    }
     public Integer readWork() throws InterruptedException {
        return q1.take();
     }
     public void putAnswer(String answer) throws InterruptedException {
        q2.put(answer);
     }
}

