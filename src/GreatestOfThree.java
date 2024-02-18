import java.util.Scanner;

public class GreatestOfThree
{
    public static void main(String[] args) {
        System.out.println("Enter your 3 number to know Greatest number ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int num1=input.nextInt();
        int num2=input.nextInt();
        // if num is greater;
        if(num1>num){
            num=num1;
        }
        if(num2>num){
            num=num2;
        }
        System.out.println("Your greater number is "+num);
    }
}
