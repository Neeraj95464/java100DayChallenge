import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args) {
        System.out.println("Enter your number to know even or odd ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        if(num%2==0){
            System.out.println("This is a even number ");
        }
        else{
            System.out.println("This is a odd number");
        }
    }
}
