public class Circle extends AbstractClassShape
{
    private int radious;

    public Circle(int radious) {
        this.radious = radious;
    }
    @Override
    protected void sendResult() {
        System.out.println("Hii from sended Result method ");
        super.sendResult();
    }

    @Override
    protected void calculateArea() {
        System.out.println("Your area of circle is "+ (Math.pow(radious,2)));
    }

    public static void main(String[] args) {
        Circle c1=new Circle(5);
        c1.calculateArea();
        c1.sendResult();
    }
}
