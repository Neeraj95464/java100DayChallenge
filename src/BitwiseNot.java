import java.util.Scanner;

public class BitwiseNot
{
    public static void main(String[] args) {
        System.out.println("Enter your number to know bitwise Not ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int ans=~ num;
        System.out.println("bitwise Not answer "+ans);
    }
}
