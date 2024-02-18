import java.util.Scanner;
public class BankAccountSystem
{
    Scanner input=new Scanner(System.in);
    private int accountNumber,balence;
    private String customerName;

    BankAccountSystem(String customerName,int accountNumber){
        this.customerName=customerName;
        this.accountNumber=accountNumber;
    }
    public void deposit(){
        System.out.printf("Enter your amount %s ",customerName);
        balence=input.nextInt();
        System.out.println("Now, Your balance is "+balence);
    }
    public void withdraw(){
        System.out.println("Enter your amount to withdraw");
        int withrawAmount = input.nextInt();
        if(balence>withrawAmount){
            balence=balence-withrawAmount;
            System.out.println("Your withraw success , Now your balance is "+balence);
        }
        else{
            System.out.println("enter valid amount");
        }
    }
    public static void main(String[] args) {
        BankAccountSystem c1=new BankAccountSystem("Neeraj",989898);
        c1.deposit();
        c1.withdraw();
    }
}
