import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Create a fixed thread pool with a specified number of threads
//using Executors.newFixedThreadPool(int). Submit multiple tasks
//to this executor, where each task should print the current thread's
//name and sleep for a random time between 1 and 5 seconds.
//        Finally, shut down the executor and handle proper termination
//using awaitTermination
public class Ques6Thread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            System.out.print(" "+i+ " ");
        }
        System.out.println();
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) throws InterruptedException {
        Ques6Thread q1=new Ques6Thread();
        Ques6Thread q2=new Ques6Thread();
        Ques6Thread q3=new Ques6Thread();
        ExecutorService executor= Executors.newFixedThreadPool(2);
        Thread.sleep(1000);
        executor.submit(q1);
        Thread.sleep(1000);
        executor.submit(q2);
        Thread.sleep(1000);
        executor.submit(q3);
        executor.shutdown();
    }
}
