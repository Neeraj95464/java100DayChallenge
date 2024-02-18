import java.util.Scanner;

public class FindPrimeNumber
{
    public static void main(String[] args) {
        System.out.println("Enter your number to know Prime number ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int i=1;
        int in=0;
        while (num>=i){
            if(num%i==0) {
                in++;
            }
            i++;
        }
        if(in>2){
            System.out.println("this is not prime");
        }
        else{
            System.out.println("This is prime");
        }
    }
}
