public class Eagle extends Birds{
    @Override
    public void fly() {
        super.fly();
        System.out.println("Now you are flying in Eagle class");
    }

    public static void main(String[] args) {
        Eagle e1=new Eagle();
        e1.fly();
    }
}
