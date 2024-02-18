import java.util.Scanner;

public class FindCategory
{
    public static void main(String[] args) {
        System.out.println("Enter your marks ");
        Scanner input=new Scanner(System.in);
        int marks=input.nextInt();
        String category=marks>=80?"High":(marks>=50?"Moderate":"Low");
        System.out.println("Your category is "+category);
    }
}
