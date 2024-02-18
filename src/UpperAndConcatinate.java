import java.util.Scanner;

public class UpperAndConcatinate
{
    public static void main(String[] args) {
        System.out.println("Enter your name & Name1 ");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        String name1=input.nextLine();

        System.out.println(name+name1);
        System.out.println(name.toUpperCase() + " "+name1.toUpperCase());
    }
}
