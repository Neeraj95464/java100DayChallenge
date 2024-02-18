public class SleepClass implements Runnable
{
    @Override
    public void run() {
        System.out.println("This is Thread");
    }

    public static void main(String[] args) throws InterruptedException {
        SleepClass s1=new SleepClass();
        SleepClass s2=new SleepClass();
        new Thread(s2).start();
        Thread.sleep(1000);

        //notify notifyAll() yield() wait()
    }
}
