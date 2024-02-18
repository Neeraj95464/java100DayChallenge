public class ThreadPriority extends Thread
{
    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("i "+i+" "+targetChar);
        }
        System.out.println("Task Done "+targetChar);
    }
    private final char targetChar;
    public ThreadPriority(char targetChar){
        this.targetChar=targetChar;
    }
    public static void main(String[] args) {
        ThreadPriority t1=new ThreadPriority('*');
        ThreadPriority t2=new ThreadPriority('#');
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}
