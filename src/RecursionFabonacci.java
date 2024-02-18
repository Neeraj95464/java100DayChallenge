import java.util.Scanner;

public class RecursionFabonacci {
    int first=-1;
    int second=1;
    int nextNumber=0;
    int recursion(int num){
        if(num<nextNumber){
            return 0;
        }
        else{
            nextNumber=first+second;
            first=second;
            second=nextNumber;
            System.out.printf(" %d  ",nextNumber);
            return recursion(num);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        RecursionFabonacci re=new RecursionFabonacci();
        re.recursion(num);
    }
}
