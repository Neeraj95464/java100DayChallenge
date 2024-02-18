import java.util.Scanner;

public class Varargs {
    int add(int... value){
        int sum=0;
        for (int i : value) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Varargs obj1=new Varargs();
        int sum=obj1.add(3,4,2,2,1,3,4);
        System.out.println("your sum is "+sum);
    }
}
