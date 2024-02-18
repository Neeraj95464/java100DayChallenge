import java.util.concurrent.*;

public class ExecuterFuture implements Runnable, Callable<String> {
    @Override
    public void run() {
        System.out.println("Noting from run means Thread ");
    }
    @Override
    public String call() throws Exception {
        return "Neeraj jii";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService e= Executors.newSingleThreadExecutor();
        ExecuterFuture f=new ExecuterFuture();
        Future<String> nameReturned=e.submit((Callable<String>) f);
        System.out.println("this is raw data "+nameReturned);
        System.out.println("Returned by callable method "+nameReturned.get());
        System.out.println("this is raw data "+nameReturned);
        e.shutdown();
    }
}
