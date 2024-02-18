import java.util.Scanner;

public class ThrowException
{
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name ");
        String name=input.nextLine();
        if(name.contains("-")){
            throw new IllegalAccessException("Name contain -");
//            throw new Exception("There is an error occured in your name input ");
        }
        else{
            System.out.println("Hii "+name);
        }
        System.out.println("end");
    }
}
