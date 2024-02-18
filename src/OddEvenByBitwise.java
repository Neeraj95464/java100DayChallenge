import java.util.Scanner;

public class OddEvenByBitwise
{
    public static void main(String[] args) {
        System.out.println("Enter your number to know odd or even ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        if((num & 1)==1){
            System.out.println("your number is odd");
        }
        else{
            System.out.println("your number is even");
        }
    }
}
