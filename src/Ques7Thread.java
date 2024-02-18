import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

//. Write a program that uses an executor service to execute multiple
//Callable tasks. Each task should calculate and return the factorial
//of a number provided to it. Use Future objects to receive the
//results of the calculations. After all tasks are submitted, retrieve
//the results from the futures, print them, and ensure the executor
//service is shut down correctly.
public class Ques7Thread implements Runnable, Callable<Integer> {
    private int num;
    @Override
    public void run() {
        System.out.println("blanck hai ye ");
    }
    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName());
        int result=1;
        if(num<=1){
            return result;
        }
        else {
            for(int i=2;i<=num;i++){
                result *= i;
            }
            return result;
        }
    }
    Ques7Thread(int num){
        this.num=num;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<Integer>> factorials=new ArrayList<>();
        ExecutorService e= Executors.newFixedThreadPool(5);
        for(int i=1;i<=10;i++){
            Ques7Thread task=new Ques7Thread(i);
           factorials.add(e.submit((Callable<Integer>) task));
        }
        for (Future<Integer> factorial : factorials) {
            System.out.println(" "+factorial.get());
        }
        e.shutdown();
    }
}
