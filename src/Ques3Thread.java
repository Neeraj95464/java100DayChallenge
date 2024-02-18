//Create three threads. Ensure that the second thread starts only after
//the first thread ends and the third thread starts only after the second
//thread ends using the join method. Each thread should print its start
//and end along with its name.
public class Ques3Thread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.print(" "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Ques3Thread q1=new Ques3Thread();
        Ques3Thread q2=new Ques3Thread();
        Ques3Thread q3=new Ques3Thread();
        System.out.println("q1 started ");
        q1.start();
        q1.join();
        System.out.println("q1 ended ");

        System.out.println("q2 started ");
        q2.start();
        q2.join();
        System.out.println("q2 ended ");

        System.out.println("q3 started ");
        q3.start();
        q3.join();
        System.out.println("q3 ended ");
    }
}
