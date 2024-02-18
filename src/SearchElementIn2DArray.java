import java.util.Scanner;

public class SearchElementIn2DArray
{
    public static void main(String[] args) {
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Please Enter Your Number Which You Want To Search ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(num==array[i][j]){
                    System.out.println("Yes, This number is found in this array ");
                    break;
                }
            }
        }
    }
}
