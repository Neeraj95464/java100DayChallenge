//Simulate a traffic signal using threads. Create three threads
//representing three signals: RED, YELLOW, and GREEN. Each signal
//should be on for a certain time, then switch to the next signal in order.
//Use sleep for timing and synchronize to make sure only one signal is
//active at a time.
public class Ques4Thread implements Runnable{
    @Override
    public void run() {
        System.out.println("Red");
    }

    public static void main(String[] args) throws InterruptedException {
        Ques4Thread q1=new Ques4Thread();
        A1 a1=new A1();
        A2 a2=new A2();

        Thread.sleep(1000);
        new Thread(q1).start();
        Thread.sleep(5000);
        new Thread(a1).start();
        Thread.sleep(5000);
        new Thread(a2).start();



//        Thread q11= new Thread(q1);
//        Thread a11= new Thread(a1);
//        Thread a22= new Thread(a2);
//        Thread.sleep(1000);
//        q11.start();
//        Thread.sleep(5000);
//        a11.start();
//        Thread.sleep(5000);
//        a22.start();
    }
}
class A1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Yellow");
    }
}
class A2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Green");
    }
}
