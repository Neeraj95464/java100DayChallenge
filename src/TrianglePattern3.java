import java.util.Scanner;

public class TrianglePattern3
{
    public static void main(String[] args) {
        System.out.println("Enter your number to know see Triangle ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
