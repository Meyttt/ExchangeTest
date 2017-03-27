import java.util.Scanner;

/**
 * Created by a.chebotareva on 27.03.2017.
 */
public class MainThread extends Thread{
    WorkExchange workExchange;

    public MainThread(WorkExchange workExchange) {
        this.workExchange = workExchange;
    }

    public void run(){
        Scanner in = new Scanner(System.in);
        while(true){
            String workStr = in.nextLine();
            if (workStr.equalsIgnoreCase("stop")){
                break;
            }
            Integer work = Integer.parseInt(workStr);
            String result = null;
            try {
                result=workExchange.sendWork(work);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        WorkExchange workExchange = new WorkExchange();
        Counter counter = new Counter(workExchange);
        MainThread mainThread = new MainThread(workExchange);
        counter.start();
        mainThread.start();
    }
}
