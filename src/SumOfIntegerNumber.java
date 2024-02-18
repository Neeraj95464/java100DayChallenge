import java.util.Scanner;

public class SumOfIntegerNumber {
    public static void main(String[] args) {
        System.out.println("Enter your number to know Some of Number ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int sumOfNumbers=0;
        while(num>0){
            int rem=num%10;
            sumOfNumbers +=rem;
            num=num/10;

            System.out.println("your sumOfNumbers "+sumOfNumbers);
        }
    }
}
