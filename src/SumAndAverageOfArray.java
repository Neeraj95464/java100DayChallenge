public class SumAndAverageOfArray
{
    public static void main(String[] args) {
        int[] array=new int[5];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        int average=0;
        int sum=0;
        System.out.println("See out array Elements first ");
        for(int i=0;i< array.length;i++){
            System.out.print(array[i] + " ");
            sum=sum+array[i];
            average=sum/2;
        }
        System.out.println("now , sum is "+sum);
        System.out.println("And , average is "+average);
    }
}
