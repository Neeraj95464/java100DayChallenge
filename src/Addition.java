import java.util.Scanner;

public class Addition
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter two numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num2+num1;
        System.out.println("your addition of 2 numbers is "+sum);
    }
}
