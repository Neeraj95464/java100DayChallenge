//Write a program that creates two threads. Each thread should print
//"Hello from Thread X", where X is the number of the thread (1 or 2),
//        ten times, then terminate.
public class QuesThread extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.print("I am from thread 1 ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QuesThread q1=new QuesThread();
        QuesThreadAnotherClass q2=new QuesThreadAnotherClass();
        q2.start();
        q1.start();
    }
}
class QuesThreadAnotherClass extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.print("I am from thread 2 ");
        }
        System.out.println();
    }
}
