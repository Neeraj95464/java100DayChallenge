import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceClass implements Runnable
{
    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            System.out.print("& "+i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ExecutorService e1= Executors.newFixedThreadPool(3);
//     Single Thread Pool   ExecutorService e2= Executors.newSingleThreadExecutor();
        ExecuterServiceClass c1=new ExecuterServiceClass();
        ExecuterServiceClass c3=new ExecuterServiceClass();
        ExecuterServiceClass c2=new ExecuterServiceClass();
        e1.submit(c1);
        e1.submit(c3);
        e1.submit(c2);
        e1.shutdown();
    }
}
