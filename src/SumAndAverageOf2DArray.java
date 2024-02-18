import java.util.Scanner;

public class SumAndAverageOf2DArray
{
    public static void main(String[] args) {
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        int average=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum=sum+array[i][j];
                average=sum/2;
            }
        }
        System.out.println("sum is "+sum +" average is "+ average);
    }
}
