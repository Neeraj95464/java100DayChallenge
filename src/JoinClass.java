public class JoinClass extends Thread{
    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("i "+i+" "+targetChar);
        }
        System.out.println("Task Done "+targetChar);
    }
    private final char targetChar;
    public JoinClass(char targetChar){
        this.targetChar=targetChar;
    }
    public static void main(String[] args) {
        JoinClass t1=new JoinClass('*');
        JoinClass t2=new JoinClass('#');
        t2.start();
        t1.start();
        try {
            t2.join();
        }catch (Exception e){
            System.out.println(" This is Error1 "+e);
        }
        try {
            t1.join();
        }catch (Exception e){
            System.out.println(" This is Error2 "+e);
        }
    }
}