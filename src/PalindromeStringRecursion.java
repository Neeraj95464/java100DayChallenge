import java.util.Scanner;

public class PalindromeStringRecursion
{
    boolean isPalindrome(String name){
        int last=name.length()-1;
        if(name.length()==1){
            System.out.println("Yes this is palindrome");
            return true;
        }
        if(name.charAt(0)!=name.charAt(last)){
           return false;
        }
        String newString=name.substring(1,last);
        return isPalindrome(newString);
    }
    public static void main(String[] args) {
        System.out.println("Enter your string ");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        PalindromeStringRecursion p=new PalindromeStringRecursion();
        System.out.println(p.isPalindrome(name));
    }
}
