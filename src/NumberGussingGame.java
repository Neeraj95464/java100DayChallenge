import java.util.Scanner;

public class NumberGussingGame
{
    public static void main(String[] args) {
        boolean isTrue=false;
        do{
            System.out.println("Enter your number ");
            Scanner input=new Scanner(System.in);
            int num=input.nextInt();
            int randomNum=(int) (Math.random()*10)+1;
            if(num==randomNum){
                isTrue=true;
            }
            else{
                isTrue=false;
            }
        }
        while (!isTrue);
        System.out.println("Yes , You guessed The Right Number");
    }
}
