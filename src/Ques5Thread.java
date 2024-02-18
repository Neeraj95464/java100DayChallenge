import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Write a program that creates a single-threaded executor service.
//Define and submit a simple Runnable task that prints numbers
//from 1 to 10. After submission, shut down the executor.
public class Ques5Thread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.print(" "+i);
        }
    }
    public static void main(String[] args) {
        Ques5Thread q1=new Ques5Thread();
        ExecutorService executor= Executors.newSingleThreadExecutor();
        executor.submit(q1);
        executor.shutdown();
    }
}
