public class PalindromeArray
{
    public static void main(String[] args) {
        int[] array={1, 2, 3,4, 5 ,4,3 ,2, 1};
        int i=0;
        int j=array.length-1;
        while (i!=j){
            if(array[i]!=array[j]){
                System.out.println("Array is not palindrome ");
                break;
            }
            i++;
            j--;
        }
    }
}
