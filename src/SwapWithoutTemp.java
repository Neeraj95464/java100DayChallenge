public class SwapWithoutTemp
{
    public static void main(String[] args) {
        int a=22;
        int b=11;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a + " "+b);
    }
}
