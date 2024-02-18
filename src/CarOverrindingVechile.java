public class CarOverrindingVechile extends OverrindingVechile
{
    @Override
    void service() {
        super.service();
        System.out.println("it is a car ");
    }

    public static void main(String[] args) {
        CarOverrindingVechile obj=new CarOverrindingVechile();
        obj.service();
    }
}
