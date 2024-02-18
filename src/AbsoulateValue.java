import java.util.Scanner;

public class AbsoulateValue
{
    public static void main(String[] args) {
        System.out.println("Enter your number to know abs value");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        System.out.println(num);
        System.out.println("your abs is "+Math.abs(num));
    }
}
