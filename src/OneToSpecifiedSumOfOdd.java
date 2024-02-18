import java.util.Scanner;

public class OneToSpecifiedSumOfOdd
{
    public static void main(String[] args) {
        System.out.println("Enter your number to know Addition ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int sum=0;
        for(int i=1;i<=num;i+=2){
            sum +=i;
        }
        System.out.println("your sum is "+sum);
    }
}
