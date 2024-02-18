import java.util.Scanner;

public class TrianglePattern
{
    public static void main(String[] args) {
        System.out.println("Enter your number to know see Triangle ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
