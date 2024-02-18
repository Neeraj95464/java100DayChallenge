import java.util.Scanner;

public class BitwiseOR
{
    public static void main(String[] args) {
        System.out.println("Enter your 2 numbers to know bitwise OR ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int num1=input.nextInt();
        int ans=num1 | num;
        System.out.println("bitwise OR answer "+ans);
    }
}
