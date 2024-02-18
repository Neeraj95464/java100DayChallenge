public class ThreadClass extends Thread{
    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("i "+i+" "+targetChar);
        }
        System.out.println("Task Done "+targetChar);
    }
    private final char targetChar;
    public ThreadClass(char targetChar){
        this.targetChar=targetChar;
    }
    public static void main(String[] args) {
        ThreadClass t1=new ThreadClass('*');
        t1.start();
        ThreadClass t2=new ThreadClass('#');
        t2.start();
    }
}
