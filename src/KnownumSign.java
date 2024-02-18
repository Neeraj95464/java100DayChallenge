import java.util.Scanner;

public class KnownumSign
{
    public static void main(String[] args) {
        System.out.println("Enter your number to know the number sign ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        if(num==0){
            System.out.println("it's 0 means positive ");
        }
        else if(num>0){
            System.out.println("it's positive ");
        }
        else{
            System.out.println("it's negative ");
        }
    }
}
