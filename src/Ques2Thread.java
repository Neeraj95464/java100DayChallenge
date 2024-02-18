//Write a program that starts a thread and prints its state after each
//significant event (creation, starting, and termination). Use
//Thread.sleep() to simulate long-running tasks and Thread.getState() to
//print the thread's state
public class Ques2Thread implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Ques2Thread q1=new Ques2Thread();
        new Thread(q1).start();
    }
}
