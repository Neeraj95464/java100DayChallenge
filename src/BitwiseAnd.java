import java.util.Scanner;

public class BitwiseAnd
{
    public static void main(String[] args) {
        System.out.println("Enter your 2 number to know bitwise AND ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int num1=input.nextInt();
        int ans=num1 & num;
        System.out.println("bitwise and answer "+ans);
    }
}
