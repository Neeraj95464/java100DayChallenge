import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args) {
        System.out.println("Enter your number to know reverse ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int reverseNumber=0;
        while(num>0){
            int re=num%10;
            reverseNumber=reverseNumber*10+re;
            num=num/10;
        }
        System.out.println("your reverse number is "+reverseNumber);
    }
}
