class SynchronizeClass
{
    private int count =0;
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
public class SynchronizedThread extends Thread{
    private SynchronizeClass counter;
    public SynchronizedThread(SynchronizeClass counter){
        this.counter=counter;
    }
    public void run(){
        for(int i=1;i<=1000;i++){
            counter.increment();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        SynchronizeClass counter=new SynchronizeClass();
        SynchronizedThread t1=new SynchronizedThread(counter);
        SynchronizedThread t2=new SynchronizedThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count is "+counter.getCount());
    }
}
