public class ThrowsKeyword
{
    int divide(int a,int b) throws ArithmeticException{
        return a/b;
    }

    public static void main(String[] args) {
        ThrowsKeyword obj=new ThrowsKeyword();
        try {
            System.out.println("your divide ans is "+obj.divide(5,7));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
