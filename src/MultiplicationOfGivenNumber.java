import java.util.Scanner;

public class MultiplicationOfGivenNumber {
    public static void main(String[] args) {
        System.out.println("Enter your number to know multiplication ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(num +" * " +i +" = "+ num*i);
            i++;
        }
    }
}
