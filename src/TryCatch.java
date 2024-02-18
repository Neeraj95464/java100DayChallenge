import java.util.Scanner;

public class TryCatch
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("your your 2 numbers for divide ");
        int num=input.nextInt();
        int num2=input.nextInt();
        try {
            System.out.println("Your divide answer is "+num/num2);
        }catch (Exception e){
            System.out.println("Error is "+e.getMessage());
        }
    }
}
