import java.util.Scanner;

public class FabonacUpToCertainNum
{
    public static void main(String[] args) {
        System.out.println("Enter your 2 number to know fabonac ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int first=-1;
        int second=1;
        int next=0;
        while(num>=next){
            next=first+second;
            System.out.println(next);
            first=second;
            second=next;
        }
    }
}
