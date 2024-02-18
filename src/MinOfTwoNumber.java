import java.util.Scanner;

public class MinOfTwoNumber
{
    public static void main(String[] args) {
        System.out.println("Enter your 2 number ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int num1= input.nextInt();
        num=(num>num1)?num1:num;
        System.out.printf("your min number is %d ",num);
    }
}
