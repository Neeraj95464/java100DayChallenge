public class FunctionOfFactorial
{
    int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        FunctionOfFactorial obj1=new FunctionOfFactorial();
        System.out.println(obj1.factorial(4));
        System.out.println("hello");
    }
}
