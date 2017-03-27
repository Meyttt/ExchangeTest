/**
 * Created by a.chebotareva on 27.03.2017.
 */
public class Counter extends Thread{
    private WorkExchange workExchange;

    Integer work = null;
    String answer = null;

    public Counter(WorkExchange workExchange) {
        this.workExchange = workExchange;
    }

    public void run(){
        while(true){
            try {
                work=workExchange.readWork();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Math.pow(777,8789);
            System.out.println("Counter is calculating...");
            Math.pow(778,8789);
            System.out.println("Counter is calculating...");
            Math.pow(779,8789);
            try {
                workExchange.putAnswer("This is the answer for "+work);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
