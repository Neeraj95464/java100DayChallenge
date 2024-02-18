import java.util.Scanner;

public class ToStringMethod
{
    @Override
    public String toString() {
        System.out.println("Enter your name & age ");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        int age=input.nextInt();
        return name+" "+age;
    }
    public static void main(String[] args) {
        ToStringMethod toStringMethod=new ToStringMethod();
        System.out.println(toStringMethod.toString());
    }
}
