public class RunnableClass implements Runnable
{
    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("i "+i+" "+targetChar);
        }
        System.out.println("Task Done "+targetChar);
    }
    private final char targetChar;
    public RunnableClass(char targetChar){
        this.targetChar=targetChar;
    }
    public static void main(String[] args) {
        RunnableClass t1=new RunnableClass('*');
        new Thread(t1).start();
        RunnableClass t2=new RunnableClass('#');
        new Thread(t2).start();
    }
}
