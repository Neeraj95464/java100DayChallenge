import java.util.Scanner;

public class CheckPalindramNumber
{
    public static void main(String[] args) {
        System.out.println("Enter your number to know reverse ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int paliNumber=0;
        int temp=num;
        while(num>0){
            int re=num%10;
            paliNumber=paliNumber*10+re;
            num=num/10;
        }
        if(paliNumber == temp){
            System.out.println("Yes ,this is a palindram number ");
        }
        else{
            System.out.println("NO , this is not a palindram number");
        }
    }
}
