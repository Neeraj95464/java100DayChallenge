import java.util.Scanner;

public class SwitchCase
{
    public static void main(String[] args) {
        System.out.println("Enter your number ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        switch (num){
            case 1:
                System.out.println("Enter your 2 number for addition");
                int num1= input.nextInt();
                int num2= input.nextInt();
                System.out.printf("Now your addition is %d",num1+num2);
                break;
            case 2:
                System.out.println("Enter your 2 number for subtraction");
                 num1= input.nextInt();
                 num2= input.nextInt();
                System.out.printf("Now your subtraction is %d",num1-num2);
                break;
            case 3:
                System.out.println("Enter your 2 number for division");
                num1= input.nextInt();
                num2= input.nextInt();
                System.out.printf("Now your division is %d",num1/num2);
                break;
            case 4:
                System.out.println("Enter your 2 number for Multiplication");
                num1= input.nextInt();
                num2= input.nextInt();
                System.out.printf("Now your Multiplication is %d",num1*num2);
                break;
            case 5:
                System.out.println("Enter your 2 number for reminder");
                num1= input.nextInt();
                num2= input.nextInt();
                System.out.printf("Now your reminder is %d",num1%num2);
                break;
            default:
                System.out.println("Please enter Valid Number ");
                break;
        }
    }
}
